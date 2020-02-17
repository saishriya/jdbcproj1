package com.number.util;

import java.util.Scanner;

public class ApplicationUtils {
	

	public static void main(String[] args) {

		//Average();
		}

	protected void fact(int input) {
		int factorial = 1;
		for (int i = 1; i <= input; i++)
			factorial = factorial * i;
		System.out.println(+factorial);
	}

 /////////////////////////////////////////////
 
	protected void fibonacci(int input) {

		{
			int n1 = 0, n2 = 1, n3;
			System.out.print(n1 + " " + n2);
			for (int i = 2; i < input; i++) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}
		}
	}
 //////////////////////////
		  
	protected void gcdo(int input, int input1) {
		int gcd = 1;
		for (int i = 1; i <= input && i <= input1; i++) {
			if (input % i == 0 && input1 % i == 0)
				gcd = i;
		}
		System.out.printf("GCD of %d and %d is: %d", input, input1, gcd);
	}
 //////////////////////////////////////
	protected void reverse(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}
 ////////////////////////////////////////////////////

	protected void power(int base, int exp) {
		int value = 1;
		for (int i = 1; i <= exp; i++)
			value = value * base;
		System.out.println(value);
	}
 ////////////////////////////////////////////////////////
 
	protected void palindrome(int number) {
		int remainder, sum = 0;
		int temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println(+sum + "is a palindrome");
	}
////////////////////////////////////////////////////////////////
	protected void prime(int number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)

				flag = true;
			break;
		}
		if (flag == false)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}
 //////////////////////////////////////////////////////////////////
 
 
	protected void primeInterval(int n1, int n2) {
		while (n1 < n2) {
			boolean flag = false;

			for (int i = 2; i <= n1 / 2; i++) {
				if (n1 % i == 0)
					flag = true;
				break;
			}
			if (flag == false)
				System.out.println(n1);
			n1++;

		}
	}
 
	
 }









 

	 
 
 
		 
 
 
		
	
