/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */

package programmingQuestions;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {

        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        
        if(s.length() != t.length()){
            return false;
        }
        
        s.toLowerCase();
        t.toLowerCase();
        
        /*int arr[] = new int[26];
        int brr[] = new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            brr[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < 26; i++){
            if(arr[i] !=  brr[i]){
                return false;
            }
        }
        
        return true;*/
        
        int brr[] = new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
            brr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < s.length(); i++){
            brr[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0 ; i < brr.length; i++){
            if(brr[i] != 0) return false;
        }
        
        return true;
        
    }
}
