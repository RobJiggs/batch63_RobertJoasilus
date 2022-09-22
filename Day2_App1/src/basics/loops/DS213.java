/**
 * 
 */
package basics.loops;

import java.util.Random;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 22, 2022
 */
public class DS213 {
	public static void main(String[] args) {
		boolean user_selection=false;
		int zero_count=0;
		int pos_count=0;
		int neg_count=0;
		int min=-100;
		int max=100;
		while(user_selection == false) {
			Random rand = new Random(); 
			
			
	        //generate random values from 0-24
	      int int_random = rand.nextInt(max - min) + min;
	      if(int_random>0) {
	    	  pos_count++;
	      }
	      else if(int_random<0) {
	    	  neg_count++;
	      }
	      else {
	    	  zero_count++;
	      }
			
		}
	}

}
