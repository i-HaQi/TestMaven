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
     *so cold
     * come on
     */
    public AppTest(String testName) {
        super(testName);
    }


    public static Test suite() {
        

        int a=3;
        return new TestSuite(AppTest.class);
    }

    /**
     */
    public void testApp() {
        assertTrue(true);
    }
}
