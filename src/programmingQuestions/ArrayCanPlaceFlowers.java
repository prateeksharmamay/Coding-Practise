/* 605. Can Place Flowers
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
 */


package programmingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayCanPlaceFlowers {
	// Optimized Solution
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i++] = 1;
                count++;
            }
             if(count>=n)
                return true;
            i++;
        }
        return false;
    }
	
	/*public boolean canPlaceFlowers(int[] a, int n) {
        int c = 0 ;
        int len = a.length;
        List<Integer> index = new ArrayList<>();
        
        if (len == 1 && a[0]==0) return true;
        
        for(int i =0; i < len ; i++) {
            if(a[i] == 0){
                if(i == 0){
                    if(a[i+1] == 0){
                    	c++;
                    	index.add(i);
                    }
                }
                else if(i == len-1){
                    if(a[i-1] == 0 && !index.contains(i-1)){
                    	c++;
                    	index.add(i);
                    }
                }
                else if(a[i+1] == 0  && !index.contains(i+1) && a[i-1] ==0 && !index.contains(i-1)){
                    c++;
                    index.add(i);
                }
            }
        }
        System.out.println(c);
        return n <= c;
    }*/
	
	public static void main(String args[]) {
		ArrayCanPlaceFlowers obj = new ArrayCanPlaceFlowers();
		int a[] = {1,0,0,0,0,1};
		int n=2;
		
		System.out.println(obj.canPlaceFlowers(a, n));
	}
}