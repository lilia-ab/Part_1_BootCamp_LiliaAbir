package com.java.Medium_Questions;

public class Factorial_using_recursion {


	public static void main(String[] args) {

		int num=-1;
        System.out.println("The entered number is :"+num);
        if(num>=0) 
        {
          
           int fact=factorial(num);
           System.out.println("The factorial of the entered number is :"+fact);
        }
        else
        {
            System.out.println("Factorial not possible.");
            
        } 
		
		

	}
	public static int factorial(int num)
    {
        if(num==0)
        return 1;
        else if(num==1)
        return 1;
        else
        return num*factorial(num-1);        
    }

}
