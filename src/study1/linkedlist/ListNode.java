package study1.linkedlist;
/**
 * 
 * @ClassName Node
 * @Description 链表结点的定义
 * @author zhong
 * @date 2017年3月5日下午7:59:57
 *
 */
public class ListNode {
	
	private int val;
	private ListNode next;
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
	
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public ListNode(int val) {
		super();
		this.val = val;
	}
	
	
    public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}
	public ListNode() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Node [val=" + val + ", next=" + next + "]";
	}
	
	

}
