/* 268
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

package programmingQuestions;

public class ArrayMissingNumbers {
public int missingNumber(int[] nums) {
        
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
        
        
        /*if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int b = 0, e = nums.length;
        int mid;
        while(b < e){
            mid = (b+ e)/2;
            
            if(nums[mid] > mid){
                e = mid;
            }
            else{
                b = mid+1;
            }
        }
        
        return b;*/
        
        /*int xor = 0, i = 0;
    	for (i = 0; i < nums.length; i++) {
    		xor = xor ^ i ^ nums[i];
    	}
    
    	return xor ^ i;*/        
    }
}
