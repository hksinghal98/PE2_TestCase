package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class q2Test {
    private static q2 q2test;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        q2test = new q2();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q2test = null;

    }

    @Test
    public void testCheckPower() {

        assertEquals(true, q2test.checkPower(16));
        assertEquals(false, q2test.checkPower(63));
        assertEquals(false, q2test.checkPower(0));
    }

}
