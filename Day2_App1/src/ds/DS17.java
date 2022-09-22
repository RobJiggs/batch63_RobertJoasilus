/**
 * 
 */
package ds;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS17 {
	double calc(int n) {
		double sum=0;
		
		for(double i=n;i>=1;i--) {
			sum+=1/i;
			
		}
		return sum;
		
		
	}
	
	
	public static void main(String[] args) {
		int num=7;
		DS17 d=new DS17();
		System.out.println(d.calc(num));
		
	}

}
