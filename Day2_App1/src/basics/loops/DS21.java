/**
 * 
 */
package basics.loops;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */



public class DS21 {
	
	static boolean isPrime(int a) {
		boolean b=true;
		if (a==2) {
			return b;
			
		}
		for(int j=2;j<=a/2;j++) {
			if(a%j==0) {
				b=false;
				
			}
			
			
		}
		return b;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=10;i++) {
			boolean p1=isPrime(i);
			if (p1==true && i !=1) {
				System.out.println("the number "+ i +" is prime");}
			else if(p1==false) {
				
				System.out.println("the number "+ i +" is composite");
			}
			else if(i==1) {
				System.out.println(1+" is neither prime or composite");
				
			}
			
			
			
			
			
		}

	}

	/**
	 * @param i
	 * @return
	 */
	
}
