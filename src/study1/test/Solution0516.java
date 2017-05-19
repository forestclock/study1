package study1.test;

public class Solution0516 {
	
	public static void main(String[] args) {
		int [] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(new Solution0516().MoreThanHalfNum_Solution(array));
	}
	
	public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        if(array.length == 1)
        	return array[0];
        int len = array.length;
        boolean flag = false;
        int result=0;
        int [] book = new int[len];
        for(int i = 0;i < len;i++)
            book[i] = 0;
        int times = 0;
        for(int i = 0;i < (len-1);i++){
//            book[i] = 1;
            if(book[i] == 0){
            System.out.println("array[i]------" + array[i]);
            times++;
            for(int j = (i+1);j < len;j++){
                if(book[j] == 0 && array[i] == array[j]){
                    times++;
                    book[j] = 1;
                    System.out.println("满足条件----------");
                }
                if(times > len/2){
                	flag = true;
                	result = array[i];
                    break;
                }
            }
            if(flag){
            	System.out.println("times=========" + times);
                break;
            }
            else
            	times=0;
            book[i] = 1;
            }  
        }
		return result;
    }

}
