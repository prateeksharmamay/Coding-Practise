/*
Number of Segments in a String
Description  Submission  Solutions  Add to List
Total Accepted: 11991
Total Submissions: 32363
Difficulty: Easy
Contributors: love_FDU_llp
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*/
package stringManipulation;

public class SegmentsInString {
	    public int countSegments(String s) {
	        if(s.isEmpty()){
	            return 0;
	        }
	        int count = 0;
	        
	       for(int i = 0 ; i < s.length();i++){
	           if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' ')){
	               count++;
	           }
	       }
	       return count;
	    }
}
