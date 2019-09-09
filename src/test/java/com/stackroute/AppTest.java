package com.stackroute;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static App dataMunger;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dataMunger = new App();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dataMunger = null;

    }

    @Test
    public void testCheckPelindrome() {

        assertEquals("pelindrome", dataMunger.checkPelindrome("abcba"));
        assertEquals("", dataMunger.checkPelindrome(""));
    }

}
