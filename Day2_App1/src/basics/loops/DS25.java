/**
 * 
 */
package basics.loops;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */

public class DS25 {
	
	public static void main(String[] args) {
		int sum=1;
		int fact=7;
		if (fact==0 || fact==1) {
			System.out.println("The factorial of 0 or 1 is"+ 1);
			
		}
		while(fact>1) {
			sum=fact*sum;
			fact--;
			System.out.println(sum);
		}
	}
}
