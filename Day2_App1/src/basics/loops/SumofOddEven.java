/**
 * 
 */
package basics.loops;

import java.util.Iterator;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class SumofOddEven {
	public static void main(String[] args) {
		int sumo=0;
		int sume=0;
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
				sume=sume+i;
				sum=sum+i;
				
			}
			else if(i%2==1) {
				sumo=sumo+i;
				sum=sum+i;
				
				
				
			}
			 
			}
		
		System.out.println("The sum of even numbers from 1 to 10 is "+ sume);
		System.out.println("The sum of odd numbers from 1 to 10 is "+ sumo);
		System.out.println("The sum of all numbers from 1 to 10 is "+ sum);
	}

}
