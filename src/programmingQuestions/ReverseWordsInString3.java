/* 557.
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
package programmingQuestions;
public class ReverseWordsInString3 {
	public String reverseWords(String s) 
    {
        char[] s1 = s.toCharArray();
        int i = 0;
        for(int j = 0; j < s1.length; j++)
        {
            if(s1[j] == ' ')
            {
                reverse(s1, i, j - 1);
                i = j + 1;
            }
        }
        reverse(s1, i, s1.length - 1);
        return new String(s1);
    }

    public void reverse(char[] s, int l, int r)
    {
    	while(l < r)
    	{
    		char temp = s[l];
    		s[l] = s[r];
    		s[r] = temp;
    		l++; r--;
    	}
    }
    
    /*public String reverseWords(String s) {
        if(s.length() == 0) return s;
        
        String str[] = s.trim().split(" ");
        
        s = "";
        
        for(String newS : str){
            s += new StringBuilder(newS).reverse().toString();
            
            if(newS != str[str.length-1]){
              s += " ";
            }
        }
        
        return s;
    }*/
}
