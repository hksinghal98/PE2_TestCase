package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class q4Test {
    private static q4 q4test;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        q4test = new q4();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q4test = null;

    }

    @Test
    public void testCheckSalary() {

        assertEquals(1560.34, q4test.setSalary(1560.34));
    }
    @Test
    public void testCheckName() {

        assertEquals("Himanshu", q4test.setName("Himanshu"));
    }
    @Test
    public void testCheckAge() {

        assertEquals(20, q4test.setAge(20));
    }
}
