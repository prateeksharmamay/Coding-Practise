package linkedList.CircularLinkedList;

public class CLinkedListImpl {
	private ListNode tail;
	private int length;
	
	public CLinkedListImpl() {
		tail = null;
		length = 0;
	}
	
	public synchronized ListNode getTail(){
		return tail;
	}
	
	////////////////////////////
	// INSERTION SECTION
	////////////////////////////
	
	public void cInsertAtBeginning(ListNode temp){
		if(tail == null){
			tail = temp;
			tail.setNext(tail);
		}
		
		else{
			temp.setNext(tail.getNext());
			tail.setNext(temp);
		}
		length++;
	}
	
	public void cInsertAtEnd(ListNode temp){
		cInsertAtBeginning(temp);
		tail = tail.getNext();
		length++;
	}
	
	public void deleteFromBeg(){
		ListNode temp = new ListNode();
		if(tail == null){
			System.out.println("Empty List");
			return;
		}
		
		else if(tail == tail.getNext()){
			temp = tail;
			tail = null;
		}
		
		else{
			temp = tail.getNext();
			tail.setNext(tail.getNext().getNext());
			temp.setNext(null);
		}
		length--;
		System.out.println("Deleted Node: "+temp.getData());
	}
	
	public void deleteFromEnd(){
		ListNode temp = new ListNode();
		if(tail == null){
			System.out.println("Empty List");
			return;
		}
		
		else if(tail == tail.getNext()){
			temp = tail;
			tail = null;
			System.out.println("Deleted Node: "+temp.getData());
		}
		
		else{
			temp = tail;
			ListNode delNode = new ListNode();
			while(temp.getNext() != tail){
				temp = temp.getNext();
			}
			delNode = tail;
			temp.setNext(tail.getNext());
			tail = temp;
			delNode.setNext(null);
			System.out.println("Deleted Node: "+delNode.getData());
		}
		length--;
	}
	
	////////////////////////////
	
	public void displayList(){
		if(this.getTail() == null){
			return;
		}
		ListNode tailTemp = this.getTail().getNext();
		while(tailTemp != tail){
			System.out.println(tailTemp.getData()+"\t");
			tailTemp = tailTemp.getNext();
		}
		System.out.print(tailTemp.getData()+"\t");
	}
	
	public ListNode createNode(int data){
		ListNode temp = new ListNode();
		temp.setData(data);
		
		return temp;
	}
}
