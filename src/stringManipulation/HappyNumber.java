package stringManipulation;

import java.util.HashSet;
/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
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
