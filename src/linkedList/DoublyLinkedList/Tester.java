package linkedList.DoublyLinkedList;

public class Tester {

	public static void main(String[] args) {
		DoublyTestCases test = new DoublyTestCases();
		
		try{
			test.testRemoveFromGivenPosition();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}
