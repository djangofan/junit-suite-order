package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XTest2 {
	
    @Test
    public void test2() {
    	System.out.println("XTest2");
    }
    
    @BeforeClass
    public static void beforeClass() {
    	System.out.println("XTest2:beforeClass");
    }
    
    @Before
    public void setUp() {
    	System.out.println("XTest2:setUp");
    }
    
    @After
    public void tearDown() {
    	System.out.println("XTest2:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	System.out.println("XTest2:afterClass");
    }

}