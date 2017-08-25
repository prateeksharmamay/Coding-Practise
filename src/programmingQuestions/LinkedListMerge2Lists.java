package programmingQuestions;

import linkedList.SinglyLinedList.LinkedListImpl;
import linkedList.SinglyLinedList.ListNode;

public class LinkedListMerge2Lists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.getData() < l2.getData()){
			l1.setNext(mergeTwoLists(l1.getNext(), l2));
			return l1;
		} else{
			l2.setNext(mergeTwoLists(l1, l2.getNext()));
			return l2;
		}
	}
	
	public static void main(String abc[]){
		LinkedListImpl l1 = new LinkedListImpl();
		
		l1.insertAtEnd(new ListNode(2));
		l1.insertAtEnd(new ListNode(5));
		
		LinkedListImpl l2 = new LinkedListImpl();
		
		l2.insertAtEnd(new ListNode(4));
		l2.insertAtEnd(new ListNode(6));
		l2.insertAtEnd(new ListNode(7));
		
		System.out.println("List 1: ");
		l1.displayList();
		
		System.out.println("List 2: ");
		l2.displayList();
		
		ListNode l3 = mergeTwoLists(l1.getHead(), l2.getHead());
		
		System.out.println("List 3: ");
		LinkedListImpl.displayList(l3);
	}
}
