/*234
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */

package programmingQuestions;

import java.util.Stack;

import linkedList.SinglyLinedList.ListNode;

public class LinkedListPallindrome {
	public boolean isPalindrome(ListNode head) {
        if(head == null){
           return true; 
        }
        // ListNode tmp = head;
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> s = new Stack<>();
        
        while(fast != null && fast.getNext() != null){
            s.push(slow.getData());
            
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        
        if(fast != null){
            slow = slow.getNext();
        }
        
        while(slow != null){
            if(slow.getData() != s.pop().intValue()){
                return false;
            }
            slow = slow.getNext();
        }
        
        return true;
    }
}
