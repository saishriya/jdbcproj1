package com.assignment.sum;
import java.util.*;

public class Sum {
	public static void main(String[] args) {
		int a,b,sum;
		System.out.println("Enter two integers:");
		
		Scanner Sr = new Scanner(System.in);
		a=Sr.nextInt();
		b=Sr.nextInt();
		
		sum= a+b;
		System.out.println(+sum + "is the Sum");
		

	}
}
