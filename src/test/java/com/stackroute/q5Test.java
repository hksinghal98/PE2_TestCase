package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class q5Test {
    private static q5 q5test;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        q5test = new q5();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q5test = null;

    }

    @Test
    public void testCheckAvg() {

        assertEquals(2.75, q5test.findAverage(4, new int[]{1, 3, 5, 2}));

        assertEquals(3.00, q5test.findAverage(4, new int[]{1, 3, 5, 3}));
        assertEquals(0.00, q5test.findAverage(4, new int[]{1}));
    }
    @Test
    public void testCheckMin() {

        assertEquals(1, q5test.findMinimum(4, new int[]{1, 3, 5, 2}));

        assertEquals(3, q5test.findMinimum(4, new int[]{7, 3, 5, 3}));
        assertEquals(0, q5test.findMinimum(4, new int[]{1}));
    }

    @Test
    public void testCheckMax() {

        assertEquals(5, q5test.findMaximum(4, new int[]{1, 3, 5, 2}));

        assertEquals(7, q5test.findMaximum(4, new int[]{7, 3, 5, 3}));
        assertEquals(0, q5test.findMaximum(4, new int[]{1}));
    }

}
