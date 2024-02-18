package com.promineotech;

public class TestDemo {
	
	public static int addPositive(int a, int b) {
	if(a > 0 && b > 0) {
		return a + b;
	} else 
		throw new IllegalArgumentException("Both parameters must be positive.");
	}
	
	public static boolean isEven(int a) {
		if(a%2==0) { 
			return true;
		} else {
			return false;
		}		
	}
}


