package com.assignment.oddeven;
import java.util.*;

public class Oddeven {
	public static void main(String args[]) {
	    int n;
	    
	    System.out.println("Enter a number");
        Scanner sr = new Scanner(System.in);
	    n = sr.nextInt();

	    if ( n % 2 == 0 )
	        System.out.println(+n +" is even");
	     else
	        System.out.println(+n +" is odd");
	  }

}
