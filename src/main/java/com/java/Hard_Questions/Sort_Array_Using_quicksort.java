package com.java.Hard_Questions;

import java.util.Arrays;

public class Sort_Array_Using_quicksort {
	
	 int Partition(int NumberList[], int Min, int Max)
	 {
	     int pivot = NumberList[Max]; 
	     int i = (Min-1); 
	     for (int j=Min; j<Max; j++)
	     {
	         if (NumberList[j] <= pivot)
	         {
	             i++;
	
	             int temp = NumberList[i];
	             NumberList[i] = NumberList[j];
	             NumberList[j] = temp;
	         }
	     }
	
	     int temp = NumberList[i+1];
	     NumberList[i+1] = NumberList[Max];
	     NumberList[Max] = temp;
	
	     return i+1;
	 }
	
	 void SortList(int NumberList[], int Min, int Max)
	 {
	     if (Min < Max)
	     {
	         int PL = Partition(NumberList, Min, Max);
	
	         SortList(NumberList, Min, PL-1);
	         SortList(NumberList, PL+1, Max);
	     }
	 }
	
			
			
		    public static void main(String[] args) {
		        int NumberList[] = {7, -5, 3, 2, 1, 0, 45};
		        int Len = NumberList.length;
	
		        Sort_Array_Using_quicksort Sort = new Sort_Array_Using_quicksort();
		        Sort.SortList(NumberList, 0, Len-1);
	
		        System.out.println(Arrays.toString(NumberList));
		}

}
