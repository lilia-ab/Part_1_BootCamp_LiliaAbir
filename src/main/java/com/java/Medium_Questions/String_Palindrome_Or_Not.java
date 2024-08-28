package com.java.Medium_Questions;

public class String_Palindrome_Or_Not {

	public static void main(String[] args) {
		
		
		String s = "hi";

        
        s = s.toLowerCase();
        boolean A = palindrome(s);
        System.out.println(A);

	}
	public static boolean palindrome(String s)
    {
        
        String r = "";

       
        boolean ans = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }

        
        if (s.equals(r)) {
            ans = true;
        }
        return ans;
}
}
