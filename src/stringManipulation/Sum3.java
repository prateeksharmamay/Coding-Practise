/* 15
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

package stringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
	public List<List<Integer>> threeSum(int[] a) {
        int len = a.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(len < 3){
            return res;
        }
        
        Arrays.sort(a);
        
        for(int i = 0 ; i <= len - 3 ; i++){
            int s = i+1;
            int e = len-1;
            
            if(i == 0 || a[i] > a[i-1]){
                while(s < e){
                    int sum = a[i] + a[s] + a[e];
                    
                    if(sum == 0){
                        res.add(Arrays.asList(a[i],a[s],a[e]));
                    }
                    
                    if(sum < 0){
                        int cur = s;
                        
                        while(a[s] == a[cur] && s < e){
                            s++;
                        }
                    }
                    else{
                        int cur = e;
                        
                        while(a[e] == a[cur] && s < e){
                            e--;
                        }
                    }
                }
            }
        }
        return res;
    }
}
