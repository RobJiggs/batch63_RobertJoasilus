/**
 * 
 */
package com.cogent.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 23, 2022
 */
public class DS3dot13 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[]arr = new int[5];
		int temp1=0;
		
		Random rand = new Random(); 
		
		for(int i=0;i<arr.length;i++) {
	    
	    int int_random = rand.nextInt(max - min) + min;
	    arr[i]=int_random;
	}
	    System.out.println(Arrays.toString(arr));
		temp1=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1]=arr[i];
			
			
		}
		arr[0]=temp1;
		System.out.println(Arrays.toString(arr));
		
		
		
}
}
