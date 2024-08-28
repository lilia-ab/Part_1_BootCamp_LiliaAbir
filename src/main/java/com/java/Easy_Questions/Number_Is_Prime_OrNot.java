package com.java.Easy_Questions;

public class Number_Is_Prime_OrNot {

	public static void main(String[] args) {
		int n=9;
		int c = 0;

	    
	    if (n ==0 || n ==1)
	      {
		System.out.println ("The Number " + n + " is not prime");
		
	      }
	    
	    for (int i = 1; i <= n; i++)
	      {
		if (n % i == 0)
		  c += 1;
	      }

	    
	    if (c > 2)
	      System.out.println ("The Number " + n + " is not prime");

	    else
	      System.out.println ("The Number " + n + " is prime");
	  }

	}


