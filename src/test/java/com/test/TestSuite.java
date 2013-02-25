package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { XTest1.class, XTest2.class } )
public class TestSuite extends StaticUtils {

    @BeforeClass
    public static void beforeClass() {     	
    	staticlogger.info("START");
    	staticlogger.info("TestSuite:beforeClass");
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
    	staticlogger.info("TestSuite:afterClass");
    }
    
}
