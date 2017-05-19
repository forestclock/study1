package study1.test;



import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	
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
        List<Integer> results = new ArrayList();
        
        //构建二进制数据
        do{
        	int tmp = n%2;
            n = n/2;
           	if(flag){//负数取反
                tmp = negation(tmp);
            }
            results.add(tmp);
        }while(n != 0);
       
       
        if(flag){
        	count = 0;
            //results.add(1);     //负数最高为1
            for(int i = 0;i<results.size();i++){
            	if(results.get(i) == 0){
            		results.set(i, 1);
            		break;
            	}else{
            		results.set(i, 0);
            	}
            }                   
        }
        for(int i = 0;i < results.size();i++){
        	if(((results.get(i)) & 1) == 1){
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

