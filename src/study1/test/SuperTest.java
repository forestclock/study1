package study1.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuperTest extends Date{
	
	private static final long serialVersionUID = 1L;  
    private void test(){  
        System.out.println(super.getClass().getName());  
     }  
      
     public static void main(String[]args){  
        new SuperTest().test();  
        
        List<Integer> results = new ArrayList<>();
        results.size();
     }  

}
