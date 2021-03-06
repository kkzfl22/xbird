/*
 * @(#)$Id$
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
package xbird.util.struct;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 
 * <DIV lang="en"></DIV>
 * <DIV lang="ja"></DIV>
 * 
 * @author Makoto YUI (yuin405+xbird@gmail.com)
 */
public final class Pointer<T> implements Externalizable {
    private static final long serialVersionUID = 2317301064551955034L;

    private T _entity;

    public Pointer() {}

    public Pointer(T entity) {
        this._entity = entity;
    }

    public T get() {
        return _entity;
    }

    public T getAndSet(T t) {
        final T prev = _entity;
        this._entity = t;
        return prev;
    }

    public void set(T t) {
        this._entity = t;
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this._entity = (T) in.readObject();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(_entity);
    }

}
