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
public class DS4dot4 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[4][4];
		int[][]mat2 = new int[4][4];
		boolean equal=true;
		
		Random rand = new Random();
		
		for(int i=0;i<mat.length;i++) {
	 		for(int j=0;j<mat.length;j++) {
	 			 int int_random = rand.nextInt(max - min) + min;
	 		     mat[i][j]=int_random;
	 			 System.out.print(mat[i][j]+" ");
	 			
	 		}
	 		System.out.println(" ");
	}
		System.out.println("------------------------");
		
		for(int i=0;i<mat2.length;i++) {
	 		for(int j=0;j<mat2.length;j++) {
	 			 int int_random = rand.nextInt(max - min) + min;
	 		     mat2[i][j]=int_random;
	 			 System.out.print(mat2[i][j]+" ");
	 			
	 		}
	 		System.out.println(" ");
	}
		
		System.out.println("------------------------------");
		
		if(mat.length!=mat2.length) {
			System.out.println("the 2 matrices aren't equal in length so they are not equal");
			equal=false;
			
			
		}
		
		else {
			for(int i=0;i<mat2.length;i++) {
		 		for(int j=0;j<mat2.length;j++) {
		 			if(mat[i][j]!=mat2[i][j]) {
		 				equal=false;
		 				
		 				
		 				
		 			}
		 			
		 			
		 			
		 			
		 		}}
			
			
		}
		if(equal==false) {
			System.out.println("the 2 matrices arent equal");
			
			
			
			
		}
		else {
			System.out.println("They are equal");
			
			
		}
		
		
		
	}

}
