package study1.test;
import java.util.ArrayList;
import java.util.Stack;
import study1.tree.BinaryTree;
import study1.tree.TreeNode;


/***
 * @date 2017/05/16
 * @author Administrator
 * @desc 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 思路： 利用DFS 深度优先遍历的思想，查找从根节点到叶节点的每条路径，然后在进行判断
 *
 */
public class Solution0515 {
    
    public ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> online = new ArrayList<>();
   
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	int sum = 0;
    	ArrayList<ArrayList<Integer>> actuals = new ArrayList<ArrayList<Integer>>();
        if(root == null)
            return results;
        findPath(root);
        System.out.println("results==========" + results.size());
        for(ArrayList<Integer> tmps: results){
        	System.out.println(tmps.toString());
//        	ArrayList<Integer> tmpResults = new ArrayList<>();
        	for(Integer tmp:tmps){
        		sum += tmp;
        	}
        	if(sum == target)
        		actuals.add(tmps);
        	sum = 0;
        }
        System.out.println("end------------------------==========" + actuals.size());
		return actuals;
		
        
    }
    
    /**
     * 获取所有路径
     * @param root
     */
    Stack<Integer> stack = new Stack<>();
    public void findPath(TreeNode root){
    	
        online.add(root.getValue());
        stack.push(root.getValue());
        if(root.getLeft_node() != null){
            findPath(root.getLeft_node());
        }
        if(root.getRight_node() != null){
            findPath(root.getRight_node());
        }
        if(root.getRight_node() == null && root.getRight_node() == null){
        	
            results.add(new ArrayList<>(stack));
            if(!stack.isEmpty())
            	stack.pop();
            return;
        }else{
        	stack.pop();
        }
        return;
    }
    
    public int getDepth() {
		return depth;
	}


	public void setDepth(int depth) {
		this.depth = depth;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}

    public int depth = 0;
    public int max = 0;
    public int min = 9999999;
    
    /**
     * 获取二叉树的最大、最小深度
     * @param root
     * @return
     */
    public int getMaxDepth(TreeNode root){
        depth++;
        if(root.getLeft_node() != null){
			getMaxDepth(root.getLeft_node());
        }
        if(root.getRight_node() != null){
            getMaxDepth(root.getRight_node());
        }
        if(root.getLeft_node() == null && root.getRight_node()==null){
            if(depth > max){
                max = depth;
            }
            if(depth < min){
                min = depth;
                System.out.println("==================================min------" + min);
            }
            depth--;
        }else{
        	System.out.println("后退一步-----------------");
            depth--;
        }
        return max;
    }
    
    
    public int getMinDepth(TreeNode root){
        depth++;
        if(root.getLeft_node() != null){
			getMinDepth(root.getLeft_node());
        }
        if(root.getRight_node() != null){
            getMinDepth(root.getRight_node());
        }
        if(root.getLeft_node() == null && root.getRight_node()==null){
            if(depth > max){
                max = depth;
            }
            if(depth < min){
                min = depth;
                System.out.println("==================================min------" + min);
            }
            depth--;
        }else{
        	System.out.println("后退一步-----------------");
            depth--;
        }
        return min;
    }
    
    
   

	public static void main(String[] args) {
    	
//    	int []data = {10,5,12,4,7};
    	int []data = {2, 1, 3};
		BinaryTree binaryTree = new BinaryTree(data);
		TreeNode rootNode = binaryTree.getRootNode();
		System.out.println(rootNode);
		Solution0515 solution0515 = new Solution0515();
		
		int tmp = solution0515.getMaxDepth(rootNode);
		System.out.println("=======getMinDepth=======" + solution0515.getMinDepth(rootNode));
		
//		System.out.println("tmp---------------" + tmp);
//		System.out.println("max=====-=----" + solution0515.getMax());
//		System.out.println("min=====-=----" + solution0515.getMin());
//		ArrayList<ArrayList<Integer>> results2 = solution0515.FindPath(rootNode, 15);
//		System.out.println("results================");
//		for(ArrayList<Integer> tmps: results2){
//			System.out.println(tmps.toString());
//		}
	}
}
