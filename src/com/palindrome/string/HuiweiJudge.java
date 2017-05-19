package com.palindrome.string;

import java.util.Scanner;

public class HuiweiJudge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串：");
		while(scanner.hasNext()){
//			System.out.println("请输入字符串：");
			String input = scanner.next();
			System.out.println("输入的input为-----" + input);
			int length = input.length();
			
			System.out.println("该字符串是否是回文字符串-------" + isHuiwenJudge(input));
		}
		
		
		
	}

	//判断输入字符串是否为回文字符串，将字符串分成奇数个，偶数各进行，从最中间的字符开始，向两端进行匹配
	/**
	 * 
	 * @param input 输入字符串
	 * @return
	 */
	public static boolean isHuiwenJudge(String input){
		
		boolean flag = true;
		int length = input.length();
		String left;
		String right;
		if(length%2 == 0){
			System.out.println("偶数字符串--------------");
			int middle = length/2;
			left = input.substring(0, middle);
			right = input.substring(middle);
			
		}else{
			System.out.println("奇数个字符串---------------");
			int middle = length/2;
			left = input.substring(0,middle);
			right = input.substring(middle + 1);
		}
		for(int i = 0;i<left.length();i++){
			if(left.charAt(i) != right.charAt(right.length() - 1 - i)){
				System.out.println("不等-----------");
				flag = false;
				break;
			}
		}
		System.out.println("left---------" + left);
		System.out.println("right-------" + right);
		return flag;
	}
	
	
	

}
