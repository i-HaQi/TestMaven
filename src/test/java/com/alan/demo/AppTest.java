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
     *so cokld
     * come on
     */
    public AppTest(String testName) {
        super(testName);
    }


    public static Test suite() {

<<<<<<< HEAD
        int a=9;

=======
int a=7;
>>>>>>> e68ae36e6ba3c85b6f735a650c86dae25e37a5e9

        return new TestSuite(AppTest.class);
    }

    /**
     */
    public void testApp() {
        assertTrue(true);
    }
}
