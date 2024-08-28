package com.java.Medium_Questions;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int NumberList[] = { 75, 36, 8, 44, 17,15 };
		
		int len = NumberList.length; 
		  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < len - 1; i++) { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i + 1; j < len; j++) { 
                if (NumberList[j] < NumberList[min]) 
                    min = j; 
            } 
  
   
            int temp = NumberList[min]; 
            NumberList[min] = NumberList[i]; 
            NumberList[i] = temp; 
        } 
        System.out.println(Arrays.toString(NumberList));
	}

}
