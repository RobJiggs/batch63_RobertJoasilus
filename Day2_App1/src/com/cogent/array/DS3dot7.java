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
public class DS3dot7 {
	public static void main(String[] args) {
		int[] arr = new int[12];
		int[] arr2 = new int[12];
		int min = -15;
		int max = 15;
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {

			int int_random = rand.nextInt(max - min) + min;
			arr[i] = int_random;
		}

		for (int i = 0; i < arr2.length; i++) {

			int int_random = rand.nextInt(max - min) + min;
			arr2[i] = int_random;
		}

		int arrmerge[] = new int[(arr.length) + (arr2.length)];
		for (int i = 0; i < arr.length; i++) {
			arrmerge[i]=arr[i];
			
		}
		for (int i = 0; i < arr2.length; i++) {
			arrmerge[(arr.length)+i]=arr2[i];
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arrmerge));
	}

}
