package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.test.TestSuite.logger;

public class XTest2 {
	
    @Test
    public void test21() {
    	logger.info("test21:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test22() {
    	logger.info("test22:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test23() {
    	logger.info("test23:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test24() {
    	logger.info("test24:id=" + Thread.currentThread().getId() );
    }
    
    @Test
    public void test25() {
    	logger.info("test25:id=" + Thread.currentThread().getId() );
    }
    
    @BeforeClass
    public static void beforeClass() {
    	logger.info("XTest2:beforeClass");
    }
    
    @Before
    public void setUp() {
    	logger.info("XTest2:setUp");
    }
    
    @After
    public void tearDown() {
    	logger.info("XTest2:tearDown");
    }

    @AfterClass
    public static void afterClass() {
    	logger.info("XTest2:afterClass");
    }

}