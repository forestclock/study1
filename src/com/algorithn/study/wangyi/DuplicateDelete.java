package com.algorithn.study.wangyi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DuplicateDelete {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			
			int n = Integer.parseInt(scanner.nextLine());
			
//			int [] inputs = new int[n];
			int [] book = new int[n];
//			int [] indexes = new int[n];
			int [] results = new int[n];
			List<Integer> indexes = new ArrayList<>();
			int flag= 0;
			int index=0;
			for(int i =0;i < n;i++){
				book[i] = 0;
			}
			String [] tmps = scanner.nextLine().split(" ");
			for(int i = 0;i < (n - 1);i++){
				Queue<Integer> queue = new ArrayDeque<>();
				int tmp = Integer.parseInt(tmps[i]);
				queue.offer(tmp);
//				queue.add(tmp);
				if(book[i] == 0){
					for(int j = (i+1);j < n;j++){
						if(book[j] == 0 && Integer.parseInt(tmps[j]) == tmp){
							book[j] = 1;
							//出队列
							queue.poll();
							queue.offer(tmp);
							flag = j;
						}
					}
					book[i]=1;
					results[flag] = queue.peek();
					indexes.add(flag);
//					indexes[index] = 0;
					index++;
				}else
					continue;
			}
			
			Collections.sort(indexes);
			String rels = "";
			for(Integer integer: indexes){
				rels += results[integer] + " ";
			}
			rels = rels.substring(0, rels.lastIndexOf(" "));
			System.out.println(rels);
		}
		
	}

}
