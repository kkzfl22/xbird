/*
 * @(#)$Id: Preceding.java 3619 2008-03-26 07:23:03Z yui $
 *
 * Copyright 2006-2008 Makoto YUI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Makoto YUI - initial implementation
 */
package xbird.xquery.expr.path.axis;

import xbird.xquery.DynamicError;
import xbird.xquery.XQueryException;
import xbird.xquery.dm.value.*;
import xbird.xquery.dm.value.sequence.*;
import xbird.xquery.expr.path.NodeTest;
import xbird.xquery.meta.DynamicContext;
import xbird.xquery.meta.IFocus;

/**
 * 
 * <DIV lang="en"></DIV>
 * <DIV lang="ja"></DIV>
 * 
 * @author Makoto YUI (yuin405+xbird@gmail.com)
 */
public final class Preceding extends ReverseAxis {
    private static final long serialVersionUID = -822629243344259173L;

    public Preceding(NodeTest test) {
        super(PRECEDING, test);
    }

    public Sequence<? extends Item> eval(Sequence<? extends Item> contextSeq, DynamicContext dynEnv)
            throws XQueryException {
        if(contextSeq == null) {
            throw new DynamicError("err:XPDY0002", "ContextItem is not set");
        }
        final INodeSequence<XQNode> src = ProxyNodeSequence.wrap(contextSeq, dynEnv);
        final IFocus<XQNode> srcItor = src.iterator();
        if(srcItor.hasNext()) {
            final XQNode n = srcItor.next();
            if(srcItor.hasNext()) {
                srcItor.closeQuietly();
                reportError("err:XPTY0020", "Context item is expected to be a node, but was node sequence.");
            }
            srcItor.closeQuietly();
            return new PrecedingEmurationSequence(n, _nodeTest, dynEnv);
        }
        srcItor.closeQuietly();
        return NodeSequence.<XQNode> emptySequence();
    }

    private static final class PrecedingEmurationSequence extends AxisEmurationSequence {
        private static final long serialVersionUID = -1873219793481043576L;

        private final NodeTest filterNodeTest;
        private final long parentId;

        public PrecedingEmurationSequence(XQNode baseNode, NodeTest nodeTest, DynamicContext dynEnv) {
            super(baseNode, dynEnv);
            this.filterNodeTest = nodeTest;
            final XQNode pa = baseNode.parent();
            this.parentId = pa == null ? 0 : pa.getPosition();
        }

        public boolean next(IFocus<XQNode> focus) throws XQueryException {
            XQNode curNode = focus.getContextItem();
            while(curNode != null) {
                curNode = curNode.preceding(parentId); // TODO REVIEWME
                if(filterNodeTest.accepts(curNode)) {
                    focus.setContextItem(curNode);
                    return true;
                }
            }
            return false;
        }
    }

}