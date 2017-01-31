package linkedList.SinglyLinedList;

public class SinglyLinkedList {

	public void testInsertAtBeg(){
		LinkedList list = new LinkedList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();
	}
	
	public void testInsertAtEnd(){
		LinkedList list = new LinkedList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtEnd(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtEnd(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtEnd(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtEnd(temp4);
		
		list.displayList();
	}
	
	public void testInsertAtGivenPosition(){
		LinkedList list = new LinkedList();
		
		list.displayList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtGivenPosition(temp1,-1);
		
		list.displayList();
		
		ListNode temp2 = list.createNode(11);
		list.insertAtGivenPosition(temp2,0);
		
		list.displayList();
		
		ListNode temp3 = list.createNode(12);
		list.insertAtGivenPosition(temp3,1);
		
		list.displayList();
		
		ListNode temp4 = list.createNode(13);
		list.insertAtGivenPosition(temp4,2);
		
		list.displayList();
		
		ListNode temp5 = list.createNode(14);
		list.insertAtGivenPosition(temp5,3);
		
		list.displayList();
	}
	
	public void testRemoveFromBeginning(){
		LinkedList list = new LinkedList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();
		/**/
		list.removeFromBeginning();
		list.displayList();
	}
	
	public void testRemoveFromEnd(){
		LinkedList list = new LinkedList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();/**/
		
		list.removeFromEnd();
		
		list.displayList();
		
		list.removeFromEnd();
		
		list.displayList();
	}
}
