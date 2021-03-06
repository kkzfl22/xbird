/*
 * @(#)$Id: NumericOpTest4.java 3619 2008-03-26 07:23:03Z yui $
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
package xbird.xquery.operator.math;

import xbird.xquery.DynamicError;
import xbird.xquery.operator.math.NumericOp;

public class NumericOpTest4 {

    @org.junit.Test(expected = DynamicError.class)
    public void testSubtractL() throws DynamicError {
        NumericOp.Exec.subtractL(Long.MIN_VALUE, 1L);
    }

    @org.junit.Test
    public void testSubtractLMinValue() throws DynamicError {
        NumericOp.Exec.subtractL(Long.MIN_VALUE + 1, 1L);
    }

    @org.junit.Test(expected = DynamicError.class)
    public void testAddLMaxValue() throws DynamicError {
        NumericOp.Exec.addL(Long.MAX_VALUE, 1L);
    }

    @org.junit.Test(expected = DynamicError.class)
    public void testAddLMaxValue2() throws DynamicError {
        NumericOp.Exec.addL(Long.MAX_VALUE, Long.MAX_VALUE);
    }
}
