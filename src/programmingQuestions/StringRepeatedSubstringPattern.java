/* 459
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/

package programmingQuestions;

public class StringRepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String s) {
        // char a[] = s.toCharArray();
        
        int len = s.length();
        
        for(int i = len/2 ; i > 0 ; i --){
            if(len%i == 0){
                int j = len/i;
                String substr = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                
                for(int k = 0; k < j ; k++){
                    sb.append(substr);
                }
                
                if(s.equals(sb.toString())){
                    return true;
                }
            }
        }
        return false;
    }
}
