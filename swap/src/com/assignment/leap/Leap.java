package com.assignment.leap;
import java.util.*;


/**
 * @author pondu
 *
 */
public class Leap {
	public static void main(String[] args) {
		int y;
		
		System.out.println("Enter the year:");
		Scanner sr = new Scanner(System.in);
		y=sr.nextInt();
		
		if (y % 4 ==0 && y % 100!=0)
		{ 
	 	System.out.println(+y +" is a leap year");
		}
		
			else {
				System.out.println(+y +" is not a leap year"); 
				}
		}
			
		
	}


