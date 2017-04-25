/* 14.
Write a function to find the longest common prefix string amongst an array of strings.
Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
Output : "gee"

Input  : {"apple", "ape", "april"}
Output : "ap"
 */

package programmingQuestions;

public class StringLongestCommonPrefix {
	public String longestCommonPrefix(String[] str) {
        if(str.length == 0){
            return "";
        }
        
        int len = str[0].length();
        StringBuilder res = new StringBuilder();
        
        for(int i = 0 ; i < len ; i++){
            char ch = str[0].charAt(i);
            for(int j = 1 ; j < str.length ; j++){
                if(i+1 > str[j].length() || str[j].charAt(i) != ch){
                    return res.toString();
                }
            }
            res.append(ch);
        }
        
        return res.toString();
    }
}
