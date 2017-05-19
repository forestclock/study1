package com.algorithn.study.bagproblem;

/**
 * 动态规划问题
 * @author Administrator
 *
 */
public class BagProblem {
	
	public static void main(String [] args){
		int m =10;
		int w[] = {3, 4, 6};
		int p[] = {4, 5, 6};
		int [][] results = BackPack_Solution(m, w, p);
		for(int i = 0;i <= w.length;i++){
			for(int j = 0;j <= m;j++){
				System.out.print(results[i][j] + "\t");
				if(j == m){
					System.out.println();
				}
			}
		}
		System.out.println("----------------------");
		System.out.println(results[3][10]);
	}
	
	/**
	 * 背包问题：
	 * 假设现有容量10kg的背包，另外有3个物品，分别为a1，a2，a3。物品a1重量为3kg，
	 * 价值为4；物品a2重量为4kg，价值为5；物品a3重量为5kg，价值为6。
	 * 将哪些物品放入背包可使得背包中的总价值最大？
	 * w[i] :  第i个物体的重量；
	 * p[i] : 第i个物体的价值；
	 * c[i][m] ： 前i个物体放入容量为m的背包的最大价值；
	 * c[i-1][m] ： 前i-1个物体放入容量为m的背包的最大价值；
	 * c[i-1][m-w[i]] ： 前i-1个物体放入容量为m-w[i]的背包的最大价值；
	 * 
	 *　最终得出的结论：
	 *     c[i][m]=max{c[i-1][m-w[i]]+pi , c[i-1][m]}（下图将给出更具体的解释）
	 * @param m 表示背包的最大容量（及质量）
	 * @param w 表示各个物品的重量
	 * @param p 表示各个物品的质量
	 * @return
	 */
	public static int[][] BackPack_Solution(int m, int [] w, int [] p){
		
		int count = p.length;
		int [][] results = new int[count + 1][m + 1];
		
		for(int j = 0;j < results[0].length;j++){
			results[0][j] = 0;
		}
		for(int i = 0;i < results.length;i++){
			results[i][0] = 0;
		}
		
		for(int i =1;i < (count + 1);i++){
			for(int j = 1;j < (m+1);j++){
				if(j >= w[i-1]){
					int tmp = results[i-1][j-w[i-1]]+ p[i-1];
					int tmp2 = results[i-1][j];
					results[i][j] = tmp > tmp2 ? tmp : tmp2;
					
				}else{
					results[i][j] = results[i-1][j];
				}
				
			}
		}
		return results;
	}

}
