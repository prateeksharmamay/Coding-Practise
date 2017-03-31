package stringManipulation;

import linkedList.SinglyLinedList.ListNode;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        
       /* Recursion failed due to stackoverflow, otherwise logic works fine
        if(head.getNext() != null && head.getNext().val == val){
            System.out.println("Should be 6: "+head.val);
            head.getNext() = head.getNext().getNext();
            removeElements(head,val);
        }
        else{
            System.out.println(head.val);
            removeElements(head.getNext(),val);
        }*/
        
        while(head != null && head.getData() == val){
            head = head.getNext();
        }
        
        ListNode tmp = head;
        ListNode prev = null;
        
        while(tmp != null){
            
            while(tmp != null && tmp.getData() == val){
                prev.setNext(tmp.getNext());
                tmp = tmp.getNext();
            }
            
            prev = tmp;
            
            if(tmp != null){
                 tmp = tmp.getNext();
            }
        }
        
        return head;
    }
}
