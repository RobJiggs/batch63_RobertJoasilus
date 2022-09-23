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
public class DS3dot9 {
	public static void main(String[] args) {
		
	
	
	int max=15;
	int min=-15;
	int[]arr = new int[5];
	Random rand = new Random(); 
	
	for(int i=0;i<arr.length;i++) {
    
    int int_random = rand.nextInt(max - min) + min;
    arr[i]=int_random;
    
    
	}
	int remove_occurance=0;
	remove_occurance=arr[2];
	
	int[]arr2 = new int[arr.length-1];
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]== remove_occurance) {
			if(j+1!=arr.length) {
				j=i+1;
				arr2[i]=arr[j];
				
			}
			
			
		}
		else {
			if(i>=arr2.length) {
				arr2[i-1]=arr[i];
				
			}
			else {
				arr2[i]=arr[i];
				
				
			}
			
			
			
			
		}
		
		
	}
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr2));
	
	}
	
	
	
	
	
	
	
	
	
}
