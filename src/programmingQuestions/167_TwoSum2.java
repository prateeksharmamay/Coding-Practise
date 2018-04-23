/* 167
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

package programmingQuestions;

public class TwoSum2 {
	public int[] twoSum(int[] a, int target) {
        int beg = 0;
        int end = a.length - 1;
        
        while(beg < end){
            int sum = a[beg] + a[end];
            
            if(sum == target){
               /*n1 = a[beg];
               n2 = a[end];*/
               break;
            }
            
            else if(sum < target){
                int curr = beg;
                
                while(a[beg] == a [curr] && beg < end){
                    beg++;
                }
            }
            
            else if(sum > target){
                int curr = end;
                
                while(a[end] == a [curr] && beg < end){
                    end--;
                }
            }
        }
        
        return new int[]{beg+1,end+1};
        
        
}
}
