/**
 * 
 */
package basics;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class BiggerNumber2 {
	static void myMethod(int a,int b, int c) {
		if(a>b && a>c) {
			System.out.println("a is the biggest");
			
			
		}
		else if(b>c && b>a) {
			System.out.println("b is the biggest");
			
			
			
		}
		else if(c>a && c>b) {
			System.out.println("c is the biggest");
			
			
			
		}
		else {
			System.out.println("two or more of those numbers are equal");
			
			
		}
	}
	
	public static void main(String[] args) {
		int a=5;
		int b=12;
		int c=4;
		myMethod(a,b,c);
		
	}

}
