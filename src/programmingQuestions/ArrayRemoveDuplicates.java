/* 26
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


 */

package programmingQuestions;

public class ArrayRemoveDuplicates {
	public int removeDuplicates(int[] a) {
        int count = 1; 
        
        for(int i = 1 ; i < a.length ; i++){
            
            if(a[i] != a[i-1]){
               a[count++] = a[i];
            }
        }
        return count;
    }
}
