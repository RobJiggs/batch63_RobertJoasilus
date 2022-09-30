/**
 * 
 */
package com.cogent.lifofifo;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 29, 2022
 */

class Arrayqueue{
	static int[] myList=new int[10];
	static int index=0;

	/**
	 * @param myList
	 */
	public int pop(){
		int returnnum = myList[0];
		if(index<1) {
		return myList[index];
		}
		else {
		
			index=index-1;
			for(int i=0;i<myList.length;i++) {
				if(i!=myList.length-1) {
					myList[i]=myList[i+1];
					
				}
				
				
				
			}
		
		}
		
		return	returnnum;
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
	

public class Fifo {
	public static void main(String[] args) {
		Arrayqueue a1=new Arrayqueue();
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
