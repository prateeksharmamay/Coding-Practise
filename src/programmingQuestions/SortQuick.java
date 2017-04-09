package programmingQuestions;

public class SortQuick {
	static int a[];
	
	public SortQuick(int a[]) {
		this.a = a;
	}
	
	public void quickSort(int start, int end){
		
		if(start < end){
			int pIndex = randomizedPartition(start,end);
			
			quickSort(start, pIndex-1);
			quickSort(pIndex+1, end);
		}
	}
	
	public static int randomizedPartition(int start, int end){
		
		int pivotIndex = start + (int) (Math.random() * ((end-start)+1));
		
		swapInArray(pivotIndex, end);
		
		return partion(start,end);
	}
	
	public static int partion(int start, int end){
		
		int pIndex = start;
		int pivot = a[end];
		
		for(int i = start ; i < end ; i++){
			if(a[i] <= pivot ){
				swapInArray(i, pIndex);
				pIndex++;
			}
		}	
		swapInArray(pIndex, end);
		
		return pIndex;
	}
	
	public static void swapInArray(int one, int two){
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	public static void main(String args[]){
		int a[] = {7,2,1,6,8,5,3,4};
		
		SortQuick obj = new SortQuick(a);
		
		obj.quickSort(0, a.length-1);
		
		for(int i = 0 ; i < a.length ; i++){
			System.out.println(a[i]);
		}
	}
}