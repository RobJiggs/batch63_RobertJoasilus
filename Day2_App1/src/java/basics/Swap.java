/**
 * 
 */
package java.basics;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class Swap {
	static void myMethod(int a, int b) {
		int c=a;
		a=b;
		b=c;
		System.out.println(a+' '+b);
		
		
	}


	
	
	public static void main(String[] args) {
		int a =10;
		int b=5;
		myMethod(a,b);
		
	}
}
