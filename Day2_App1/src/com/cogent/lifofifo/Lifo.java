/**
 * 
 */
package com.cogent.lifofifo;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 29, 2022
 */

class Arrayqueue1{
	static int[] myList=new int[10];
	static int index=0;
	
	public int pop(){
		if(index>=1) {
			int returnnum=myList[index-1];
			index--;
			return returnnum;
			
			
		}
		else { return 0;}
		
		
	}
	public void add(int b) {
		if (index==0) {
			myList[0]=b;
			index=index+1;
			
		}
		else {
			myList[index]=b;
			index+=1;
				
			}
		
		
		
	}
	
	
}


public class Lifo {
	public static void main(String[] args) {
	Arrayqueue1 a1=new Arrayqueue1();
	a1.add(11);
	a1.add(12);
	a1.add(13);
	a1.add(14);
	a1.add(15);
	System.out.println("The value"+a1.pop()+" is popped");
	for(int i=0;i<a1.myList.length;i++) {
		System.out.println(a1.myList[i]);
		System.out.println(a1.index);
		
	}
	
}
}
	
	
	

