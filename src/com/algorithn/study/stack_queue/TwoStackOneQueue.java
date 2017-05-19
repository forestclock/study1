package com.algorithn.study.stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TwoStackOneQueue {

	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	
	

	public static void main(String[] args) {
		
//		int [] tmps = new int[10];
		
		List<Integer> results = new ArrayList<>();
		push(1);
		push(2);
		push(3);
		results.add(pop());
		results.add(pop());
		push(4);
		results.add(pop());
		push(5);
		results.add(pop());
		results.add(pop());
		for(Integer i: results){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void push(int node){
		if(stack1.isEmpty() && stack2.isEmpty()){
			System.out.println("------------------stack1 为空， 直接push---------" + node);
			stack1.push(node);
		}
		else if(stack1.isEmpty() && (!stack2.isEmpty())){
			while(!stack2.isEmpty()){
				System.out.println("------------------stack1  为空，值在stack2中， 直接push---------");
				int tmp = stack2.pop();
				stack1.push(tmp);
			}
			stack1.push(node);
		}
		else if(!stack1.isEmpty() && stack2.isEmpty()){
			System.out.println("------------------stack1 有值，直接push---------" + node);
			stack1.push(node);
		}
	}
	
	public static int pop(){
		int result = 0;
		if(stack1.isEmpty() && stack2.isEmpty()){
			System.out.println("stack is null");
		}
		else if(!stack1.isEmpty() && stack2.isEmpty()){
			System.out.println("stack1  已有值， push到stack2中，再pop---------");
			while(!stack1.isEmpty()){
				int tmp = stack1.pop();
				stack2.push(tmp);
			}
			result = stack2.pop();
		}
		else if(stack1.isEmpty() && (!stack2.isEmpty())){
			System.out.println("stack2  已有值,直接pop---------");
			result = stack2.pop();
		}
		return result;
	}
}
