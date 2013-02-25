package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.test.TestSuite.*;

public class XTest2 {
	
    @Test
    public void test21() {
    	String msg = "test21:id=" + Thread.currentThread().getId();
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(32, 250); // 8 second
    }
    
    @Test
    public void test22() {
    	String msg = "test22:id=" + Thread.currentThread().getId();
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(1, 250); // 1 second
    }
    
    @Test
    public void test23() {
    	String msg = "test23:id=" + Thread.currentThread().getId();
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(4, 250); // 1 second
    }
    
    @Test
    public void test24() {
    	String msg = "test24:id=" + Thread.currentThread().getId();
    	logger.info( msg );
    	System.out.println( msg );
    }
    
    @Test
    public void test25() {
    	String msg = "test25:id=" + Thread.currentThread().getId();
    	logger.info( msg );
    	System.out.println( msg );
    	waitTimer(4, 250); // 1 second
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