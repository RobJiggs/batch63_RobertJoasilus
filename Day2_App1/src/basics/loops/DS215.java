/**
 * 
 */
package basics.loops;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS215 {
	public static void main(String[] args) {
		for (int i = 0; i <= 500; i++) {
			int armtest = 0;

			int num = i;
			if (i < 10) {
				if((num*num*num)==i) {
					System.out.println(i +" is an armstrong number");
					
					
				}
				

			} else if (i >= 10) {
				int digit = num % 10;
				while (num != 0) {
					
					armtest += digit * digit * digit;
					num = num / 10;
					digit=num%10;
				}
				
				if (armtest == i) {
					System.out.println(i + " is an armstrong number");

				}

			}
		}

	}
}
