package com.alan.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }


    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     */
    public void testApp() {
        assertTrue(true);
    }
}
