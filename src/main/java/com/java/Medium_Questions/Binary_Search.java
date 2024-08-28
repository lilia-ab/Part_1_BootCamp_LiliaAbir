package com.java.Medium_Questions;

public class Binary_Search {
	
	int binary_Search(int NumberList[], int Max, int NumberToSearch)
    {	int Min =0;
        while (Min <= Max) {
            int Mid = (Min + Max) / 2;
 
            // If the element is present at the
            // middle itself
            if (NumberList[Mid] == NumberToSearch) {
                return Mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1 
            } else if (NumberList[Mid] > NumberToSearch) {
            	Max = Mid - 1;
 
            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
            	Min = Mid + 1;
            }  
        }
 
        // We reach here when element is not present
        //  in array
        return -1;
    }

	public static void main(String[] args) {
		
		 Binary_Search ob = new Binary_Search();
		 
	        int NumberList[] = { 8, 15, 17, 36, 44, 75};
	        int len = NumberList.length;
	        int NumberToSearch = 17;
	        int result = ob.binary_Search(NumberList, len - 1, NumberToSearch);
	 
	        if (result == -1)
	            System.out.println("Element not in the list");
	        else
	            System.out.println("Element found at Itteration number "
	                               + result);
		
		

	}

}
