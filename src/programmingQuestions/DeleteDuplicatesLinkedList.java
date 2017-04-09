/* 83
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

Subscribe to see which companies asked this question.
 */


package programmingQuestions;

import linkedList.SinglyLinedList.ListNode;

public class DeleteDuplicatesLinkedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.getNext() == null){
            return head;
        }
        
        ListNode tmp = head;
        
        if(tmp.getData() == tmp.getNext().getData()){
        	tmp.setNext(tmp.getNext().getNext());
            deleteDuplicates(tmp);
        }
        else{
            deleteDuplicates(tmp.getNext());
        }
        return head;
        
        
        /*if(head == null){
            return head;
        }

        ListNode tmp = head;
        
        while(tmp != null){
            if(tmp.next == null){
                break;
            }
            if(tmp.val == tmp.next.val){
                tmp.next = tmp.next.next;
            }
            else{
                tmp = tmp.next;
            }
        }
        return head;*/
    }
}
