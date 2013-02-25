package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Suite.class)
@SuiteClasses( { XTest1.class, XTest2.class } )
public class TestSuite {
	
	protected static Logger logger = LoggerFactory.getLogger( "JUnit" );

    @BeforeClass
    public static void beforeClass() {
    	logger.info("TestSuite:beforeClass");
    }
    
    @Before
    public void setUp() { // not called by JUnit runner?
    	logger.info("TestSuite:setUp");
    }
    
    @Test
    public void suite() { // not called by JUnit runner?
    	logger.info("TestSuite:suite");
    }
    
    @After
    public void tearDown() { // not called by JUnit runner?
    	logger.info("TestSuite:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	logger.info("TestSuite:afterClass");
    }

}
