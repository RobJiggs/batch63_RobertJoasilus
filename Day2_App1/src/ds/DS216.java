/**
 * 
 */
package ds;



/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS216 {
	static void fib(int a) {
		int prev1=0;
		int prev2=1;
		int i=0;
		for(;i<a;i++) {
			System.out.print(prev1);
			int current=prev1+prev2;
			prev1=prev2;
			prev2=current;
			
			
		}
		
		
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		int num=22;//user number
		fib(num);
		
	}
	
}
