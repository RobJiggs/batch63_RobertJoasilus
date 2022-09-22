/**
 * 
 */
package ds;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS218 {
	double calc(int a) {
		double sum=1;
		int n=a;
		if(a%2!=0) {
			n=a+1;
			
		}
		
		for(double i=n;i>1;i-=2) {
			sum=sum-((1/i) + (1/(i-1)));
			
		}
		return sum;
		
		
	}
	public static void main(String[] args) {
		int num=12;
		DS218 d= new DS218();
		System.out.println(d.calc(8));
		
		
	}

}
