package stringManipulation;

import java.util.Scanner;

public class SuperReducedString {
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder s = new StringBuilder(input);
		int k = 0;
		for(int i = 0; i < s.length()-1;){
			k=0;
			if(s.charAt(i) == s.charAt(i+1)){

				s.delete(i, i+2);
				
				/*for(int j = i; j < s.length()-2; j++){
					s.setCharAt(j, s.charAt(j+2));
				}
				s.setLength(s.length()-2);*/

				if(i != 0){
					i--;
				}
				k = 1;
			}
			if(k==0){
				i++;
			}
		}

		if(s.length() == 0){
			System.out.println("Empty String");
		}
		else{
			System.out.println(s);
		}
		scanner.close();
	}
}
