package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Gradle cannot fork this class because it appears as one class.
 * @author austenjt *
 */
@RunWith(Suite.class)
@SuiteClasses( { XTest1.class, XTest2.class, XTest3.class } )
public class TestSuite extends StaticUtils {

    @BeforeClass
    public static void beforeClass() {     	
    	staticlogger.info( "TestSuite:beforeClass" );
    	log.println( "TestSuite:beforeClass" );
    }
    
    @Before
    public void setUp() {
    	classlogger.info("TestSuite:setUp");
    	log.println( "TestSuite:setUp" );
    }
    
    @Test
    public void suite() {
    	classlogger.info( "TestSuite:suite" );
    	log.println( "TestSuite:suite" );
    }
    
    @After
    public void tearDown() {
    	classlogger.info("TestSuite:tearDown");
    	log.println( "TestSuite:tearDown" );
    }

    @AfterClass
    public static void afterClass() {
    	staticlogger.info("TestSuite:afterClass");
    	log.println( "TestSuite:afterClass" );
    }
    
}
