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
public class DS3dot12 {
	public static void main(String[] args) {
		int min=-15;
		int max=15;
		int[]arr = new int[4];
	
		Random rand = new Random(); 
		
		for(int i=0;i<arr.length;i++) {
	    
	    int int_random = rand.nextInt(max - min) + min;
	    arr[i]=int_random;
	    
	    
		}
	}

}
