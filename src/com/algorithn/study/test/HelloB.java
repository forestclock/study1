package com.algorithn.study.test;

public class HelloB extends TestCon{

	public HelloB(){
		System.out.println("I’m B class");
	}
	static {
		System.out.println("static B");
	}
	
	public static void main(String[] args) {
		new HelloB();
	}
}
