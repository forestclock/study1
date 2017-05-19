package com.jiaohuan;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间
 * 输入描述:
 *输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
 *输出描述:
 *对于每组数据，输出移位后的字符串。
 *输入例子:
 *AkleBiCeilD
 *输出例子:
 *kleieilABCD
 *
 */
public class ExchangeArray {

	
	public static void main(String[] args) {
		
		System.out.println("请输入字符串");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			
			String input = scanner.nextLine();
			System.out.println(moveCaptical(input));
		}
		String input = "AkleBiCeilD";
		System.err.println(moveCaptical(input));
		System.out.println(moveCaptical2(input));
		
		
	}
	
	//不确定是否会申请额外空间
	public static String moveCaptical(String input){
		
		char [] cs = input.toCharArray();
		int count = 0;
		for(int i = 0; i < cs.length;i++){
			if(Character.isUpperCase(cs[i])){
				count ++;
			}
		}
		for(int i = 0;i < cs.length;i++){
			System.out.println("i==========" + i);
			
			while(Character.isUpperCase(cs[i]) && count > 0){
				count --;
				char tmp = cs[i];
				System.out.println("大写字符------------" + tmp);
				for(int j = (i+1);j < cs.length;j++){
					cs[j-1] = cs[j]; 
				}
				cs[cs.length - 1] = tmp;
				System.out.println("移动之后的cs值为-----" + cs[i]);
			}
		}
		
		return new String(cs);
	}
	
	
	public static String moveCaptical2(String input){
		
		char [] cs = input.toCharArray();
		int k = 0;
		for(int i = 0;i < cs.length;i++){
			
			if(Character.isLowerCase(cs[i])){
				
				char tmp = cs[i];
				for(int j = i;j > k;j--){
					cs[j] = cs[j-1];
				}
				cs[k] = tmp;
				k++;
			}
			
			
		}
		
		return new String(cs);
	}
}
