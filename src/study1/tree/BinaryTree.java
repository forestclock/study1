package study1.tree;

import java.util.ArrayList;
import java.util.List;

import study1.linkedlist.ListNode;

/**
 * 
 * @ClassName BinaryTree
 * @Description 二叉树声明类
 * @author zhong
 * @date 2017年3月8日下午9:57:58
 *
 */
public class BinaryTree {
	//二叉树的根节点
	public TreeNode rootNode;
	
	
	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	public BinaryTree() {
		super();
	}

	public BinaryTree(TreeNode rootNode) {
		super();
		this.rootNode = rootNode;
	}

	//构造函数：利用传入的一个数组来构建二叉树
	public BinaryTree (int []data){
		
		for(int i = 0;i < data.length;i++){
			System.out.println("data-------------" + data[i]);
			Add_Node_To_Tree(data[i]);
		}
	}
	
	//增加节点
	public void Add_Node_To_Tree(int value) {
		
		TreeNode newNode = new TreeNode(value);
		if(rootNode == null){
			rootNode = newNode;
			return;
		}else{
			TreeNode currentNode = rootNode;
//			TreeNode parentNode = rootNode;
			while(true){
				//添加右子树
				if(currentNode.getValue() < value){
					TreeNode treeNode = currentNode.getRight_node();
					if (treeNode == null) {
						currentNode.setRight_node(newNode);
						return;
					}else{
//						parentNode = currentNode;
						currentNode = currentNode.getRight_node();
					}
				}else {
					TreeNode treeNodeL = currentNode.getLeft_node();
					if(treeNodeL == null){
						currentNode.setLeft_node(newNode);
						return;
					}else{
						currentNode = currentNode.getLeft_node();
					}
				}
			}    //循环结束
		}
		
		
	}

	@Override
	public String toString() {
		return "BinaryTree [rootNode=" + rootNode + "]";
	}
	
	
	//利用递归实现对树的先序遍历(根左右)
	public static void rootFirst(TreeNode node){
		
		if(node == null)
			return ;
		System.out.print("[" + node.getValue() + "]");
		if(node.getLeft_node() != null){
			rootFirst(node.getLeft_node());
		}
		if(node.getRight_node() != null){
//			System.out.println("righr_node---------" + node.getRight_node());
			rootFirst(node.getRight_node());
		}
	}
	
	//利用递归实现 树的后序遍历(左右根)
	public static void rootLast(TreeNode node){
		
		if(node == null)
			return;
		if(node.getLeft_node() != null){
			rootLast(node.getLeft_node());
		}
		if(node.getRight_node() != null)
			rootLast(node.getRight_node());
		System.out.print("[" + node.getValue() + "] ");
	}
	
	
	//利用递归实现 树的中序遍历（左根右）
	public static void rootMiddle(TreeNode node){
		if(node == null)
			return;
		if(node.getLeft_node() != null)
			rootMiddle(node.getLeft_node());
		System.out.print("[" + node.getValue() + "] ");
		if(node.getRight_node() != null)
			rootMiddle(node.getRight_node());
	}
	
	public static void main(String[] args) {
		
		
//		int []data = {7,4,16,1,5,8,2,11,9,12,15};
		int []data = {7,4,16,1,5,8,2,11};
		BinaryTree binaryTree = new BinaryTree(data);
		TreeNode treeNode = binaryTree.getRootNode();
		System.out.println("----------" + treeNode);
		
		System.out.println("先序遍历-------------");
		rootFirst(treeNode);
		
		System.out.println();
		System.out.println("后序遍历-------------");
		rootLast(treeNode);
		
		System.out.println();
		System.out.println("中序遍历-------------");
		rootMiddle(treeNode);

		
	}

}
