package study1.sort;

/**
 * 
 * @ClassName SortAlgorithm  8类
 * @Description TODO
 * @author zhong
 * @date 2017年3月18日下午9:27:55
 *
 */
public class SortAlgorithm {
	
	
	public static void main(String [] args){
		
//		int [] inputs = {7,2,1,8,9};
//		int [] results = insertSort(inputs);
//		for(int i = 0;i < results.length;i++){
//			System.out.print(results[i] + "   ");
//		}
		
//		int [] inputs2 = {4,3,1,19,7,12,13,16};
		int [] inputs2 = {4,3,1,19,7,12,10,13,16,18,17};
//		int [] h = {5,3,2,1};
		int [] h  = {};
		int [] results2 = shellSort(inputs2, h);
		for(int i = 0;i < results2.length;i++){
			System.out.print(results2[i] + "----");
		}
		System.out.println();
		int [] results3 = bubblingSort(inputs2);
		for(int i = 0;i < results3.length;i++){
			System.out.print(results3[i] + "----");
		}
		
		System.out.println();
		int [] results4 = quickSort(inputs2, 0, inputs2.length - 1);
		for(int i = 0;i < results4.length;i++){
			System.out.print(results4[i] + "----");
		}
	}
	
	
	/**1.插入排序————直接插入排序
	 * @Desc 插入排序之直接插入排序
	 * @param inputs
	 * @return
	 */
	public static int [] insertSort(int [] inputs){
		
		int [] results = new int[inputs.length];
		results[0] = inputs[0];
		int index = 0;
		for(int i = 1;i < inputs.length;i++){
			//作为判断的标志
			boolean flag = true;
//			System.out.println(inputs[i]);
			for(int j = 0;j <= index;j++){
				if(inputs[i] < results[j]){    //找到第一个< temp[i]的数，其后面每个数向后移动一位
					for(int z = (index + 1);z > j;z--){
						results[z] = results[z-1];
					}
					index ++;
					results[j] = inputs[i];
					flag = false;
					break;
				}
			}
			//result[] 数组中不存在小于tmp[i]的数，则添加到数组的最后一位
			if(flag){
				index ++;
				results[index] = inputs[i];
			}
			
		}
		return results;
	}
	
	//2.插入排序——————希尔排序  
	/**
	 * 
	 * @param inputs 需要进行排序的序列
	 * @param h     增量序列
	 * @return
	 * 当增量序列不输入是，增量序列 h1 = 1 hi =[inputs.length/2] 向上取整
	 */
	public static int [] shellSort(int[] inputs, int [] h){
		
		int len = inputs.length;
		if(h.length != 0 && h != null){
			System.out.println("情况一==================");
			for(int i = 0;i < h.length;i++){
				System.out.println("h[i]----------" + h[i]);
				for(int j = 0;j < inputs.length;j = j+h[i]){
					if(j+h[i] >= len){
						break;
					}else if(inputs[j] > inputs[j+h[i]]){
						int tmp = inputs[j];
						inputs[j] = inputs[j+h[i]];
						inputs[j + h[i]] = tmp;
					}else if(inputs[j] <= inputs[j+h[i]]){
						System.out.println("位置不发生变化=======");
					}
				}
			}
		}else{
			
			double doubleLength = inputs.length;
			System.out.println("情况二------------" + doubleLength);
			int hi = 0;
			if(len%2 == 0){
				hi = len/2;
			}else{
				hi = len/2 + 1;
			}
			System.out.println(hi);
			while(hi != 0){
				
				System.out.println("hi--------" + hi);
				for(int i = 0; i < inputs.length;i++){
					if(i + hi >= len){
						continue;
					}else if(inputs[i] > inputs[i+hi]){
						
						int tmp = inputs[i];
						inputs[i] = inputs[i+hi];
						inputs[i + hi] = tmp;
					}else if(inputs[i] <= inputs[i+hi]){
					}
				}
				if(hi%2 == 0){
					hi = hi/2;
				}else if(hi != 1){
					hi = hi/2 + 1;
				}else{
					hi = hi/2;
				}
			}		
		}
		return inputs;
	}
	
	
	//2. 交换排序之冒泡排序
	public static int [] bubblingSort(int [] inputs){
		
		for(int i= 0; i < (inputs.length - 1);i++){    //最多进行(n -1)趟排序
			for(int j = 0;j < (inputs.length - i - 1);j++){          //每次都从头开始进行排序,当前位置和下一位置的数值进行比较，当前位置>下一位置,进行交换
				if(inputs[j] > inputs[j + 1]){
					int tmp = inputs[j + 1];
					inputs[j + 1] = inputs[j];
					inputs[j] = tmp;
				}
			}
		}
		return inputs;
		
	}
	
	
	//3. 交换排序之快速排序
	/**
	 * 快速排序 是排序算法中最快的一种算法,
	 * 整体思想： 从tmp = inputs[0]开始，i=0, j= inputs.length -1, 先从j 从右向左扫描，找到到比inputs[i]小的数字，inputs[i] = 改数字， 否则j--;
	 * 														然后由i开始从左向右扫描,得到比inputs[j]大的数字， inputs[j] = 该数字， 否则i++;
	 * 														当i=j 时结束一次快速排序，inputs[i] = tmp;
	 * 			对数组实现分组之后，再次使用相同的方法进行排序，最后得到结果
	 * 利用递归的方式进行实现
	 *  找中间轴进行快速排序
	 */
	public static int [] quickSort(int [] inputs, int low, int high){
		if(low < high){
			int middle = getMiddle(inputs, low, high);
			quickSort(inputs, low, middle - 1);
			quickSort(inputs, middle + 1, high);
		}
		return inputs;
	}
	
	/**
	 * 快速排序需要先找出中轴的位置
	 */
	public static int getMiddle(int [] inputs, int low, int high){
		
		int tmp = inputs[low];
		while(low < high){
			while(low < high && inputs[high] >= tmp){
				high --;
			}
			inputs[low] = inputs[high];
			while(low < high && inputs[low] <= tmp){
				low ++;
			}
			inputs[high] = inputs[low];
		}
		inputs[low] = tmp;
		return low;
		
	}

}
