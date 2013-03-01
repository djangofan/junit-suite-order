package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XTest2 extends StaticUtils{
	
    @Test
    public void test21() {
    	classlogger.info( "test21" );
    	log.println( "test21" );
    	waitTimer(32, 250); // 8 second
    }
    
    @Test
    public void test22() {
    	classlogger.info( "test22" );
    	log.println( "test22" );
    	waitTimer(1, 250); // 1 second
    }
    
    @Test
    public void test23() {
    	classlogger.info( "test23" );
    	log.println( "test23" );
    	waitTimer(4, 250); // 1 second
    }
    
    @Test
    public void test24() {
    	classlogger.info( "test24" );
    	log.println( "test24" );
    	waitTimer(5, 250); // 1.25 seconds
    }
    
    @Test
    public void test25() {
    	classlogger.info( "test25" );
    	log.println( "test25" );
    	waitTimer(1, 250); // .25 second
    }
    
    @BeforeClass
    public static void beforeClass() {
    	staticlogger.info( "XTest2:beforeClass" );
    	log.println( "XTest2:beforeClass" );
    }
    
    @Before
    public void setUp() {
    	classlogger.info("XTest2:setUp");
    	log.println( "XTest2:setUp" );
    }
    
    @After
    public void tearDown() {
    	classlogger.info("XTest2:tearDown");
    	log.println( "XTest2:tearDown" );
    }

    @AfterClass
    public static void afterClass() {
    	staticlogger.info( "XTest2:afterClass" );
    	log.println( "XTest2:afterClass" );
    }

}