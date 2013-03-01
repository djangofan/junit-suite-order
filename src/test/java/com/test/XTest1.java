package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XTest1 extends StaticUtils {
	
    @Test
    public void test11() {
    	classlogger.info( "test11" );
    	log.println( "test11" );
    	waitTimer(4, 250); // 1 second
    }
    
    @Test
    public void test12() {
    	classlogger.info( "test12" );
    	log.println( "test12" );
    	waitTimer(12, 250); // 3 seconds
    }
    
    @Test
    public void test13() {
    	classlogger.info( "test13" );
    	log.println( "test13" );
    	waitTimer(16, 250); // 4 seconds
    }
    
    @Test
    public void test14() {
    	classlogger.info( "test14" );
    	log.println( "test14" );
    	waitTimer(1, 250); // 1 second
    }
    
    @Test
    public void test15() {
    	classlogger.info( "test15" );
    	log.println( "test15" );
    }
    
    @BeforeClass
    public static void beforeClass() {
    	staticlogger.info( "XTest1:beforeClass" );
    	log.println( "XTest1:beforeClass" );
    }
    
    @Before
    public void setUp() {
    	classlogger.info("XTest1:setUp");
    }
    
    @After
    public void tearDown() {
    	classlogger.info("XTest1:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	staticlogger.info( "XTest1:afterClass" );
    	log.println( "XTest1:afterClass" );
    }

}