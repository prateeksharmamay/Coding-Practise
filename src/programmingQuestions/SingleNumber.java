/* 136
 Given an array of integers, every element appears twice except for one. Find that single one.
 */

package programmingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class SingleNumber {
	public static int singleNumber(int[] nums) {
        /*int result = 0;
        for (int i = 0; i<nums.length; i++)
        {
    		result ^=nums[i];
        }
    	return result;*/
    	
    	Map<Integer,Integer> a = new HashMap<>();
    	int count = 0;
    	for(int i = 0 ; i < nums.length ; i++){
    	    
    	    if(a.containsKey(nums[i])){
    	    	count = a.get(nums[i]);
    	        a.replace(nums[i],++count);
    	    }
    	    else{
    	        count = 0;
    	        a.put(nums[i],++count);
    	    }
    	}
    	
    	Iterator itr = a.entrySet().iterator();
    	Map.Entry<Integer,Integer> me = null ;
    	while(itr.hasNext()){
    		me = (Map.Entry)itr.next();
    		if(me.getValue() == 1){
    			break;
    		}
    	}
    	return me.getKey();
    }
	
	public static void main(String abc[]){
		int a[] = {1,2,1,2,3};
		
		System.out.println(singleNumber(a));
	}
}
