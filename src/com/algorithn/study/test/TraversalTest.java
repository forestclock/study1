package com.algorithn.study.test;

import com.algorithn.study.graphtraversal.DFSTree;

public class TraversalTest {
	
	public static void main(String[] args) {
		
		System.out.println("start--------------------------------");
		int n = 9;
		DFSTree dfsTree = new DFSTree(n);
		String [] vertices = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
		dfsTree.setVertices(vertices);
		dfsTree.setEdges(0, 1, 1);
		dfsTree.setEdges(0, 5, 2);
		dfsTree.setEdges(1, 2, 3);
		dfsTree.setEdges(1, 8, 6);
		dfsTree.setEdges(2, 8, 9);
		dfsTree.setEdges(2, 3, 7);
		dfsTree.setEdges(3, 8, 4);
		dfsTree.setEdges(3, 4, 2);
		dfsTree.setEdges(3, 6, 2);
		dfsTree.setEdges(3, 7, 1);
		dfsTree.setEdges(4, 5, 5);
		dfsTree.setEdges(4, 7, 5);
		dfsTree.setEdges(6, 7, 3);
		dfsTree.setEdges(6, 7, 3);
		
		dfsTree.DFSTraverse();
		System.out.println();
		System.out.println("end---------------------------------------");
		
		dfsTree.DFTraverse2();
		
		
		int n2 = 6;
		DFSTree dfsTree2 = new DFSTree(n2);
		String [] vertices2 = {"A", "B", "C", "D", "E", "F"};
		dfsTree2.setVertices(vertices);
		dfsTree2.setEdges(0, 1);
		dfsTree2.setEdges(0, 2);
		dfsTree2.setEdges(1, 3);
		dfsTree2.setEdges(1, 4);
		dfsTree2.setEdges(2, 5);
		
		dfsTree2.DFSTraverse();
		System.out.println();
		System.out.println("end---------------------------------------");
		
		dfsTree2.DFTraverse2();
		
		
	}

}
