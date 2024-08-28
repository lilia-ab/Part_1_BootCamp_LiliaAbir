package com.java.Medium_Questions;

import java.util.Arrays;

public class Bubble_Sort_algorithm {

	public static void main(String[] args) {
		
		Bubble_Sort_algorithm ob = new Bubble_Sort_algorithm();
	        int arr[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(arr));
	        ob.bubbleSort(arr);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(arr));     
		
		
		
	}
	 void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                  
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
}
