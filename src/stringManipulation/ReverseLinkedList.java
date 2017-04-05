/* 206
Reverse a singly linked list.
 */

package stringManipulation;

import linkedList.SinglyLinedList.ListNode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head){
        if(head == null || head.getNext() == null){
            return head;   
        }
        
        ListNode temp = head;
        
        ListNode newNode = null;;
        ListNode newHead = null;
        
        while(temp != null){
            
            newNode = new ListNode(temp.getData());
            
            if(newHead == null){
                newHead = newNode;   
            }
            else{
                newNode.setNext(newHead);
                newHead = newNode;
            }
            
            temp = temp.getNext();
        }
       
        return newHead;
        
    }
}
