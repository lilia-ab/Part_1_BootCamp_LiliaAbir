package com.java.Medium_Questions;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		int NumberList[] = { 75, 36, 8, 44, 17,15 };
		
		int n = NumberList.length; 
        for (int i = 1; i < n; ++i) { 
            int CurentNumber = NumberList[i]; 
            int j = i - 1; 
  
            // Move elements of arr[0..i-1], that are 
            // greater than key, to one position ahead 
            // of their current position 
            while (j >= 0 && NumberList[j] > CurentNumber) { 
            	NumberList[j + 1] = NumberList[j]; 
                j = j - 1; 
            } 
            NumberList[j + 1] = CurentNumber; 
        } 
        System.out.println(Arrays.toString(NumberList));
        

	}

}
