package stringManipulation;

import java.util.Arrays;

public class ArraysPractise {

	public static void main(String[] args) {
		int a[] = {1,2,5,3,4,5,50,-1,5,6,99};
		int b[] = {1,2,5,3,4,5,50,-1,5,6,99};
		int c[] = {1,2,5,3,6,99};
		int len = a.length;
		int pos = 5;
		int data = 5;
		System.out.println(a.length);

//		int[] res = insertElementInArray(a,pos,data); // Insert In Array
		
//		int[] res = deleteInArrayByPosition(a,pos); // Delete In Array by position
		
		System.out.println("\nAre arrays a & b same : "+Arrays.equals(a, b));
		System.out.println("\nAre arrays b & c same : "+Arrays.equals(b, c));
		
		//////////////////////////////
		System.out.println("\n\n Max Element in Array: "+ maxElement(a));
		
		System.out.println("\n\n Min Element in Array: "+ minElement(a));
		
		/////////////////////////////
		System.out.println("\n\n Second Max Element in Array: "+ secondToMaxElement(a));
		
		System.out.println("\n\n Second Min Element in Array: "+ secondToMinElement(a));
		
		////////////////////////////
		int[] res = deleteInArrayByValue(a,data); // Delete In Array by value
		
		System.out.println("Resultant Array: ");
		
		////////////////////////////
		Arrays.sort(res);
		System.out.println("\n\n Sorted Array: ");
		System.out.print(Arrays.toString(res));
		
		///////////////////////////
		
	}
	
	//////////////////////////////////////////////////
	// Method Definitions
	/////////////////////////////////////////////////
	public static int[] insertElementInArray(int a[], int pos, int data){
		a = Arrays.copyOf(a, a.length+1);
		int len = a.length;
		
		for(int i = pos-1; i < len-1;i++){
			a[i+1] = a[i];
		}
		a[pos-1] = data;
		
		return a;
	}
	
	public static int[] deleteInArrayByPosition(int a[], int pos){
		
		System.out.println("Deleted Element: "+ a[pos-1]);
		
		for(int i = pos-1; i < a.length-1; i++){
			a[i] = a[i+1];
		}
		
		a = Arrays.copyOf(a, a.length-1);
		return a;
	}
	
	public static int[] deleteInArrayByValue(int a[], int data){ // Will delete Multiple entries
		System.out.println("Element to be Deleted: "+ data);
		int count =0;
		for(int i = 0; i < a.length;i++){
//			System.out.println("i: "+ i);
			if(a[i] == data){
//				System.out.println("a[i]: "+ a[i]);
				count++;
				for(int j = i; j < a.length-1;j++){
//					System.out.println("a[j]: "+ a[j]);
					a[j] = a[j+1];
//					System.out.println("a[j]: "+ a[j]);
				}
				i--;
				a = Arrays.copyOf(a, a.length-1);
			}
		}
		System.out.println("Ocuurences of "+data+" : "+ count);
		return a;
	}
	
	public static int minElement(int a[]){
		int min;
		
		min = a[0];
		
		for(int i=1; i < a.length; i++){
			if(min > a[i]){
				min = a[i];
			}
		}
		
		return min;
	}
	
	public static int secondToMinElement(int a[]){
		int min;
		int smin;
		
		min = a[0];
		smin = a[0];
		
		for(int i=1; i < a.length; i++){
			if(min > a[i]){
				smin = min;
				min = a[i];
			}
		}
		
		return smin;
	}
	
	public static int maxElement(int a[]){
		int max;
		
		max = a[0];
		
		for(int i=1; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static int secondToMaxElement(int a[]){
		int max;
		int smax;
		
		max = a[0];
		smax = a[0];
		
		for(int i=1; i < a.length; i++){
			if(max < a[i]){
				smax = max;
				max = a[i];
			}
		}
		
		return smax;
	}

}
