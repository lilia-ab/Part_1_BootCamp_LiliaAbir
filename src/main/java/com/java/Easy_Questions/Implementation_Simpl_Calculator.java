package com.java.Easy_Questions;

import java.util.Scanner;

public class Implementation_Simpl_Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result ;
		System.out.println("Enter First Number");
		int a=scan.nextInt();
		System.out.println("Enter Second Number");
		int b=scan.nextInt();

		System.out.println("Choose The Operator");
		String opr =scan.next();

		switch(opr) {
		case "+" : result= a+b;
		System.out.println("The sum of two numbers is:  " + result);
		break;
		case "-" : 
			result= a-b;
			System.out.println("The difference between two numbers is: " + result);
			break;
		case "*":result= a*b;
		System.out.println("The Multiplication of Two Numbers is :  " + result);
		break;
		case"/": result= a/b;
		System.out.println("The division of Two Numbers is : " + result);
		break;
		
        case "dividebyzero":
		
			
		default: System.out.println("numbers can not divided by 0");
	
		}

	}

}
