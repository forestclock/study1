package study1.tree;

public class TestFabonacci {
	
	 public int RectCover(int target) {

	       return fabonacci(target);
	    }
	    
	    public int fabonacci(int target){
	        int result = 0;
	        if(target == 0){
	            return 0;
	        }else if(target == 1){
	            return 1;
	        }else if(target == 2){
	            return 2;
	        }else{
	            result = fabonacci(target-1) + fabonacci(target-2);
	            return result;
	        }
	    }

}
