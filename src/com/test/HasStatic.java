package com.test;

public class HasStatic{
	
	private static int x = 100;
	public static void main(String[] args) {
		
		boolean b=true?false:true==true?false:true;
		System.out.println(b);
		
		HasStatic h1 = new HasStatic();
		h1.x++;
		HasStatic h2 = new HasStatic();
		h2.x++;
		h1 = new HasStatic();
		h1.x++;
		HasStatic.x--;
		System.out.println("x======" + x);
	}
	
}