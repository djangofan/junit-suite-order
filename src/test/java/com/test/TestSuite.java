package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ XTest1.class, XTest2.class})
public class TestSuite {

    @BeforeClass
    public static void beforeClass() {
    	System.out.println("TestSuite:beforeClass");
    }
    
    @Before
    public static void setUp() {
    	System.out.println("TestSuite:setUp");
    }
    
    @After
    public static void tearDown() {
    	System.out.println("TestSuite:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	System.out.println("TestSuite:afterClass");
    }

}