/* 171
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 	
 */

package programmingQuestions;

public class ExcelSheetColNum {
	public int titleToNumber(String s) {
        int sum = 0;
        
        for(int i = 0 ; i < s.length(); i++){
            sum = sum*26;
            sum += (s.charAt(i) - 'A') + 1;
        }
         return sum;
        
    }
}
