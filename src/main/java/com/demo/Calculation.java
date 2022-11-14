package com.demo;

public class Calculation {

	public int add( int x, int y ) {
		return x + y;
	}
	
	public int subtract( int x, int y ) {
		return x - y;
	}
	
	public int multiply( int x, int y ) {
		return x * y;
	}
	
	public int divide( int x, int y ) {
		return x / y;
	}
	
	public boolean check( int x, int y ) {
		if( x > y ) {
			return true;
		}
		else {
			return false;
		}
	}
}
