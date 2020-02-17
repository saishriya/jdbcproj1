package com.number.util;

public class FactorialNumber {
	

	public void factorialNumber(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact = fact * i;
		//return fact;
		System.out.println(fact);
		
		

	}

	public static void main(String[] args) {
		new FactorialNumber().factorialNumber(8);
	
		
	}
}