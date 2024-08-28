package com.java.Medium_Questions;

public class Count_The_Number_ofWords_in_a_given_string {

	public static void main(String[] args) {


        String  StringInPut= "number of words in a given string";
        String[] NumberOfWords; 

        if (StringInPut == null || StringInPut.isEmpty())
        	System.out.println("No of words : 0");
        else {
        	NumberOfWords= StringInPut.split("\\s+");
            System.out.println("No of words : " +NumberOfWords.length);
        }

	}

}
