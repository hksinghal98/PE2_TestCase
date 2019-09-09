package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class q3Test {
    private static q3 q3test;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        q3test = new q3();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q3test = null;

    }

    @Test
    public void testCheckEven() {

        assertEquals(true, q3test.checkEven(16));
        assertEquals(false, q3test.checkEven(63));
        assertEquals(false, q3test.checkEven(55));
    }

}
