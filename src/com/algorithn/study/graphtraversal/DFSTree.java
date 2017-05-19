package com.algorithn.study.graphtraversal;

import java.util.Stack;

/**
 * 
 * @author Administrator
 * @desc 无向图的DFS（Depth-First-Search）遍历
 * 
 * 思路：　假设给定图G的初态是所有顶点均未曾访问过。在G中任选一顶点v为初始出发点(源点)，则深度优先遍历可定义如下：
 * 		首先访问出发点v，并将其标记为已访问过；然后依次从v出发搜索v的每个邻接点w。
 * 		若w未曾访问过，则以w为新的出发点继续进行深度优先遍历，直至图中所有和源点v有路径相通的顶点(亦称为从源点可达的顶点)均已被访问为止。
 * 		若此时图中仍有未访问的顶点，则另选一个尚未访问的顶点作为新的源点重复上述过程，直至图中所有顶点均已被访问为止。
 *
 */
public class DFSTree {

	//存储节点信息
	private String[] vertices;
	
	//存储边信息（相邻矩阵）
	private int[][] edges;
	
	//判断节点的数量
	private int vexnum;
	
	//判断节点是否被访问
	private boolean [] visited;
	
	public void setVertices(String[] vertices) {
	
		this.vertices = vertices;
	}
	
	public void setVexnum(int vexnum){
		
		this.vexnum = vexnum;
	}
	
	public void setVisited(boolean[] visited){
		
		this.visited = visited;
	}
	
	public void setEdges(int i, int j){
		
		if(i == j)
			return;
		this.edges[i][j] = 1;
		this.edges[j][i] = 1;
	}
	
	public void setEdges(int i, int j, int value){
		
		if(i == j)
			return;
		this.edges[i][j] = value;
		this.edges[j][i] = value;
	}
	
	
	public int[][] getEdges() {
		return edges;
	}

	public void setEdges(int[][] edges) {
		this.edges = edges;
	}

	public String[] getVertices() {
		return vertices;
	}

	public int getVexnum() {
		return vexnum;
	}

	public boolean[] getVisited() {
		return visited;
	}

	public DFSTree(int n) {
		
		this.vexnum = n;
		this.vertices = new String[n];
		this.edges = new int[n][n];
		this.visited = new boolean[n];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				edges[i][j] = 0;
				edges[j][i] = 0;
			}
		}
	}
	
	public DFSTree() {
		super();
	}
	
	//输出访问节点值
	public void printVisited(int i){
		
		System.out.print(vertices[i] + " ");
	}
	
	//从第i个节点开始进行深度优先遍历
	public void traversalGraph(int i){
		
//		System.out.println("traversalGraph--------------" + i);
		visited[i] = true;
		printVisited(i);
		for(int j = 0;j < vexnum;j++){
			
			if(edges[i][j] != 0 && visited[j] == false){
//				System.out.println("j===============" + j);
				traversalGraph(j);
				
			}
		}
		
	}

	//图的深度优先遍历（递归）
	public void DFSTraverse(){
		
		System.out.println("DFSTraverse=======================");
		for(int i = 0; i < vexnum;i++){
			visited[i] = false;
		}
		
		for(int i = 0;i < vexnum;i++){
//			System.out.println("=================DFSTraverse*************");
			if(visited[i] == false){
				traversalGraph(i);
			}
		}
	}

	
	//图的深度优先遍历（非递归）
	public void DFTraverse2(){
		
		System.out.println("not recursion=================================DFS");
		for(int i = 0;i < vexnum;i++){
			
			visited[i] = false;
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0;i < vexnum;i++){
			if(!visited[i]){
				//将j放入栈顶
				stack.add(i);
				do {
					//出栈
					int tmp = stack.pop();
					//如果节点没有被遍历，则遍历该节点，并将子节点入栈
					if(visited[tmp] == false){
						//打印节点
						printVisited(tmp);
						visited[tmp] = true;
						
						//该节点没有遍历的子节点入栈
						for(int j = (vexnum - 1);j >= 0;j--){
							
							if(edges[tmp][j] != 0 && visited[j] == false){
								
								stack.add(j);
							}
						}
					}
					
				} while (!stack.isEmpty());
			}
			
			
		}
	}
}
