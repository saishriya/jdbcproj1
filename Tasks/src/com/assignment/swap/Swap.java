package com.assignment.swap;
import java.util.*; 

public class Swap {  
  
    public static void main(String[] args) {  
       int x, y, t; 
       
       System.out.println("Enter the value of X and Y"); 
       Scanner sr = new Scanner(System.in);
	x = sr.nextInt(); 
       y = sr.nextInt(); 
       System.out.println("before swapping: "+x +" "+ y); 
      
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
    }    
}  


