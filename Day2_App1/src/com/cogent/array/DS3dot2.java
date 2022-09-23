/**
 * 
 */
package com.cogent.array;

import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS3dot2 {
	public static void main(String[] args) {
		int largest=0;
		int max=15;
		int min=-15;
		int[]arr = new int[5];
		Random rand = new Random(); 
		
		for(int i=0;i<arr.length;i++) {
        
	    int int_random = rand.nextInt(max - min) + min;
	    arr[i]=int_random;
	    
	    
		}
		largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=largest) {
				largest=arr[i];
				
				
			}
			
			
			
		}
		System.out.println("the largest number is" + largest);
		
		
	}

}
