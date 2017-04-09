/* 61
 Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
 */

package programmingQuestions;

import linkedList.SinglyLinedList.ListNode;

public class LinkedListRotate {
	
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.getNext() == null){
            return head;
        }
       
       ListNode curr = head;
       int count = 1 ;
       
       while(curr.getNext() != null){
          
           curr = curr.getNext();
            count++;
       }
       
       /*if(count == k){
           return head;
       }*/
      
       curr.setNext(head);
       
       for(int i = count-k %count ; i > 1  ; i--){
           System.out.println("1");
           head = head.getNext();
       }

       curr = head.getNext();
       head.setNext(null);
       return curr;
    }
	
	/*
	 * Input = [1,2,3,4]  6
	 * Output = [4,3,1,2]
	 * public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int length = 0;
        
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        if(length == k){
            return head;
        }
        
        int rotVal = Math.abs(length-k)%length;
        
        temp = head;
        for(int i = 0 ; i < rotVal-1 ; i++){
            temp = temp.next;
        }
        
        ListNode rotate = temp.next;
        
        temp.next = null;
        ListNode next;
        while(rotate != null){
            next = rotate.next;
            rotate.next = head;
            head = rotate;
            
            rotate = next;
        }
        
        return head;
    }*/
}
