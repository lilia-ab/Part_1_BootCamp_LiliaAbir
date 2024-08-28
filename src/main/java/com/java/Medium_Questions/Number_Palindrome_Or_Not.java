package com.java.Medium_Questions;

public class Number_Palindrome_Or_Not {

	public static void main(String[] args) {
		
		int num = 1234, rev= 0, rem;
	    
	    
	    int originalNum = num;
	    
	    
	    while (num != 0) {
	      rem = num % 10;
	      rev= rev * 10 + rem;
	      num /= 10;
	    }
	    
	    
	    if (originalNum == rev) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }

	}


