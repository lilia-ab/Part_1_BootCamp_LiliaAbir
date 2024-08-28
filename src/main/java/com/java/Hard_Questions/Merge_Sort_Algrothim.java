package com.java.Hard_Questions;

import java.util.Arrays;

public class Merge_Sort_Algrothim {
	  void merge(int NumberList[], int Min, int Mid, int Max)
	    {
	        int n1 = Mid - Min + 1;
	        int n2 = Max - Mid;

	        int L[] = new int[n1];
	        int R[] = new int[n2];

	        for (int i = 0; i < n1; ++i)
	            L[i] = NumberList[Min + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = NumberList[Mid + 1 + j];
	        
	        int i = 0, j = 0;

	        int k = Min;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	            	NumberList[k] = L[i];
	                i++;
	            }
	            else {
	            	NumberList[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	        	NumberList[k] = L[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	        	NumberList[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    void Sort(int NumberList[], int Min, int Max)
	    {
	        if (Min < Max) {
	            int Mid = (Min + Max) / 2;

	            Sort(NumberList, Min, Mid);
	            Sort(NumberList, Mid + 1, Max);

	            merge(NumberList, Min, Mid, Max);
	        }
	    }
	public static void main(String[] args) {
		int NumberList[] = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Given Array");
        System.out.println(Arrays.toString(NumberList));

        // Calling of Merge Sort
        Merge_Sort_Algrothim MergeSort = new Merge_Sort_Algrothim();
        MergeSort.Sort(NumberList, 0, NumberList.length - 1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(NumberList));

	}

}
