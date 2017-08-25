package linkedList.DoublyLinkedList;

public class DoublyLinkedListImpl {
	ListNode head;
	ListNode tail;
	int len;
	
	public DoublyLinkedListImpl() {
		head = null;
		tail = null;
		len = 0;
	}
	
	void insertAtBeg(ListNode temp){
		
		if(head == null){
			head = temp;
			tail = temp;
		}
		
		else{
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}
		
	}
	
	void insertAtEnd(ListNode temp){
		
		if(head == null){
			head = temp;
			tail = temp;
		}
		
		else{
			tail.setNext(temp);
			temp.setPrev(tail);
			tail = temp;
		}
		
	}
	
	void insertAtGivenPosition(ListNode temp, int pos){
		
		if(head == null){
			head = temp;
			tail = temp;
		}
		
		else{
			
			if(pos < 1){
				System.out.println("Invalid position");
			}
			
			else if(pos == 1){
				insertAtBeg(temp);
			}
			
			else{
				ListNode node = head;
				for(int i = 1 ; i < pos ; i++){
					node = node.getNext();
				}
				
				ListNode prev = node.getPrev();
				
				prev.setNext(temp);
				temp.setPrev(prev);
				
				temp.setNext(node);
				node.setPrev(temp);
			}
		}
		
	}
	
	///////////////////////////
	// REMOVE
	///////////////////////////
	
	void removeFromBeginning(){
		if(head == null){
			System.out.println("Empty List");
		}
		
		else if(head == tail){
			System.out.println("Delete Node: "+ head.getData());
			
			head = null;
			tail = null;
		}
		
		else{
			System.out.println("Delete Node: "+ head.getData());
			
			ListNode temp = head;
			
			head = head.getNext();
			head.setPrev(null);
			temp.setNext(null);
		}
	}
	
	void removeFromEnd(){
		if(head == null){
			System.out.println("Empty List");
		}
		
		else if(head == tail){
			System.out.println("Delete Node: "+ head.getData());
			
			head = null;
			tail = null;
		}
		
		else{
			System.out.println("Delete Node: "+ tail.getData());
			
			ListNode temp = tail;
			
			tail = tail.getPrev();
			tail.setNext(null);
			temp.setPrev(null);
		}
	}
	
	void removeFromGivenPosition(int pos){
		if(head == null){
			System.out.println("Empty List");
		}
		
		else{
			
			if(pos < 1){
				System.out.println("Invalid position");
			}
			
			else if(pos == 1){
				removeFromBeginning();
			}
			
			else{
				ListNode node = head;
				for(int i = 1 ; i < pos ; i++){
					node = node.getNext();
				}
				
				ListNode prev = node.getPrev();
				
				prev.setNext(node.getNext());
				node.getNext().setPrev(node.getPrev());
				
				node = null;
			}
		}
	}
	
	
	//////////////////////////
	
	public ListNode createNode(int data){
		ListNode temp = new ListNode();
		temp.setData(data);
		
		return temp;
	}
	
	void displayList(){
		if(head == null){
			return;
		}
		
		ListNode temp = head;
		System.out.println();
		while(temp != tail){
			System.out.print(temp.getData()+"\t");
			temp = temp.getNext();
		}
		System.out.print(temp.getData()+"\t");
	}
}