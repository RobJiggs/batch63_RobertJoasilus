/**
 * 
 */
package com.cogent.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS3dot6 {
	public static void main(String[] args) {
		int[]arr = new int[12];
		int min=-15;
		int max=15;
		Random rand = new Random(); 
		
		for(int i=0;i<arr.length;i++) {
        
	    int int_random = rand.nextInt(max - min) + min;
	    arr[i]=int_random;
	}
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					int int_random2 = rand.nextInt(max - min) + min;
					arr[j]= int_random2;
					
				}
				
			}
			
			
		}
	
		System.out.println(Arrays.toString(arr));
	}

}
