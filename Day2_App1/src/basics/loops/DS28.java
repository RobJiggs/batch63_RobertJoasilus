/**
 * 
 */
package basics.loops;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class DS28 {
	public static void main(String[] args) {
		int sumo = 0;
		int sume = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sume = sume + i;
			

			} else if (i % 2 == 1) {
				sumo = sumo + i;
				

			}

		}

		System.out.println("The sum of even numbers from 1 to 100 is " + sume);
		System.out.println("The sum of odd numbers from 1 to 100 is " + sumo);
		
	}
}
