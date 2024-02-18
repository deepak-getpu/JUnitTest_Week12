package com.promineotech;

public class TestDemo {
	
	public int addPostive(int a, int b) {
	if(a > 0 && b > 0) {
		return a + b;
	} else 
		throw new IllegalArgumentException("Both parameters must be positive.");
	}
}


