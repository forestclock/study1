package com.test;

public class Cat extends Animal{

	 final int i;
	    int j;
	    public void doSomething() {
	    	String aString  = "aaaaa";
	        System.out.println(++j + i);
	    }
	@Override
	void say() {
		// TODO Auto-generated method stub
		
	}
	
	public Cat(){
		this.i = 0;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			void say() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
