/**
 * 
 */
package com.cogent.array;

import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 23, 2022
 */
public class DS4dot5 {
	
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[3][3];
		int[][]temp = new int[3][3];
	
		Random rand = new Random();
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 int int_random = rand.nextInt(max - min) + min;
     		     mat[i][j]=int_random;
     			 System.out.print(mat[i][j]+" ");
     			
     		}
     		System.out.println(" ");
	}
		System.out.println("--------------------------");
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 
     		    temp[i][j]=mat[j][i];
     			 System.out.print(temp[i][j]+" ");
     			
     		}
     		System.out.println(" ");
	}
		
		
}
}