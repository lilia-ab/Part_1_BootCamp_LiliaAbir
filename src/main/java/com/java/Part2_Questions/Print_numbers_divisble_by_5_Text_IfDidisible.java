package com.java.Part2_Questions;

public class Print_numbers_divisble_by_5_Text_IfDidisible {

	public static void main(String[] args) {
		for(int i =1;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i + " divisible by 5");
			}
			else
				System.out.println(i);
		}

	}

}
