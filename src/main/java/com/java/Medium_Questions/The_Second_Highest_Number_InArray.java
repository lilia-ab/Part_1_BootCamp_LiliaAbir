package com.java.Medium_Questions;

public class The_Second_Highest_Number_InArray {

	public static void main(String[] args) {
		
		
		int a[]={1,9,5,8,3,2};  
		  
		System.out.println("Second Largest: "+secondLargest(a,6));  
		 

	}
	public static int secondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
}
