package com.java.Hard_Questions;
import java.util.*;

public class Binary_Search_Algorithm_Rotated_Sort_Array {
	static int Minimum(Integer[] NumberList) {
        int Min = 0;
        int Max = NumberList.length - 1;
        while (NumberList[Min] > NumberList[Max]) {
            int Mid = (Min + Max) >>> 1;
            if (NumberList[Mid] > NumberList[Max]) {
            	Min = Mid + 1;
            } else {
            	Max = Mid;
            }
        }
        return Min;
    }
	public static void main(String[] args) {
        Integer[]  NumberList= {7, -5, 3, 2, 1, 0, 45};

        for (int i = 0; i < NumberList.length; i++) {
            System.out.print(Arrays.toString(NumberList));
            int minIndex = Minimum(NumberList);
            System.out.println(" Min is " + NumberList[minIndex] + " at " + minIndex);
            Collections.rotate(Arrays.asList(NumberList), 1);

	}

}
}