package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class q7Test {
    private static q7 q7test;

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q7test = null;

    }

    @Test
    public void checkData() {
        q7test = new q7("Himanshu", "Singhal",21,5305);
        assertEquals("Himanshu", q7test.getFirstName());
        assertEquals("Singhal", q7test.getLastName());
        assertEquals(21, q7test.getAge());
        assertEquals(5305, q7test.getSalary());
    }

}
