package com.palindrome.string;

import java.util.Scanner;

/**
 * 腾讯实习生考题
 * @author Administrator
 * 输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
 * 输出描述:
 *对于每组数据，输出一个整数，代表最少需要删除的字符个数。
 *输入例子:
 *abcda
 *google
 *输出例子:
 *2
 *2
 * 
 * 分析：
 * 实际上就是求解最长公共子序列（）插入字符和删除字符使其成为回文串，答案是一样的.
 * 首先求s的反串rs，然后对s和rs求最长公共子序列，要删除的字符个数就是LCS.
 *
 */
public class PalindromeString {
	
	public static void main(String[] args) {
		System.out.println("输入要判断的字符串：----");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int i = 0;
			int [] results = new int[2];
			while(i < 2){
				String str = scanner.nextLine();
				int commonCount = getCommon(str);
				int deleteCount = str.length() - commonCount;
//				System.out.println(deleteCount);
				results[i] = deleteCount;
				i++;
			}
			for(int j = 0;j < results.length;j++){
				System.out.println(results[j]);
			}
			
			
		}
	}
	
	//求解字符串的最长公共子序列(LCS算法)
	public static int getCommon(String str){
		
		StringBuilder sBuilder = new StringBuilder(str);
		sBuilder = sBuilder.reverse();
		String reStr = sBuilder.toString();
		char [] cs = str.toCharArray();
		char [] reCs = reStr.toCharArray();
		int length = str.length();
		int [][] count = new int[length+1][length+1];
		for(int i =0;i < length;i++){
			for(int j = 0;j < length;j++){
				if(cs[i] == reCs[j]){
					count[i+1][j+1] = count[i][j]+1;
				}else{
					count[i+1][j+1] = Math.max(count[i][j+1], count[i+1][j]);
				}
			}
		}
		return count[length][length];
	}

	
}
