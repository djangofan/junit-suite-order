package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.test.TestSuite.logger;

public class XTest1 {
	
    @Test
    public void test11() {
    	logger.info("test11:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test12() {
    	logger.info("test12:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test13() {
    	logger.info("test13:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test14() {
    	logger.info("test14:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test15() {
    	logger.info("test15:id=" + Thread.currentThread().getId() );
    }
    
    @BeforeClass
    public static void beforeClass() {
    	logger.info("XTest1:beforeClass");
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
    	logger.info("XTest1:afterClass");
    }

}