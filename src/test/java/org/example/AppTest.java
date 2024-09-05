package org.example;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {

    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before all tests");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After all tests");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before each test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After each test");
    }

    @Test
    public void testApp() {
        assertTrue(true);
    }
}

