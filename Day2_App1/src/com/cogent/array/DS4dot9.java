/**
 * 
 */
package com.cogent.array;

import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 25, 2022
 */
public class DS4dot9 {
public static void main(String[] args) {
	int max=15;
	int min=-15;
	int[][]mat = new int[3][3];
	int[][]transpose = new int[3][3]; // transpose then flip the columns
	
	int temp=0;
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
			transpose[i][j]=mat[j][i];
			
			
		}
		
		
		
	}
	System.out.println("The rotation of that matrix is");
	System.out.println("-------------------------");
	
	for(int i=0;i<transpose.length;i++) {
		for(int j=0;j<transpose.length;j++) {
			if(j==0) {
				temp=transpose[i][(transpose.length)-1];
				transpose[i][(transpose.length)-1]=transpose[i][j];
				transpose[i][j]=temp;
			
				
				
				
				
			}
			System.out.print(transpose[i][j]+" ");
			
			
			
		}
		System.out.println("");
		
		
		
	}
	
	
	
	
	
}
}
