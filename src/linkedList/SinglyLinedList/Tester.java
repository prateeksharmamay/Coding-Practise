package linkedList.SinglyLinedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList test = new SinglyLinkedList();
		LinkedListImpl l1 = new LinkedListImpl();
		
		l1.insertAtEnd(new ListNode(5));l1.insertAtEnd(new ListNode(2));l1.insertAtEnd(new ListNode(6));l1.insertAtEnd(new ListNode(4));
		
		System.out.println("Original LL: ");
		l1.displayList();
		
		ListNode temp = LinkedListImpl.sortList(l1.getHead());
		
		System.out.println("Sorted LL: ");
		LinkedListImpl.displayList(temp);
		
		/*try{
			test.testRemoveFromGivenPosition();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}*/
	}

}
