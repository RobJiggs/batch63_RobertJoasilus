/**
 * 
 */
package basics;

import java.util.ArrayList;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 21, 2022
 */
public class IsVowel {
	static void myMethod(char vow) {
		ArrayList<Character> arr= new ArrayList<Character>(5);
		arr.add('a');
		arr.add('e');
		arr.add('i');
		arr.add('o');
		arr.add('u');
		if(arr.contains(vow)) {
			System.out.println("the character is a vowel");
			
			
		}
		else {
			System.out.println("the character is a consonant");
			
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		char a='a';
		myMethod(a);
	}

}
