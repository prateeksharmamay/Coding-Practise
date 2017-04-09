/* 1.
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

package programmingQuestions;

import java.util.*;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	        /*List<Integer> s = new ArrayList<Integer>();
	        List<Integer> res = new ArrayList<Integer>();
	        
	        for(int n : nums){
	            if(!s.contains(n)){
	                s.add(n);
	            }
	        }
	        
	        for(int i =0 ; i < s.size() ; i++){
	            int req = target - s.get(i);
	            
	            if(s.contains(req)){
	                res.add(s.get(i),req);
	            }
	        }
	        
	        int[] arr = new int[res.size()];
	        int i = 0;
	        for(int x : res){
	            arr[i++] = x;
	        }
	        
	        return arr;*/
	        
	       /* int beg = 0 ;
	        int end;
	        int a[] = Arrays.copyOf(nums, nums.length);;
	        int n1=-1,n2=-1;
	        
	        Arrays.sort(a);
	        
	        for(int i = 0 ; i < a.length ; i++){
	            beg = i;
	            end = a.length - 1;
	            
	            while(beg < end){
	                int sum = a[beg] + a[end];
	                
	                if(sum == target){
	                   n1 = a[beg];
	                   n2 = a[end];
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
	        }
	        int j = nums.length-1;
	        for(int i = 0 ; i <= nums.length/2 && i!=j ; i++){
	            if(nums[i] == n1){
	                n1 = i;
	            }
	            
	            if(nums[j] == n2){
	                n2 = j;
	            }
	            j--;
	        }
	        
	        return new int[]{n1,n2};*/
	        int sum = 0;
	        Map<Integer,Integer> m = new HashMap<>();
	        
	        for(int i = 0 ; i < nums.length ; i++){
	            sum = target - nums[i];
	            
	            if(m.containsKey(sum)){
	                return new int[]{m.get(sum),i};
	            }
	            
	            m.put(nums[i],i);
	        }
	        
	        return new int[]{};
	    }
}
