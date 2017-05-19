package study1.test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		
		System.out.println("  -2147483648  二进制计算1的结果" + NumberOf1(-2147483648));
		System.out.println("  -1   二进制计算1的结果" + NumberOf1(-1));
		double r = Math.pow(3.2, 2);
		System.out.println(r);
//		List<int> h = new ArrayList<>();
	}

	  public static int NumberOf1(int n) {
	        
	       return getBytes(n);
	    }
	    
	   public static int  getBytes(int n){
	        //作为正负数的标志 false正数 true 负数
	        boolean flag = false;
	        int count =0;
	        if(n == 0){
	        	return count;
	        }
	        if(n<0){
	           flag = true;
	           n = (-n);
	        }
	        int [] results = new int [33];
	        int k = 0;
	        //构建二进制数据
	        do{
	        	int tmp = n%2;
	            n = n/2;
	           	results[k] = tmp;
	           	k++;
	        }while(n != 0);
	        System.out.println("初始二进制数");
	        //取反
	        if(flag){
	        	results[31] = 1;
	        	for(int j = 0;j < (results.length - 2);j++){
		        	results[j] = negation(results[j]);
		        }
	        }
	        for(int j = 31;j >= 0;j--){
	        	System.out.print(results[j]);
	        }
	        System.out.println();
	        
	        if(flag){
	        	count = 0;
	        	 //负数最高为1
	            for(int i = 0;i < results.length;i++){
	            	if(results[i] == 0){
	            		results[i] = 1;
	            		break;
	            	}else{
	            		results[i] = 0;
	            	}
	            }                   
	        }
	        System.out.println();
	        for(int i = 0;i < results.length;i++){
	        	if(((results[i]) & 1) == 1){
	        		count++;
	        	}
	        }
	        return count;
	        
	    }
	    
	    
	    public static int negation(int n){
	    	int result = 0;
	        if(n == 0){
	            result = 1;
	        }      
	        return result;
	    }
}
