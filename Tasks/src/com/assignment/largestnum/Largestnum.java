package com.assignment.largestnum;
import java.util.*;


public class Largestnum {
	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("Enter a,b,c:");
		Scanner sr= new Scanner(System.in);
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		
		if  (a>b && a>c) { 
			System.out.println(+a +" is the largest");
			}
		else if (b>a && b>c) { 
			System.out.println(+b +" is the largest");
			}
		else if (c>a && c>b) { 
			System.out.println(+c +" is the largest");
			}
	}
	

}
