package linkedList.DoublyLinkedList;

public class ListNode {
	private int data;
	private ListNode next;
	private ListNode prev;
	
	public ListNode() {
		data = 0;
		next = null;
		prev = null;
	}
	
	public ListNode(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public ListNode getPrev() {
		return prev;
	}

	public void setPrev(ListNode prev) {
		this.prev = prev;
	}
	
}
