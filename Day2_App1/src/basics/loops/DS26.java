/**
 * 
 */
package basics.loops;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class DS26 {

	static int power(int a, int b) {
		int sum=1;
		for(int i=0;i<b;i++) {
			sum*=a;
			
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a=2;
		int b=10;
		System.out.println(power(a,b));
	}
	
}
