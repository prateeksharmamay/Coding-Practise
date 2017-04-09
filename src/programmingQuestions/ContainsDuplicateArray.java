/* 217
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
 */

package programmingQuestions;

import java.util.Arrays;

public class ContainsDuplicateArray {
	public boolean containsDuplicate(int[] nums) {
        /*Set<Integer> arr = new HashSet<>();
        
        if(nums.length == 0)
            return false;
        
        for(int i =0 ; i < nums.length ; i++){
            if(!arr.add(nums[i])){
                return true;
            }
        }
        
        return false;*/
        
        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }
}
