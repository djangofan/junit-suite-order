package com.test;

import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class StaticUtils {
	
	protected Logger classlogger = LoggerFactory.getLogger( getClass() );
	protected static Logger staticlogger = LoggerFactory.getLogger( StaticUtils.class );
	protected static PrintStream log = System.out;
	
	public static void waitTimer( int units, int mills ) {
		// number of units of time * mills in length for each time unit
		try {
			Thread.currentThread();		
			int x = 0;
			while( x < units ) {
				Thread.sleep( mills );
				x = x + 1;
			}
		} catch ( InterruptedException ex ) {
			ex.printStackTrace();
		}	
	}
	
}
