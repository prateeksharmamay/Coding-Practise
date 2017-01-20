package stringManipulation;

import java.util.Arrays;

public class AddElementInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6};
		int len = a.length;
		int pos = 5;
		int data = 5;
		System.out.println(a.length);

		a = Arrays.copyOf(a, len+1);
		len = a.length;
		
		for(int i = pos-1; i < len-1;i++){
			a[i+1] = a[i];
		}
		a[pos-1] = data;
		for(int i =0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
