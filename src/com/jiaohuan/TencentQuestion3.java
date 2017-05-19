package com.jiaohuan;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 小Q今天在上厕所时想到了这个问题：有n个数，两两组成二元组，差最小的有多少对呢？差最大呢？
**输入描述:
 *输入包含多组测试数据。
 *对于每组测试数据：
 *N - 本组测试数据有n个数
 *a1,a2...an - 需要计算的数据
* 保证:
*1<=N<=100000,0<=ai<=INT_MAX.
*输出描述:
*对于每组数据，输出两个数，第一个数表示差最小的对数，第二个数表示差最大的对数。
*输入例子:
*6
*45 12 45 32 5 6
*输出例子:
*1 2
 * @author Administrator
 *
 */
public class TencentQuestion3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String count = scanner.nextLine();
			String input = scanner.nextLine();
			int []results = calDifference(count, input);
			for(int i =0;i < results.length;i++){
				System.out.print(results[i] + " ");
			}
		}
		
	}
	
	public static int[] calDifference(String count, String input){
		
		String[] tmps = input.split(" ");
		int num = Integer.parseInt(count);
		int [] inputs = new int[num];
		for(int i = 0;i < tmps.length;i++){
			inputs[i] = Integer.parseInt(tmps[i]);
		}
		int [] replication = new int[num];
		Arrays.sort(inputs);
		
		for(int i =0;i < inputs.length;i++){
			int n = 1;
			for(int j = (i+1);j <inputs.length;i++){
				if(inputs[i] == inputs[j]){
					n++;
				}
			}
			replication[i] = n;
		}
		
		//最小对数量判断
		//1.先判断有无相等对
		
		
		return inputs;
	}

}
