/* 541
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
 */

package programmingQuestions;

public class ReverseString2 {
	public String reverseStr(String s, int k) {
        char str[] = s.toCharArray();
        
        if(k > str.length-1){
            k = str.length;
        }
        
        int j = 0;
        
        for(int i = 0; i < str.length;i+=2*k)
        {
            j = Math.min(i + k - 1, str.length - 1);
            reverse(str, i, j);
        }
        
        return new String(str);
    }
    
    public static void reverse(char str[], int f, int l){
        while(f < l){
            char tmp = str[f];
            str[f] = str[l];
            str[l] = tmp;
            f++; l--;
        }
    }
}
