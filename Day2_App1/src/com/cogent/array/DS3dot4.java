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
public class DS3dot4 {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[]arr = new int[5];
		int sorter=0;
		Random rand = new Random(); 
		
		for(int i=0;i<arr.length;i++) {
        
	    int int_random = rand.nextInt(max - min) + min;
	    arr[i]=int_random;
	}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]<arr[j]) {
					sorter=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=sorter;
					
					
					
				}
				
				
				
			}
			
			
			
		}
       System.out.println(Arrays.toString(arr));

}
}