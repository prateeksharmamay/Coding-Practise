package linkedList.CircularLinkedList;

public class Tester {

	public static void main(String[] args) {
		CircularLinkedList test = new CircularLinkedList();
		
		try{
			test.testRemoveFromEnd();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}