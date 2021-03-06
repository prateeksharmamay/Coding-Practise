package linkedList.SinglyLinedList;

public class SinglyLinkedList {

	public void testInsertAtBeg(){
		LinkedListImpl list = new LinkedListImpl();
		
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
		LinkedListImpl list = new LinkedListImpl();
		
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
		LinkedListImpl list = new LinkedListImpl();
		
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
		LinkedListImpl list = new LinkedListImpl();
		
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
		LinkedListImpl list = new LinkedListImpl();
		
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
	
	public void testRemoveFromGivenPosition(){
		LinkedListImpl list = new LinkedListImpl();
		
		list.removeFromGivenPosition(1);
		list.displayList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		list.removeFromGivenPosition(1);
		list.displayList();
		
		ListNode temp5 = list.createNode(10);
		list.insertAtBeg(temp5);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();/**/
		
		list.removeFromGivenPosition(2);
		
		list.displayList();
	}
}
