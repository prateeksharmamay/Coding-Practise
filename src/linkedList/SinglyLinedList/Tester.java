package linkedList.SinglyLinedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList test = new SinglyLinkedList();
		
		try{
			test.testRemoveFromEnd();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}
