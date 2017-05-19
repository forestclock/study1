package com.test.choose;

class Value{
    public int i=15;
}

public class Test2 {

	 private static int i=1;
	    public int getNext(){
	         return i++;
	    }
//	    public static void main(String [] args){
	       
//	    }
	
	
	 public static void main(String argv[]){
		 
		 	Test2 test2=new Test2();
	        Test2 testObject=new Test2();
	        test2.getNext();
	        testObject.getNext();
	        System.out.println(testObject.getNext());
		 	
		 
	        Test2 t=new Test2( );
	        t.first( );
	        
//	        byte b1=1,b2=2,b3,b6; 
//	        final byte b4=4,b5=6; 
//	        b6=b4+b5; 
//	        b3=(b1+b2); 
//	        System.out.println(b3+b6);
	        
	        float [][] fs =new float[6][6];
	        float [][] fs2 =new float[6][];
	        float []fs3 [] = new float[6][6];
	        float fs4 [][] = new float[6][6];
	        
	    }
	 
	public void first( ){
	    int i=5;
	    Value v=new Value( );
	    v.i=25;
	    second(v,i);
	    System.out.println(v.i);
	}
	 
	public void second(Value v,int i){
	    i = 0;
	    v.i = 20;
	    Value val = new Value( );
	    v = val;
	    System.out.println(v.i+" "+i);
	   }
}
