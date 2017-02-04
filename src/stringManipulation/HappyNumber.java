package stringManipulation;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		int x = 18;
		int flag = 0;
		HashSet<Integer> numSet = new HashSet<Integer>();
		int temp = x;
		while(numSet.add(temp)){
			temp = calcSum(temp);
			
			if(temp == 1){
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1){
			System.out.println(x + " is Happy Number.");

		}
		else{
			System.out.println(x + " is not a Happy Number.");
		}
	}
	
	static int calcSum(int x){
		int sum = 0, temp = 0;
		while(x != 0){
			temp = x % 10;
			sum += Math.pow(temp, 2);
			
			x = x / 10;
		}
		return sum;
	}
}
