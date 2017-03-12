package sorting.Heap;

public class TestHeap {
	public static void main(String args[]){
		int arr[] = {2,4,1,3,5,6};
		
		Heap h= new Heap(10);
		
		/*h.buildHeap(arr, arr.length);
		System.out.println(h);
		
		h.insertData(7);
		System.out.println(h);
		
		System.out.println("Deleted Element: "+ h.deleteMax());
		System.out.println(h);*/
		
		/* Heap Sort:
		 * 1. We build a heap using given array.
		 * 2. Removes the root and replace it with the last element.
		 * 3. Heapify or percolate down to make it a heap again.
		 * 4. Repeat the process until heap is empty.
		 */
		
		System.out.println("Heap Sort:\n\n");
		h.buildHeap(arr, arr.length);
		System.out.println(h);
		while(h.getCount() != 0){
			System.out.println(h.deleteMax());
		}
		
		
		
	}
}
