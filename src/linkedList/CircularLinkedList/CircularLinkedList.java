package linkedList.CircularLinkedList;

public class CircularLinkedList {

	public void testInsertAtBeg(){
		CLinkedListImpl list = new CLinkedListImpl();
		
		ListNode temp1 = list.createNode(10);
		list.cInsertAtBeginning(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.cInsertAtBeginning(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.cInsertAtBeginning(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.cInsertAtBeginning(temp4);
		
		list.displayList();
	}
	
	public void testInsertAtEnd(){
		CLinkedListImpl list = new CLinkedListImpl();
		
		ListNode temp1 = list.createNode(10);
		list.cInsertAtEnd(temp1);
		
		ListNode temp2 = list.createNode(11);
		list.cInsertAtEnd(temp2);
		
		ListNode temp3 = list.createNode(12);
		list.cInsertAtEnd(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.cInsertAtEnd(temp4);
		
		list.displayList();
	}
	/*
	public void testInsertAtGivenPosition(){
		CLinkedListImpl list = new CLinkedListImpl();
		
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
	*/
	
	public void testRemoveFromBeginning(){
		CLinkedListImpl list = new CLinkedListImpl();
		list.deleteFromBeg();
		list.displayList();
		ListNode temp1 = list.createNode(10);
		list.cInsertAtBeginning(temp1);
		
		list.deleteFromBeg();
		list.displayList();
		ListNode temp2 = list.createNode(11);
		list.cInsertAtBeginning(temp2);
		
		ListNode temp5 = list.createNode(10);
		list.cInsertAtBeginning(temp5);
		
		ListNode temp6 = list.createNode(11);
		list.cInsertAtBeginning(temp6);
		
		ListNode temp3 = list.createNode(12);
		list.cInsertAtBeginning(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.cInsertAtBeginning(temp4);
		
		list.displayList();
		
		list.deleteFromBeg();
		list.displayList();
	}
	
	public void testRemoveFromEnd(){
		CLinkedListImpl list = new CLinkedListImpl();
		
		list.deleteFromEnd();
		list.displayList();
		ListNode temp1 = list.createNode(10);
		list.cInsertAtBeginning(temp1);
		
		list.deleteFromEnd();
		list.displayList();
		ListNode temp2 = list.createNode(11);
		list.cInsertAtBeginning(temp2);
		
		ListNode temp5 = list.createNode(10);
		list.cInsertAtBeginning(temp5);
		
		ListNode temp6 = list.createNode(11);
		list.cInsertAtBeginning(temp6);
		
		ListNode temp3 = list.createNode(12);
		list.cInsertAtBeginning(temp3);
		
		ListNode temp4 = list.createNode(13);
		list.cInsertAtBeginning(temp4);
		
		list.displayList();
		
		list.deleteFromEnd();
		list.displayList();
	}
	/*
	public void testRemoveFromGivenPosition(){
		CLinkedListImpl list = new CLinkedListImpl();
		
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
		
		list.removeFromGivenPosition(2);
		
		list.displayList();
	}*/
}
