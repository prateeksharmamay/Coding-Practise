package sorting.Heap;

import java.util.Arrays;

public class Heap {
	private int[] arr;
	private int capacity;
	private int count;
//	private int heapType;
	
	public Heap(int capacity) {
		this.capacity = capacity;
		this.count = 0;
		this.arr = new int[capacity];
//		this.heapType = heapType;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/*public int getHeapType() {
		return heapType;
	}

	public void setHeapType(int heapType) {
		this.heapType = heapType;
	}*/
	
	
	// METHODS
	
	public int getParent(int i){ // i is index of node whose parent we need to find
		if(i <=0 || i >= this.count ){
			return -1;
		}
		
		return (i-1)/2;
	}
	
	public int getLeftChild(int i){
		int LChild = 2*i+1;
		
		if(LChild >= this.count){
			return -1;
		}
		return LChild;
	}
	
	public int getRightChild(int i){
		int RChild = 2*i+2;
		
		if(RChild >= this.count){
			return -1;
		}
		return RChild;
	}
	
	public int getMaxElement(){
		
		if(this.count == 0){
			return -1;
		}
		return this.arr[0];
	}
	
	public void percolateDown(int i){
		int left, right, max;
		
		left = getLeftChild(i);
		right = getRightChild(i);
		
		if(left != -1 && this.arr[i] < arr[left]){
			max = left;
		}
		else{
			max = i;
		}
		
		if(right != -1 && this.arr[max] < arr[right]){
			max = right;
		}
		
		if(max != i){
			int temp = this.arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		
		else{
			return;
		}
		percolateDown(max);
	}
	
	@Override
	public String toString(){
		String res = "";
		
		for(int i = 0 ; i < this.count ; i++){
			res += this.arr[i] + "\t";
		}
		
		return res;
	}
	
	public void resizeHeap(){
		int oldArr[] = new int[this.capacity];
		
		oldArr = Arrays.copyOf(this.arr, this.count);
		
		this.arr = new int[2*this.capacity];
		
		if(this.arr == null){
			System.out.println("Memory Error");
			return;
		}
		for(int i = 0 ; i < this.capacity ; i++){
			this.arr[i] = oldArr[i];
		}
		
		this.capacity *= 2;
		oldArr = null;
	}
	
	public void buildHeap(int a[], int n){ // n is the size of the array, if remaining space in Heap is less than that of size of array we resize the Heap.
		/*if(this == null){
			return;
		}*/
		
		while(n > this.capacity){
			this.resizeHeap();
		}
		
		// 1. Insert all elements from array into heap
		// 2. start from the last non-leaf node and percolate it down
		// 3. At the end, we will have the perfect heap with us.
		
		//1.
		for(int i = 0; i < n ; i++){
			this.arr[i] = a[i];
		}
		
		this.count = n;
		
		for(int i = (n-1)/2 ; i >= 0 ; i--){
			this.percolateDown(i);
		}
	}
	
	public void insertData(int data){
		if(this.count == this.capacity){
			this.resizeHeap();
		}
		this.count++;
		
		int i = this.count-1;
		
		while(i > 0 && data > this.arr[(i-1)/2]){
			this.arr[i] = this.arr[(i-1)/2];
			i = (i-1)/2;
		}
		this.arr[i] = data;
	}
	
	public int deleteMax(){
		if(this.count == 0){
			return -1;
		}
		
		int data = this.arr[0];
		
		this.arr[0] = this.arr[this.count-1];
		this.count--;
		
		this.percolateDown(0);
		
		return data;
	}
}
