/**
 * 
 */
package basics.loops;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class ReverseNumber {
	static void reverser(int i) {
		int rev_num=0;
		while(i!=0) {
		
			
			
			int digit=i%10;
			rev_num=(rev_num*10)+digit;
			i=i/10;
		}
		System.out.println(rev_num);
		
	}
	
	public static void main(String[] args) {
		int a=1234;
		reverser(a);
	}

}
