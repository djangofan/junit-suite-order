package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XTest1 extends StaticUtils{
	
    @Test
    public void test11() {
    	String msg = "test11";
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(4, 250); // 1 second
    }
    
    @Test
    public void test12() {
    	String msg = "test12";
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(12, 250); // 3 second
    }
    
    @Test
    public void test13() {
    	String msg = "test13";
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(16, 250); // 4 second
    }
    
    @Test
    public void test14() {
    	String msg = "test14";
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(1, 250); // 1 second
    }
    
    @Test
    public void test15() {
    	String msg = "test15";
    	logger.info( msg );
    	System.out.println( msg );
    }
    
    @BeforeClass
    public static void beforeClass() {
    	staticlogger.info("XTest1:beforeClass");
    }
    
    @Before
    public void setUp() {
    	logger.info("XTest1:setUp");
    }
    
    @After
    public void tearDown() {
    	logger.info("XTest1:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	staticlogger.info("XTest1:afterClass");
    }

}