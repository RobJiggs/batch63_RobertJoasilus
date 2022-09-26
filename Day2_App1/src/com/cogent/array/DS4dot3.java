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
public class DS4dot3 {

	
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[3][3];
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
		System.out.println("-----------------------");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				for(int k=j;k>0;k--) {
					if(mat[i][k-1]>mat[i][k]) {
						temp=mat[i][k];
						mat[i][k]=mat[i][k-1];
						mat[i][k-1]=temp;
						
						
						
						
						
						
					}
					
					
					
					
			}
				
				
				
				
				
			}
			
			
			
			
		}
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			
     			 System.out.print(mat[i][j]+" ");
     			
     		}
     		System.out.println(" ");
	}
	}
}
