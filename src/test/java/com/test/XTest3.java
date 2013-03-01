package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XTest3 extends StaticUtils {
	
    @Test
    public void test31() {
    	classlogger.info( "test31" );
    	log.println( "test31" );
    	waitTimer(4, 250); // 1 second
    }
    
    @Test
    public void test32() {
    	classlogger.info( "test32" );
    	log.println( "test32" );
    	waitTimer(11, 250); // 2.75 seconds
    }
    
    @Test
    public void test33() {
    	classlogger.info( "test33" );
    	log.println( "test33" );
    	waitTimer(16, 250); // 4 seconds
    }
    
    @Test
    public void test34() {
    	classlogger.info( "test34" );
    	log.println( "test34" );
    	waitTimer(1, 250); // 1/4 second
    }
    
    @Test
    public void test35() {
    	classlogger.info( "test35" );
    	log.println( "test35" );
    	waitTimer(2, 250); // 1/2 second
    }
    
    @BeforeClass
    public static void beforeClass() {
    	staticlogger.info( "XTest3:beforeClass" );
    	System.out.println( "XTest3:beforeClass" );
    }
    
    @Before
    public void setUp() {
    	classlogger.info("XTest3:setUp");
    }
    
    @After
    public void tearDown() {
    	classlogger.info("XTest3:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	staticlogger.info( "XTest3:afterClass" );
    	System.out.println( "XTest3:afterClass" );
    }

}