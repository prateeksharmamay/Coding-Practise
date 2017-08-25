package programmingQuestions;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int w = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
				w++;
			}
		}
		
		System.out.println(w+1);
	}

}
