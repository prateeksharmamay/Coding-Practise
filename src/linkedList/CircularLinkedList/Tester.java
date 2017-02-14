package linkedList.CircularLinkedList;


public class Tester {

	public static void main(String[] args) {
		CircularLinkedList test = new CircularLinkedList();
		
		int three = 0 , five = 0 , tf = 0;
		for(int i = 1 ; i < 101 ; i++){
			if(i % 15 == 0){
				System.out.println("rightpoint");
			}
			
			else if(i % 5 == 0){
				System.out.println("point");
			}
			
			else if(i % 3 == 0){
				System.out.println("right");
			}
			
			else{
				System.out.println(i);
			}
		}
		
		/*try{
			test.testRemoveFromEnd();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e);
		}*/
	}

}