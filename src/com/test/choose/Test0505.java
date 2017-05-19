package com.test.choose;

import org.junit.Test;

public class Test0505 {

	@Test
	public void testArray(){
		int [] aa = {};
		System.out.println(aa.length);
		if(aa == null || aa.length == 0){
			System.out.println("kong-------------");
		}else{
			System.out.println(aa[0]);
		}
		
		System.out.println("=end=================" + VerifySquenceOfBST(aa));
	}
	
	
	  public boolean VerifySquenceOfBST(int [] sequence) {
	        
	        if(sequence.length == 0 || sequence == null){
	        	System.out.println("空=============");
	            return false;
	        }
	        int root = sequence[sequence.length - 1];
	        int judge = 0;
	        boolean flag = true;
	       	if(sequence[0] < root){
	            for(int i = 1;i < (sequence.length - 1);i++){
	                if(sequence[i] > root){
	                    judge = i;
	                    break;
	                }
	        	}
	            if(judge !=0){
	                for(int j = judge;j < (sequence.length - 1);j++){
	                    if(sequence[j] < root){
	                        flag = false;
	                        break;
	                    }
	                }
	            }
	         }else{
	            for(int i = 1;i < (sequence.length - 1);i++){
	                if(sequence[i] < root){
	                    flag=false;
	                    break;
	                }
	        	}
	        }
	        
	        
	        return flag;
	    }
}
