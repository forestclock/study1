package com.palindrome.string;


import java.util.Arrays;
import java.util.Scanner;


/**
 * 判断输入字符串是否包含回文字符串，若包含，则求出最长回文字符 or 其长度
 * abaab
 * =>扩展成  #a#b#a#a#b
 * 对每个字符为中心，求其最长回文半径， 都以#结尾，不需要再考虑奇偶文字符串长度问题
 * 回文半径【1,2,1,4,1,2,5,2,1,2,1】 radiuses[]
 * 最长回文长度  radiuses[i]-1
 * @author Administrator
 *
 */
public class MaxHuiWen {

	public static void main(String[] args) {
		
		System.out.println("请输入字符串------------");
		Scanner scanner = new Scanner(System.in);
		int min = 1;
		while(scanner.hasNext()){
			String input = scanner.nextLine();
			char [] inputs = change(input);
			int [] results = searchHuiwei(inputs);
			System.out.println("最长回文字符串为---------" + maxPalindrome(results, inputs));
//			maxPalindrome(results);
			
			
		}
		
	}
	
	public static char[] change(String input){
		
		
		char[] inputs = input.toCharArray();
		char index = '#';
		char [] results = new char[inputs.length * 2 +1];
		for(int i = 0;i < results.length;i++){
			if(i%2 == 0){
				results[i] = '#';
			}else{
				results[i] = inputs[(i-1)/2];
			}
			System.out.print(results[i] + " ");
		}
		return results;
	}
	
	//查找得到每个字符对应的回文半径数组： radius[] ，实际的回文长度为: radiuses[i] - 1
	public static int[] searchHuiwei(char [] input){
		
		System.out.println();
//		System.out.println("searchHuiwen-----------------" + input.length);
		int [] radiuses = new int[input.length];
		radiuses[0] = 1;
		System.out.println("radius-----" + radiuses[0]);
		for(int i = 1;i < input.length;i++){
//			System.out.println("-----" + input[i]);
			int radius = 1;
			int tmpLeft = i;
			int tmpRight = i;
			while((tmpLeft - 1) >= 0 && (tmpRight+1) < input.length){
//				System.out.println("进入循环------------");
				if(input[tmpLeft - 1] == input[tmpRight + 1]){
					radius ++;
					tmpLeft --;
					tmpRight ++;
					
				}else{
					break;
				}
			}
			System.out.println("radius-----" + radius);
			radiuses[i] = radius;
		}
		return radiuses;
	}
	
	
	//获取 顺序字符串中最长回文长度
	public static int maxPalindrome(int [] radiuses){
		
//		for(int i = 0;i<radiuses.length;i++){
//			System.out.println("radius---" + radiuses[i]);
//		}
		Arrays.sort(radiuses);
		System.out.println("=======" + (radiuses[radiuses.length - 1] - 1));
		return (radiuses[radiuses.length - 1] - 1);
		
	}
	
	//获取顺序字符串中最长回文字符串
	public static String maxPalindrome(int [] radiuses, char []inputs){
		
		int max = 0;
		int index = 0;
		for(int i = 0;i<radiuses.length;i++){
			System.out.println("radius---" + radiuses[i]);
			if(max < radiuses[i]){
				System.out.println("i========" + i);
				max = radiuses[i];
				index = i;
				System.out.println("-------------------" + index);
			}else{
				System.out.println("-------------------" + index);
			}
		}
		System.out.println("index---------" + index);
		System.out.println("radiuses--" + radiuses.length);
		System.out.println("inputs------" + inputs.length);
		max = max - 1;
		System.out.println("最大的回文半径为--------" + max);
		String result = "";
		for(int i = index-max; i <= index + max;i++){
			result = result + inputs[i];
		}
		result = result.replace("#", "");
		return result;
	}
	
}
