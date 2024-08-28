package com.java.Hard_Questions;

public class Longest_common_subsequence_OfTwo_Strings {
	int Longest_common_subsequence(char[] C1, char[] C2, int Len1, int Len2)
    {
        int L[][] = new int[Len1 + 1][Len2 + 1];
 
        for (int i = 0; i <= Len1; i++) {
            for (int j = 0; j <= Len2; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (C1[i - 1] == C2[j - 1])
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[Len1][Len2];
    }
 
    int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

	public static void main(String[] args) {
		Longest_common_subsequence_OfTwo_Strings Longestcommonsubsequence = new Longest_common_subsequence_OfTwo_Strings();
		String str1 = "SCHOOL";
        String str2 = "SPOOL";
 
        char[] C1 = str1.toCharArray();
        char[] C2 = str2.toCharArray();
        int Len1 = C1.length;
        int Len2 = C2.length;
 
        System.out.println("Length of Longest common subsequence is"
                           + " " + Longestcommonsubsequence.Longest_common_subsequence(C1, C2, Len1, Len2));
	}

}
