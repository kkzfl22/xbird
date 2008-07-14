/*
 * @(#)$Id: ErrorCodes.java 3619 2008-03-26 07:23:03Z yui $
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
package xbird.xquery.misc;

import xbird.util.resource.MessageFormatter;

/**
 * 
 * <DIV lang="en"></DIV>
 * <DIV lang="ja"></DIV>
 * 
 * @author Makoto YUI (yuin405+xbird@gmail.com)
 * @link http://www.w3.org/TR/xquery/#id-errors
 */
public final class ErrorCodes {

    public static final String XPTY = "err:XPTY";
    public static final String XPDY = "err:XPDY";

    private static final MessageFormatter bundle = new MessageFormatter(ErrorCodes.class.getResourceAsStream("ErrorCode.properties"));

    /** Restricts instantiation. */
    private ErrorCodes() {}

    public static final String getDetailedMessage(String errCode) {
        final String msg = bundle.getMessage(errCode);
        return (msg == errCode) ? errCode : "[" + errCode + "] " + bundle.getMessage(errCode);
    }

    public static final String getMessage(String errCode) {
        final String msg = bundle.getMessage(errCode);
        return (msg == errCode) ? errCode : "[" + errCode + "]";
    }

}
