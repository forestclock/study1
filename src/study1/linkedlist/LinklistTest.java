package study1.linkedlist;

import java.util.Stack;

public class LinklistTest {

	public static void main(String[] args) {
		
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		listNode1.setNext(listNode2);
		listNode2.setNext(listNode3);
		listNode3.setNext(listNode4);
		listNode4.setNext(listNode5);
		listNode5.setNext(null);
		System.out.println(listNode1);
		ListNode result = ReverseList(listNode1);
		System.out.println(result);
	}
	/**
	 * @desc 链表的翻转
	 * @param head
	 * @return
	 */
	public static ListNode ReverseList(ListNode head) {
		System.out.println("head-----------" + head);
		if(head != null){
			Stack<ListNode> stack = new Stack<>();
	        ListNode first = head;
	        System.out.println("first----------" + first.getNext());
	        ListNode result = new ListNode();
	        result.setNext(null);
	        result.setVal(head.getVal());
	        stack.push(result);
	        System.out.println("head----------" + head);
	        while(first.getNext() != null){
	        	
	            first = first.getNext();
	            System.out.println("------------------" + first);
	            result = new ListNode(first.getVal(), stack.pop());
	            stack.push(result);
	        }
	        return result;
	    }else{
	    	return null;
	    }
	}
		
}
