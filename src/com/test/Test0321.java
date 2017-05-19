package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0321 {
	
	 private static final String MESSAGE="taobao";
	
	   
	
	public static void main(String[] args) {
		
		 
		    int x = 0;
	        int y = 0;
	        int k = 0;
	        for (int z = 0; z < 5; z++) {
	            if ((++x > 2) && (++y > 2) && (k++ > 2))
	            {
	                x++;
	                ++y;
	                k++;
	            }
	        }
	        System.out.println(x +"" +y +"" +k);
		
		
		 String a ="tao"+"bao";
		 String b="tao";
		 String c="bao";
		 System.out.println("a-----" + a);
		 System.out.println("b+c======" + (b+c));
		 System.out.println(a==MESSAGE);
		 System.out.println((b+c)==MESSAGE);
		 
		 System.out.println(Math.cos(Math.toRadians(30)));
		
		int n = -1;
		if(n < 0){
			System.out.println("--------" + (-n));
		}
		List<Integer> result = Arrays.asList(1,2,3);
		for(int i =0;i < result.size();i++){
			result.get(i);
		}
		boolean flag = false;
	
	}

}
