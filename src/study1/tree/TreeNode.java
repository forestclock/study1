package study1.tree;

/**
 * 
 * @ClassName TreeNode
 * @Description 树节点声明类
 * @author zhong
 * @date 2017年3月8日下午9:53:25
 *
 */
public class TreeNode {
	
	private int value;
	private TreeNode left_node;
	private TreeNode right_node;
	
	public TreeNode(int value) {
		this.value = value;
		this.left_node = null;
		this.right_node = null;
	}
	
	public TreeNode(){
		
	}
	
	public int getValue() {
		return value;
	}
	
	public TreeNode getLeft_node() {
		return left_node;
	}

	public void setLeft_node(TreeNode left_node) {
		this.left_node = left_node;
	}

	public TreeNode getRight_node() {
		return right_node;
	}

	public void setRight_node(TreeNode right_node) {
		this.right_node = right_node;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TreeNode [value=" + value + ", left_node=" + left_node + ", right_node=" + right_node + "]";
	}
	
}


