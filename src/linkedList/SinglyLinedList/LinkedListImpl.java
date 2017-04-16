package linkedList.SinglyLinedList;

public class LinkedListImpl {
	ListNode head;
	private int listLength;
	
	public LinkedListImpl() {
		head = null;
		listLength = 0;
	}
	
	public synchronized ListNode getHead(){
		return head;
	}
	
	////////////////////////////
	// INSERTION SECTION
	////////////////////////////
	public void insertAtBeg(ListNode temp){
		if(head == null){
			head = temp;
		}
		
		else{
			temp.setNext(head);
			head = temp;
			this.listLength++;
		}
		this.listLength++;
	}
	
	public void insertAtEnd(ListNode temp){
		if(head == null){
			head = temp;
		}
		else{
			ListNode node = head;
			
			while(node != null){
				if(node.getNext() == null){
					node.setNext(temp);
					break;
				}
				node = node.getNext();
			}
		}
		this.listLength++;
	}
	
	public void insertAtGivenPosition(ListNode temp, int pos){
		if(pos < 1){
			pos = 1;
		}
		
		else if(pos > listLength){
			pos = listLength;
		}
		
		if(head == null){
			head = temp;
			this.listLength++;
		}
		
		else if(pos == 1){
			temp.setNext(head);
			head = temp;
			this.listLength++;
		}
		
		else{
			ListNode node = head;
			
			for(int i = 1 ; i < pos-1 ; i++){
				node = node.getNext();
			}
			
			temp.setNext(node.getNext());
			node.setNext(temp);
			
			this.listLength++;
		}
	}
	
	////////////////////////////
	// DELETE SECTION
	////////////////////////////
	
	public void removeFromBeginning(){
		if(head == null){
			System.out.println("Empty List ");
			return;
		}
		
		ListNode temp = head;
		
		head = head.getNext();
		this.listLength--;
		System.out.println("Deleted Node : "+temp.getData());
	}
	
	public void removeFromEnd(){
		ListNode temp = head;
		ListNode secLast = head;
		
		if(head == null){
			System.out.println("Empty List ");
			return;
		}
		
		else if(temp.getNext() == null){
			head = null;
			this.listLength--;
		}
		
		else{
			while(temp != null){
				
				if(temp.getNext() == null){
					break;
				}
				secLast = temp;
				temp = temp.getNext();
			}
			secLast.setNext(null);
			this.listLength--;
		}
		
		System.out.println("Deleted Node : "+temp.getData());
		System.out.println("Head Node : "+head.getData());
	}
	
	public void removeFromGivenPosition(int pos){
		ListNode temp = new ListNode();
		
		if(pos < 1){
			System.out.println("Invalid Position");
		}
		
		else if(pos > listLength){
			System.out.println("Invalid Position");
		}
		
		if(head == null){
			System.out.println("Empty List");
			return;
		}
		
		else if(pos == 1){
			temp = this.getHead();
			head = head.getNext();
			this.listLength--;
			System.out.println("Deleted Node - POS : "+pos+" || DATA: "+ temp.getData());
		}
		
		else{
			temp = this.getHead();
			for(int i = 1; i < pos-1; i++){
				temp = temp.getNext();
			}
			ListNode delNode = temp.getNext();
			temp.setNext(temp.getNext().getNext());
			System.out.println("Deleted Node - POS : "+pos+" || DATA: "+ delNode.getData());
		}
		
	}
	
	////////////////////////////
	
	public void displayList(){
		ListNode tempHead = this.getHead();
		while(tempHead != null){
			System.out.println(tempHead.getData()+"\t");
			tempHead = tempHead.getNext();
		}
	}
	
	public static void displayList(ListNode tempHead){
//		ListNode tempHead = this.getHead();
		while(tempHead != null){
			System.out.println(tempHead.getData()+"\t");
			tempHead = tempHead.getNext();
		}
	}
	
	public ListNode createNode(int data){
		ListNode temp = new ListNode();
		temp.setData(data);
		
		return temp;
	}
}
