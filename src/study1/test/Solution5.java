package study1.test;

import study1.linkedlist.ListNode;

public class Solution5 {
	
public ListNode Merge(ListNode list1,ListNode list2) {
        
        ListNode result = new ListNode(0);
        if(list1.getVal() <= list2.getVal()){
			result.setVal(list1.getVal());
            list1 = list1.getNext();
        }else{
        	result.setVal(list2.getVal());
        	list1 = list2.getNext();
        }
        while(list1.getNext() != null || list2.getNext() != null){
			if(list1.getNext() == null){
                result.setNext(list2);
                break;
            }else if(list2.getNext() == null){
               result.setNext(list1);
                break;
            }else{
            	if(list1.getVal() <= list2.getVal()){
        			result.setNext(new ListNode(list1.getVal()));
                    list1 = list1.getNext();
                }else{
                    result.setNext(new ListNode(list2.getVal()));
                    list1 = list2.getNext();
                }
           }
        }
        return result;
        
    }

}
