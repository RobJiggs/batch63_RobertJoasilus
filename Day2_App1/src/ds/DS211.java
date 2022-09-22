/**
 * 
 */
package ds;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class DS211 {
	public static void main(String[] args) {
		int a = 24;
		int b = 16;
		int hcf=1;
		if (a > b) {
			for (int i = 1; i <= b; i++) {
				if(a%i==0 && b%i==0) {
					hcf=i;
					
				}
			}

		} else if (b > a) {
			for (int i = 1; i <= a; i++) {
				if(a%i==0 && b%i==0) {
					hcf=i;
					
				}
			}

		}
		
	System.out.println("The hcf of "+ a + " and "+ b+ " is " + hcf);	
	}
}
