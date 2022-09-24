/**
 * 
 */
package com.cogent.array;

import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 24, 2022
 */
public class DS4dot7 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[4][4];
		int normal=0;//normal is the sq root of the sum of the squares of the elements
		int trace=0;//THe sum of the diagonal
	
		Random rand = new Random();
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 int int_random = rand.nextInt(max - min) + min;
     		     mat[i][j]=int_random;
     			 normal+= mat[i][j]* mat[i][j];
     			
     		}
     		System.out.println(" ");
	}
		
		double normal2= Math.sqrt(normal);
		
		trace=mat[3][0]+mat[2][1]+mat[1][2]+mat[0][3];
		System.out.println("the normal of the matrix is "+ normal2+ " and the trace is "+ trace);
		
		
	}

}
