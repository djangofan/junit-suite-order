package com.test;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

/**
 * Gradle is unable to display a report of the embedded classes in this test group
 * but it does at least run multithreaded.
 * @author austenjt *
 */
public class ParallelSuite extends StaticUtils {

	@Test
	public void runParallel() {
		
		// This run method may not be thread safe
		@SuppressWarnings("rawtypes")
		Class[] cls={XTest1.class,XTest2.class,XTest3.class };  
		 
	    //Parallel among classes  
	    JUnitCore.runClasses(ParallelComputer.classes(), cls);  
	 
	    //Parallel among methods in a class  
	    //JUnitCore.runClasses(ParallelComputer.methods(), cls);  
	 
	    //Parallel all methods in all classes  
	    //JUnitCore.runClasses(new ParallelComputer(true, true), cls);
	    
	}

}
