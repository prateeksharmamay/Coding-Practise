package linkedList.DoublyLinkedList;

public class DoublyTestCases {

	public void testInsertAtBeg(){
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
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
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
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
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();
		
		ListNode temp6 = list.createNode(20);
		list.insertAtGivenPosition(temp6,1);
		
		list.displayList();
		
		ListNode temp5 = list.createNode(14);
		list.insertAtGivenPosition(temp5,4);
		
		list.displayList();
	}
	
	public void testRemoveFromBeginning(){
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
		list.removeFromBeginning();
		list.displayList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		list.removeFromBeginning();
		list.displayList();
		
		ListNode temp5 = list.createNode(10);
		list.insertAtBeg(temp5);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();
		
		list.removeFromBeginning();
		list.displayList();
	}
	
	public void testRemoveFromEnd(){
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
		list.removeFromEnd();
		list.displayList();
		
		ListNode temp1 = list.createNode(10);
		list.insertAtBeg(temp1);
		
		list.removeFromEnd();
		list.displayList();
		
		ListNode temp5 = list.createNode(10);
		list.insertAtBeg(temp5);
		
		ListNode temp2 = list.createNode(11);
		list.insertAtBeg(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.insertAtBeg(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.insertAtBeg(temp4);
		
		list.displayList();
		
		list.removeFromEnd();
		list.displayList();
	}
	
	public void testRemoveFromGivenPosition(){
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		
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
		
		list.displayList();
		
		list.removeFromGivenPosition(3);
		
		list.displayList();
	}/**/
}
