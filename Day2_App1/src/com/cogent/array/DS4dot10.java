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
public class DS4dot10 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[4][4];
		int sum=10;
		
		
	
		Random rand = new Random();
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 int int_random = rand.nextInt(max - min) + min;
     		     mat[i][j]=int_random;
     			 
     			
     		}
     		System.out.println(" ");
	}
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 if(i==j) {
     				 sum +=mat[i][j];
     				 
     				 
     				 
     			 }
     			 else if((i+j)==mat.length-1){
     				sum +=mat[i][j];
     				 
     				 
     				 
     			 }
     			
     			 
     			
     		}
     		}
		System.out.println("the sum of both diagonals is"+sum);
		

	}

}
