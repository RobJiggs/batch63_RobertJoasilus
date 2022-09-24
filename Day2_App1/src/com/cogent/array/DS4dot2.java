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
public class DS4dot2 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[3][3];
		int[][]mat2 = new int[3][3];
		int [][] sum= new int[3][3];
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
		for(int i=0;i<mat2.length;i++) {
     		for(int j=0;j<mat2.length;j++) {
     			 int int_random = rand.nextInt(max - min) + min;
     		     mat2[i][j]=int_random;
     		    System.out.print(mat2[i][j]+" ");
     			
     			
     		}
     		System.out.println(" ");
     		
     	}
		System.out.println("-----------------------");
		
		for(int i=0;i<sum.length;i++) {
     		for(int j=0;j<sum.length;j++) {
     			
     			sum[i][j]=mat[i][j] + mat2[i][j];
     		    System.out.print(sum[i][j]+" ");
     			
     			
     		}
     		System.out.println(" ");
     		
     	}
	}

}
