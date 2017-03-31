/* 141
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */

package stringManipulation;

import linkedList.SinglyLinedList.ListNode;

public class LinkedListCycle {
	 public boolean hasCycle(ListNode head) {
	        if(head == null){
	            return false;
	        }
	        
	        ListNode f,s;
	        
	        f = head;
	        s = head;
	        
	        while(s != null && s.getNext() != null){
	            
	            f = f.getNext();
	            s = s.getNext().getNext();
	            if(f == s){
	                return true;
	            }
	            
	        }
	        
	        return false;
	    }
}
