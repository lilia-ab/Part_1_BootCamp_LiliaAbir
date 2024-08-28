package com.java.Hard_Questions;

public class Maximum_Subarray_sum {
	static int MaximumSubarraysum(int[] NumberList) {
        int Max = Integer.MIN_VALUE, CurrentMax = 0;

        for (int i = 0; i < NumberList.length; i++) {
        	CurrentMax += NumberList[i];

            Max = Math.max(Max, CurrentMax);

            CurrentMax = Math.max(CurrentMax, 0);
        }
        return Max;
    }

	public static void main(String[] args) {
		int[] NumberList = {7, -5, 3, 2, 1, 0, 4,-5};
        System.out.println("Maximum contiguous sum is " + MaximumSubarraysum(NumberList));
	}

}
