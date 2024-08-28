package com.java.Medium_Questions;

public class Reverse_String {

	public static void main(String[] args) {
		String s= "hello world";
		String  t="";
        char c;
      
      System.out.println("Original word: " + s);
     
      
      for (int i=0; i<s.length(); i++)
      {
        c= s.charAt(i);
        t= c+t;
      }
      System.out.println("Reversed word: "+ t);
    
	}

}
