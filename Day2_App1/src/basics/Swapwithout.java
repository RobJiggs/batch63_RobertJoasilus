/**
 * 
 */
package basics;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class Swapwithout {
	static void myMethod(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		
	}
	public static void main(String[] args) {
		int a=5;
		int b=6;
		myMethod(a,b);
	}
}
