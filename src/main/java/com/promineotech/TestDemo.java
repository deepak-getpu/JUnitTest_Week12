package com.promineotech;

import java.util.Random;

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
	
	public int  randomNumberSquared() {
		 return (getRandomInt() * getRandomInt());
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1; 
	}
	
	private int randomNumberSquare() {
		return (getRandomInt() * getRandomInt());
	}
}


