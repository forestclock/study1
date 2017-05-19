package study1.tree;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BuildTree {
	
	public static void main(String[] args) {
		
		//前序二叉树
		int [] pre = {1,2,4,7,3,5,6,8};
		//二叉树 中序排列
		int [] in = {4,7,2,1,5,3,8,6};
		//二叉树 后序排列
		int [] behind = {7, 4, 2, 5, 8, 6, 3, 1};
		TreeNode node = reConstructBinaryTree(pre, in);
		System.out.println("node-------------" + node);
		System.out.println("前序遍历=======");
		BinaryTree.rootFirst(node);
		System.out.println();
		System.out.println("后序遍历=======");
		BinaryTree.rootLast(node);
		System.out.println();
		System.out.println("中序遍历=======");
		BinaryTree.rootMiddle(node);
		
		System.out.println();
		System.out.println("======================================================");
		TreeNode node2 = reConstructBinaryTreeAfter(behind, in);
		System.out.println("前序遍历=======");
		BinaryTree.rootFirst(node);
		
		
	}

	//根据前序遍历和中序遍历构造二叉树
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length -1, in, 0, in.length-1);
        return root;
       	
        
    }
    
    private static TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
		
        if(startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i = startIn;i<= endIn;i++){
            if(in[i] == pre[startPre]){
                root.setLeft_node(reConstructBinaryTree(pre, startPre+1, startPre+i-startIn,in,startIn,i-1));
                root.setRight_node(reConstructBinaryTree(pre, i-startIn+startPre+1,endPre,in,i+1,endIn));
            }
        }
        return root;
    }
    
    //由构造后序遍历、中序遍历构建二叉树
    public static TreeNode reConstructBinaryTreeAfter(int [] after, int []in){
    	TreeNode node = reConstructBinaryTreeAfer(after, after.length -1, 0, in, 0, in.length - 1);
    	return node;
    }
    
    
    private static TreeNode reConstructBinaryTreeAfer(int [] after, int startAfter, int endAfter, int [] in, int startIn, int endIn){
    	
    	System.out.println("lalalal---------------" + after[startAfter]);
    	if(startAfter < endAfter || startIn > endIn)
    		return null;
    	TreeNode root = new TreeNode(after[startAfter]);
    	for(int i = startIn;i<= endIn;i++){
    		if(in[i] == after[startAfter]){
//    			root.setLeft_node(reConstructBinaryTreeAfer(after, startAfter - 1, startAfter-i+startIn, in, startIn, i-1));
//    			root.setRight_node(reConstructBinaryTreeAfer(after, startAfter-i+startIn -1 , endAfter, in, startIn, endIn));
    			
    			root.setRight_node(reConstructBinaryTreeAfer(after, startAfter - 1, startAfter-i+startIn, in, i+1, endIn));
    			root.setLeft_node(reConstructBinaryTreeAfer(after, startAfter-i+startIn -1 , endAfter, in, startIn, i-1));
    		}
    	}
    	
    	
    	return root;
    	
    }
   
}
