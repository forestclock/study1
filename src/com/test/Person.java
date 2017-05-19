package com.test;

public class Person {
	
	private String name = "Person";
	int age = 0;
	static int i;
	public static void main(String[] args) {
		System.out.println(i);
		
	}

}

class Child extends Person{
	
	static int i;
	private String grade;
	public static void main(String[] args) {
		System.out.println(i);
		Person person = new Child();
//		System.out.println(person.name);
		
	}
}
