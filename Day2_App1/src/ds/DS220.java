/**
 * 
 */
package ds;

import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS220 {
	public static void main(String[] args) {
		int max=500;
		int min=-500;
		
		Random rand = new Random(); 
		int int_random = rand.nextInt(max - min) + min;
		
		///user number
		int num=55;

		//put in loop that asks the user to guess again with Scanner.in
		if(int_random>num) {
			System.out.println("Your number is too low guess higher");
		}
		else if(int_random<num) {
			System.out.println("Your number is too high guess lower");
			
			
		}
		else {
			System.out.println("right on");
			
		}
	}
	
	
	
	
	
}
