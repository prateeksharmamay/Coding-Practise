package linkedList.SinglyLinedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList test = new SinglyLinkedList();
		
		try{
			test.testRemoveFromGivenPosition();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}