/* 125.
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */

package stringManipulation;

public class ValidPallindrome {
	public boolean isPalindrome(String s) {
        
        if(s.length() == 0){
            return true;
        }
        /*System.out.println("input: "+s);
        
        StringBuilder org = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase());
        System.out.println("replaced: "+org);
        
        StringBuilder rev = new StringBuilder(org).reverse();
        
        System.out.println("org: "+org);
        System.out.println("rev: "+rev);
        
        
        return org.toString().equals(rev.toString());*/
        
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
