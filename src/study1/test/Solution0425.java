package study1.test;

import java.util.ArrayList;

public class Solution0425 {
	
	public static void main(String[] args) {
		
//		int [][] test = {{1,2,3},{4,5,6}};
//		int [][] test = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//正确输出=== [1,2,3,4,5,10,15,14,13,12,11,6,7,8,9]
		int [][] test ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		System.out.println(test.length);
		System.out.println(test[0].length);
		ArrayList<Integer> results = printMatrix(test);
		for(Integer i: results){
			System.out.print(i + "   ");
		}
		System.out.println();
	}

	
	
	 public static ArrayList<Integer> printMatrix(int [][] matrix) {
	 
		 ArrayList<Integer> results = new ArrayList<>();
		 if(matrix == null){
			 return results;
		 }else{
			 
			 int row = matrix.length;
			 int col = matrix[0].length;
			 int start_row = 0;
			 int start_col = 0;
			 int end_row = (row - 1);
			 int end_col = (col - 1);
			 if(row == 1 && col == 1){
				 results.add(matrix[0][0]);
			 }else if (col == 1) {
				for(int i = 0;i < row;i++){
					results.add(matrix[i][0]);
				}
				return results;
			}else if (row == 1) {
				for(int i = 0;i < col;i++){
					results.add(matrix[0][i]);
				}
				return results;
			}else if(row == 2){
				 for(int i = 0;i < col;i++){
					 results.add(matrix[0][i]);
				 }
				 for(int i = (col - 1);i >= 0;i--){
					 results.add(matrix[1][i]);
				 }
			 }else{
				 int min = row < col ? row : col;
				 int circle = 0;
				 if(min %2 == 0){
					 circle = min/2;
				 }else
					 circle = min/2 + 1;
				 System.out.println("循环的圈数==========" + circle);
				 for(int i =0;i < circle;i++){
					 
					 System.out.println("start_row-------" + start_row);
					 System.out.println("start_col-------" + start_col);
					 System.out.println("end_row-------" + end_row);
					 System.out.println("end_col-------" + end_col);
					
					 //right
					 for(int z = start_col;z <= end_col;z++){
						 results.add(matrix[start_row][z]);
					 }
					 //down
					 if((start_row + 1) < end_row){
						 
						 for(int z = (start_row + 1);z <= end_row;z++){
							 results.add(matrix[z][end_col]);
						 }
					 }
					//left
					 if((start_col - 1) > start_col){
						 
						 for(int z = (end_col - 1);z >= start_col;z--){
							 results.add(matrix[end_row][z]);
						 }
					 }
					 //up
//					 if((end_row - 1) > (start_row + 1)){
						 for(int z = (end_row - 1);z >= (start_row + 1);z--){
							 results.add(matrix[z][start_col]);
						 }
//					 }
					 start_col ++;
					 start_row ++;
					 end_col --;
					 end_row --;
					 System.out.println("----------------------------------");
					 
				 }
			 }
			 
			 
		 }
		 
		 
		 
		 return results;
		 
	 }
}
