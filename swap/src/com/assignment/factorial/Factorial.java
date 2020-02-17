package com.assignment.factorial;

import java.util.Scanner;

public class Factorial {
	

	public static void main(String[] args) {

		Average();

	
	}
 private static void fact() {
		int N;
		int factorial=1;
		
		System.out.println("Enter number:");
		Scanner Sr = new Scanner (System.in);
		N=Sr.nextInt();
		
		for (int i = 1; i <=N ; i++) {
			factorial = factorial * i;
			}
		System.out.println(+factorial);
		}
			
 private static void fibonacci() {
	
		  {    
		  int n1=0,n2=1,n3;
		  int count;
		  
		  System.out.println("Enter count of the series");
		  Scanner sr= new Scanner (System.in);
		  count=sr.nextInt();
		  
		  
		  System.out.print(n1+" "+n2);    
		     
		  for(int i=2; i <count ;i++)   
		  {    
		   n3=n1+n2;    
		   System.out.print(" "+n3);    
		   n1=n2;    
		   n2=n3;    
		  }   }
		  } 

 private static void gcdo() {
	 int n1, n2, gcd =1;
	 
	 System.out.println("Enter two numbers");
	 Scanner Sr= new Scanner(System.in);
	 n1=Sr.nextInt();
	 n2=Sr.nextInt();
	  for(int i = 1; i <= n1 && i <= n2; i++)
     {
         if(n1%i==0 && n2%i==0)
             gcd = i;
     }

     System.out.printf("GCD of %d and %d is: %d", n1, n2, gcd);

 }
 
 private static void reverse() {
	 int num;
	 int rev=0;
	 
	 System.out.println("Enter a number");
	 Scanner Sr= new Scanner(System.in);
	 num=Sr.nextInt();
	 
	 while(num>0) 
	 {
		 rev= rev*10 + num % 10;
		 num= num/10; 
	 }
	 System.out.println("The reverse is " +rev);
	  //return rev;
}

 private static void power() {
	 int exp, base; 
	 int value;
	 Scanner Sr= new Scanner(System.in);
	 
	 System.out.println("Enter base");
	 base=Sr.nextInt();
	
	 System.out.println("Enter exp");
	 exp=Sr.nextInt();
	 
	 value=1;
	  
	 for(int i=1; i <= exp ;i++)
	 {  
		value= value*base;
		 }
	 System.out.println(+value +" is the answer.");
 }
 
 
 private static void palindrome() {
	 int number,remainder,sum=0,temp;  
	 
	 System.out.println("Enter the number");
	 Scanner Sr= new Scanner(System.in);
	 
	number=Sr.nextInt();
	
	   temp=number;    
	   
	  while(number>0){    
	   remainder =number%10;  
	   sum=(sum*10)+remainder;    
	   number=number/10;    
	  }    
	  if(temp==sum)    
	   System.out.println(+sum +"is a palindrome");    
	  else    
	   System.out.println(+sum +"not palindrome"); 
}

 private static void prime() {
	 int number;
	 System.out.println("Enter the number");
	 Scanner Sr= new Scanner(System.in);
	 number=Sr.nextInt();
	 
     boolean flag = false;
     for(int i = 2; i <= number/2; i++)
     {
         
         if(number % i == 0)
         {
             flag = true;
             break;
         }
     }
     if (flag==false)
         System.out.println(number + " is a prime number.");
     else
         System.out.println(number + " is not a prime number.");
 }
 
 private static void primeInterval() {
	 int n1,n2;
	 
	 Scanner Sr= new Scanner(System.in);
	 System.out.print("Enter the first interval");
	 n1=Sr.nextInt();
	 
	 System.out.print("Enter the second interval");
	 n2=Sr.nextInt();
	 
     while(n1<n2)
    	 {boolean flag = false;
     
    	 for(int i = 2; i <=  n1/2 ; i++)
     {
         if(n1 % i == 0)
         {
             flag = true;
             break;
         }
     } 
     if (flag==false)
         System.out.println(n1);
     n1++;
     
 } } 
 
 private static void Average(){
  int a[];
  int n; 
  int avg =0, sum = 0;
    Scanner Sr = new Scanner(System.in);
        System.out.print("Total no.of elements:");
        n = Sr.nextInt();
        
        n=a.length;
        
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = Sr.nextInt();
            sum = sum + a[i];
        }  
        System.out.println("Sum:"+sum);
        avg= sum/n;
        System.out.println("Avg:"+avg);
    
    }
 }









 

	 
 
 
		 
 
 
		
	
