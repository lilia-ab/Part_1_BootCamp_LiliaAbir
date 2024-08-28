package com.java.Hard_Questions;

 
public class Shorted_Path_Weighted_Graph {
	
	public static int findMin(int[] d, boolean [] v) {
			
		int min = -1;
		
		for(int i = 0; i < d.length; i++) {
			if(v[i] == false && (min == -1 || d[i] < d[min])) {
				min = i;
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int Mat [] [] = {
		        {0, 2, 0, 4, 0, 0},
		        {0, 0, 3, 2, 0, 0},
		        {2, 0, 0, 0, 0, 4},
		        {0, 0, 0, 0, 2, 0},
		        {0, 0, 0, 0, 0, 1},
		        {0, 0, 0, 0, 0, 0}};
		
		int [] d = new int[Mat.length];
		
		int s = 0;
		
		boolean [] v= new boolean[Mat.length];
		
		d[s] = 0;
		
		for (int i = 0; i < Mat.length; i++) {
			if( i == s) continue;
			d[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < Mat.length; i++) {
			int minDistVertex = findMin(d, v);
			
			v[minDistVertex] = true;
			
			for(int j = 0; j < Mat.length; j++) {
				if(Mat[minDistVertex][j] != 0 && v[j] == false && d[minDistVertex] != Integer.MAX_VALUE) {
					int newDist = d[minDistVertex] + Mat[minDistVertex][j];
					if(newDist < d[j]) {
						d[j] = newDist;
					}
				}
			}
		}
		
			for(int i = 0; i < Mat.length; i++) {
				System.out.println("Vertex : " + i + " & Distance from Source : " +d[i]);
			}
		}
		
																			
}
