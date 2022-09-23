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
public class DS3dot10 {
	
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[]arr = new int[5];
		int[]arr2= new int[5];
		Random rand = new Random(); 
		
		for(int i=0;i<arr.length;i++) {
	    
	    int int_random = rand.nextInt(max - min) + min;
	    arr[i]=int_random;
	    
	    
		}
		
		for(int i=0;i<arr2.length;i++) {
		    
		    int int_random = rand.nextInt(max - min) + min;
		    arr2[i]=int_random;
		    
		    
			}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.println(arr[i]+" is a common occurence");
					System.out.println(Arrays.toString(arr));
					System.out.println(Arrays.toString(arr2));
					
					
					
					
				}
				
				
				
			}
			
			
		}
		
		
		
	}

}
