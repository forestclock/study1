package study1.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution0516_2 {
	
	
	public static void main(String[] args) {
		
//		int [] test = {-2,-8,-1,-5,-9};
		int [] test = {1,-2,3,10,-4,7,2,-5};
		
		System.out.println(new Solution0516_2().FindGreatestSumOfSubArray(test));
		
		
		
		int [] input = {5,4,8,9,2,1,7};
		
		int k = 5;
		new Solution0516_2().GetLeastNumbers_Solution(input, k);
		
		Arrays.sort(input);
		System.out.println();
		for(int i =0;i < input.length;i++)
			System.out.print(input[i] + "   ");
		System.out.println();
	}
	
	/**
	 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,
	 * 他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
	 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
	 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
	 * @param array
	 * @return
	 */
	 public int FindGreatestSumOfSubArray(int[] array) {
	        
	        if(array.length == 0 || array == null)
	            return 0;
	        //存储最大值
	        int max = 0;
	        //存储当前连续n 个项的和
	        int currentSum = 0;
	        for(int i = 0;i < array.length;i++){
	        	//核心
	        	//如过当前连续n项的和小于等于0,则没必要与后面的元素相加
	            if(currentSum <= 0)
	                currentSum = array[i];    //currentSum重新赋值
	            else
	                currentSum += array[i];   //如果currentSum的值大于0,则继续与后面的元素相加,
	            if(currentSum > max)
	                max = currentSum;
	            //针对 所有数据都是负数
	            if(currentSum < 0 && max==0)    //如果currentSum的值大于max,则将currentSum的值赋值给max
	            	max = currentSum;
	            else if(currentSum < 0 && max < 0 && currentSum > max){
	            	max = currentSum;
	            }
	        }
	        
	        return max;
	    }
	
	
	/**
	 * 快速排序
	 * @param input
	 * @param k
	 * @return
	 */
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	        
	        ArrayList<Integer> results = new ArrayList<>();
	        if(input.length ==0 || input == null || input.length < k)
	            return results;
	        int [] tmps = quickSort(input, 0, (input.length-1));
	        for(int i =0;i<k;i++){
	        	results.add(tmps[i]); 
	        }
	        System.out.println(results.toString());
	        return results;
	        
	    }
	    public int[] quickSort(int [] inputs, int start, int end){
	    	System.out.println("start=========" + start + "end------" + end);
	        int low = start;
	        int high = end;
	        
	        if(low < high){
	        	int tmp = inputs[start];
	            while(start < end){
	                while(inputs[end] > tmp){
	                    end--;
	                }

	                while(inputs[start] < tmp){
	                   start++; 
	                }
	                int tmp2 = inputs[start];
	                inputs[start] = inputs[end];
	                inputs[end] = tmp2;
	            }
	            inputs[start] = tmp;
	            
	            quickSort(inputs, low, start-1);
	            quickSort(inputs, start+1, high);
	        }
	        return inputs;
	    }
}
