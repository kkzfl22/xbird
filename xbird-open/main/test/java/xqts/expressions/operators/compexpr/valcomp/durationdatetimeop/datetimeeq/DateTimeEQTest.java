/*
 * @(#)$Id: XQTSTest.template 946 2006-09-14 03:31:56Z yui $
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
package xqts.expressions.operators.compexpr.valcomp.durationdatetimeop.datetimeeq;

import junit.framework.TestCase;
import xqts.XQTSTestBase;

public class DateTimeEQTest extends TestCase {

    private static final String TEST_PATH = "((//ns:test-group[count(child::ns:test-group)=0])[62]//ns:test-case)";
    private static final String TARGET_XQTS_VERSION = "1.0.2";
    
    private final XQTSTestBase xqts;

    public DateTimeEQTest() {
    	super(DateTimeEQTest.class.getName());
        this.xqts = new XQTSTestBase(DateTimeEQTest.class.getName(), TARGET_XQTS_VERSION);
    }
    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args1() throws Exception {
        xqts.invokeTest(TEST_PATH + "[1]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args2() throws Exception {
        xqts.invokeTest(TEST_PATH + "[2]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args3() throws Exception {
        xqts.invokeTest(TEST_PATH + "[3]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args4() throws Exception {
        xqts.invokeTest(TEST_PATH + "[4]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args5() throws Exception {
        xqts.invokeTest(TEST_PATH + "[5]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args6() throws Exception {
        xqts.invokeTest(TEST_PATH + "[6]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args7() throws Exception {
        xqts.invokeTest(TEST_PATH + "[7]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args8() throws Exception {
        xqts.invokeTest(TEST_PATH + "[8]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args9() throws Exception {
        xqts.invokeTest(TEST_PATH + "[9]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args10() throws Exception {
        xqts.invokeTest(TEST_PATH + "[10]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args11() throws Exception {
        xqts.invokeTest(TEST_PATH + "[11]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args12() throws Exception {
        xqts.invokeTest(TEST_PATH + "[12]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args13() throws Exception {
        xqts.invokeTest(TEST_PATH + "[13]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args14() throws Exception {
        xqts.invokeTest(TEST_PATH + "[14]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args15() throws Exception {
        xqts.invokeTest(TEST_PATH + "[15]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args16() throws Exception {
        xqts.invokeTest(TEST_PATH + "[16]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args17() throws Exception {
        xqts.invokeTest(TEST_PATH + "[17]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args18() throws Exception {
        xqts.invokeTest(TEST_PATH + "[18]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args19() throws Exception {
        xqts.invokeTest(TEST_PATH + "[19]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpDateTimeEqual2args20() throws Exception {
        xqts.invokeTest(TEST_PATH + "[20]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ1() throws Exception {
        xqts.invokeTest(TEST_PATH + "[21]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ2() throws Exception {
        xqts.invokeTest(TEST_PATH + "[22]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ3() throws Exception {
        xqts.invokeTest(TEST_PATH + "[23]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ4() throws Exception {
        xqts.invokeTest(TEST_PATH + "[24]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ5() throws Exception {
        xqts.invokeTest(TEST_PATH + "[25]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ6() throws Exception {
        xqts.invokeTest(TEST_PATH + "[26]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ7() throws Exception {
        xqts.invokeTest(TEST_PATH + "[27]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ8() throws Exception {
        xqts.invokeTest(TEST_PATH + "[28]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ9() throws Exception {
        xqts.invokeTest(TEST_PATH + "[29]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ10() throws Exception {
        xqts.invokeTest(TEST_PATH + "[30]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ11() throws Exception {
        xqts.invokeTest(TEST_PATH + "[31]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ12() throws Exception {
        xqts.invokeTest(TEST_PATH + "[32]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ13() throws Exception {
        xqts.invokeTest(TEST_PATH + "[33]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ14() throws Exception {
        xqts.invokeTest(TEST_PATH + "[34]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ15() throws Exception {
        xqts.invokeTest(TEST_PATH + "[35]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ16() throws Exception {
        xqts.invokeTest(TEST_PATH + "[36]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ17() throws Exception {
        xqts.invokeTest(TEST_PATH + "[37]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ18() throws Exception {
        xqts.invokeTest(TEST_PATH + "[38]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ19() throws Exception {
        xqts.invokeTest(TEST_PATH + "[39]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ20() throws Exception {
        xqts.invokeTest(TEST_PATH + "[40]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ21() throws Exception {
        xqts.invokeTest(TEST_PATH + "[41]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ22() throws Exception {
        xqts.invokeTest(TEST_PATH + "[42]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ23() throws Exception {
        xqts.invokeTest(TEST_PATH + "[43]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ24() throws Exception {
        xqts.invokeTest(TEST_PATH + "[44]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ25() throws Exception {
        xqts.invokeTest(TEST_PATH + "[45]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ26() throws Exception {
        xqts.invokeTest(TEST_PATH + "[46]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ27() throws Exception {
        xqts.invokeTest(TEST_PATH + "[47]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ28() throws Exception {
        xqts.invokeTest(TEST_PATH + "[48]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ29() throws Exception {
        xqts.invokeTest(TEST_PATH + "[49]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ30() throws Exception {
        xqts.invokeTest(TEST_PATH + "[50]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ31() throws Exception {
        xqts.invokeTest(TEST_PATH + "[51]");
    }

    @org.junit.Test(timeout=300000)
    public void testKDateTimeEQ32() throws Exception {
        xqts.invokeTest(TEST_PATH + "[52]");
    }

}