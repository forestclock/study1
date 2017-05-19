package com.test;

public class Test0508_1 {

	 private static void test(int[]arr) {
	        for (int i = 0; i < arr.length; i++) {
	            try {
	                if (arr[i] % 2 == 0) {
	                    throw new NullPointerException();
	                } else {
	                    System.out.print(i);
	                }
	            } finally {
	                System.out.print("e");
	            }
	        }
	    }
	 
	 	public static void test(int n){
	 		if(n>5){
	 			System.out.println("lallalal---------");
	 			return;
	 		}
	 		test(n+1);
	 		System.out.println("n+1--------" + (n+1));
	 		return;
	 	}
	    public static void main(String[]args) {
	        try {
	            test(new int[] {0, 1, 2, 3, 4, 5});
	        } catch (Exception e) {
	            System.out.print("E");
	        }
	        test(0);
	        
	        
	        String haha = "fasasf";
	        haha.toCharArray();
	        for(int i = 0;i < haha.length();i++){
	        	
	        }
	    }
}
