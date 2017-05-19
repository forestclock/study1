package study1.test;

import java.awt.font.TextHitInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import study1.linkedlist.ListNode;

/**
 * 
 * @ClassName Solution0508
 * @Description 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 				例如输入字符串abc,
 * 				则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 
 * 利用DEF(深度优先遍历求解)
 * @author zhong
 * @date 2017年5月8日下午8:09:49
 *
 */
public class Solution0508 {
	
	private Integer [] book;
	private char[] seqs;
	private HashSet<String> result = new HashSet<>();
	
	
	
	public static void main(String[] args) {
		
		 ArrayList<String> results = new Solution0508().permutation("abc");
		 System.out.println("=========" + results.size());
		 for(String s: results){
			 System.out.println(s);
		 }
	}

	 public ArrayList<String> permutation(String str) {
	        
	        char [] inputs = str.toCharArray();
	        ArrayList<String> results = new ArrayList<>();
	        seqs = new char[inputs.length];
	        book = new Integer[inputs.length];
	        for(int i = 0;i < inputs.length;i++){
	        	book[i] = 0;
	        }
	        dfs(inputs, 0);
	        results.addAll(result);
	        Collections.sort(results);
			return results;
	       
	    }
	 
	 public void dfs(char [] inputs, int step){
	        
	        if(step == inputs.length){
	        	String tmp = "";
	        	for(int i = 0;i < seqs.length;i++){
	        		tmp += seqs[i];
	        	}
	        	result.add(tmp);
	        	return;    //返回之前的一步（最近一次调用dfs函数的地方）
	        }
	        for(int i = 0;i < inputs.length;i++){
	            if(book[i] == 0){
	            	seqs[step] = inputs[i];
	            	book[i] = 1;
	            	dfs(inputs, step+1);
	            	book[i] = 0;
	            }
	        }
	        return;
	    }
}
