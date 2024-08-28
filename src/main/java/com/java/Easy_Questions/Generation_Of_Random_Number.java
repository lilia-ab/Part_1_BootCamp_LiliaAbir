package com.java.Easy_Questions;

import java.util.Random;

public class Generation_Of_Random_Number {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int rand_int = rand.nextInt(100)+1;
        
   
        
        System.out.println("Random Integer: "+rand_int);
        double rand_dub = rand.nextDouble();
        System.out.println("Random Double: "+rand_dub);
        
	}

}
