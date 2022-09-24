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
public class DS4dot6 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[2][2];
		int determinant=0;
		
	
		Random rand = new Random();
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 int int_random = rand.nextInt(max - min) + min;
     		     mat[i][j]=int_random;
     			 System.out.print(mat[i][j]+" ");
     			 
     			
     		}
     		System.out.println(" ");
	}
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 
     			
     			 
     			
     		}
     		}
		
		
		System.out.println("The determinant is "+ determinant);
	}

}
