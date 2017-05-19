package com.algorithn.study.test;

import java.util.ArrayList;
import java.util.List;

public class NameList{
	
	private List names = new ArrayList<>();
	
	public synchronized void add(String name){
		names.add(name);
	}
	
	public synchronized void printAll(){
		for(int i =0;i < names.size();i++){
			System.out.print(names.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		
		final NameList sList = new NameList();
		for(int i = 0;i < 2;i++){
			new Thread(){
				public void run(){
					sList.add("A");
					sList.add("B");
					sList.add("C");
					sList.printAll();
				}
			}.start();
		}
	}
	
}