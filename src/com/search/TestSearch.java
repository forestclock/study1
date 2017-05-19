package com.search;


/**在一个二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
**/

public class TestSearch {
	
	public static void main(String[] args) {
		
		
		Integer i01 = 59;
		int i02 = 59;
		Integer i03 =Integer.valueOf(59);
		Integer i04 = new Integer(59);
		System.out.println("1-2" + (i01 == i02));
		System.out.println("1-3" + (i01 == i03));
		System.out.println("3-4" + (i03 == i04));
		System.out.println("2-4" + (i02 == i04));
		
		String aString = "fdsf";
		
		
//		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//		
//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		boolean result = Find(7, array);
//		System.out.println("array===========" + array.equals(""));
//		System.out.println("result---------" + result);
		
		int [][] array2 = {{}};
		if(array2.length == 0){
			System.out.println("null============");
		}
		
		System.out.println("array2===========" + array2.length);
		System.out.println("--------" + array2[0].length);
		//System.out.println(Find(7, array2));
		
		int [][] array3 = {};
		System.out.println("arrays==========" + (array3.length));
		
	
 	}
	
	
	public static boolean Find(int target, int [][] array) {

        int row = 0;
        int col = 0;
        boolean flag = false;
        
        if(array == null || array.length == 0 || (array.length == 1 && array[0].length == 0)){
            return false;
        }else{
            row = array.length;
            col = array[0].length;
        }
            
        if(target < array[0][0] || target > array[row-1][col-1])
            return false;
        else{
            for(int i = 0;i < row;i++){
                if(flag)
                    break;
                for(int j=0;j < col;j++){
					
                    if(array[i][j] == target){
                        flag = true;
                        break;
                    }else{
                        continue;
                    }
                }
            }
            return flag;
        }
        
    }

}
