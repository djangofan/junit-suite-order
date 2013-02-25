package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XTest1 {
	
    @Test
    public void test1() {
    	System.out.println("XTest1");
    }
    
    @BeforeClass
    public static void beforeClass() {
    	System.out.println("XTest1:beforeClass");
    }
    
    @Before
    public void setUp() {
    	System.out.println("XTest1:setUp");
    }
    
    @After
    public void tearDown() {
    	System.out.println("XTest1:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	System.out.println("XTest1:afterClass");
    }

}