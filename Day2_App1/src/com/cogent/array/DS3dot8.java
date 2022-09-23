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
public class DS3dot8 {
	public static void main(String[] args) {
		int[] arr = new int[2];
		int[] arr2 = new int[2];
		int min = -2;
		int max = 0;
		int matches=0;
		boolean sameness = false;
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {

			int int_random = rand.nextInt(max - min) + min;
			arr[i] = int_random;
		}

		for (int i = 0; i < arr2.length; i++) {

			int int_random = rand.nextInt(max - min) + min;
			arr2[i] = int_random;
		}
		
		
		if(arr.length!=arr2.length) {
			sameness=false;
			
			
			
		}
		
		else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr2[i]) {
					matches=matches+1;
					
				}
				
				
				
			}
			if(matches==arr.length) {
				sameness=true;
				
			}
			if(sameness==false) {
				System.out.println("The 2 arrays arent the same");
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(arr2));
				
				
			}
			else if(sameness==true) {
				System.out.println("The 2 arrays are the same");
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(arr2));
				
				
			}
			
			
			
			
		}
		
	}

}
