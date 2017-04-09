/* 344
 Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */

package programmingQuestions;

public class ReverseString {
	public String reverseString(String s) {
        /*char c;
        
        StringBuilder str = new StringBuilder(s);
        
        int end = str.length()-1;
        for(int i = 0 ; i < end; i++,end--){
            c = s.charAt(i);
            str.setCharAt(i,s.charAt(end));
            str.setCharAt(end,c);
        }
        return str.toString();*/
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}
