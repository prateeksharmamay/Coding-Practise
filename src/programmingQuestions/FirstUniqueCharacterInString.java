/* 387
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

Subscribe to see which companies asked this question.
 */

package programmingQuestions;

public class FirstUniqueCharacterInString {
	public class Solution {
	    public int firstUniqChar(String s) {
	        
	        if(s.length() == 0){
	            return -1;
	        }
	        
	        int arr[] = new int[26];
	        
	        for(int i = 0 ; i < s.length() ; i++){
	            arr[s.charAt(i) - 'a']++;
	        }
	        
	        for(int i = 0 ; i < s.length() ; i++){
	            if(arr[s.charAt(i) - 'a'] == 1){
	                return i;
	            }
	        }
	        return -1;
	    }
	}
}