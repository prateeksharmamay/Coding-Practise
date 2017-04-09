/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 */

package programmingQuestions;

public class StringDetectCapital {
	public boolean detectCapitalUse(String str) {
        int c = 0 ;
        
        for(int i = 0 ; i < str.length() ; i ++){
            if(Character.isUpperCase(str.charAt(i))){
               c++; 
            }
        }
        
        if(c == 1){
            return Character.isUpperCase(str.charAt(0));
        }
        
        return c == str.length() || c == 0;
        /*char ch[] = str.toCharArray();
        int cap = 0, low= 0;
        
        if (Character.isUpperCase(ch[0])){
            for(int i = 1 ; i < ch.length ; i++){
                if(Character.isUpperCase(ch[i]) && low == 0){
                    cap++;
                }
                
                if(Character.isLowerCase(ch[i]) && cap == 0){
                    low++;
                }
                
                if(Character.isUpperCase(ch[i]) && low != 0 || Character.isLowerCase(ch[i]) && cap != 0){
                    return false;
                }
            }
        }
        
        else{
            for(int i = 1 ; i < ch.length ; i++){
                if(Character.isUpperCase(ch[i])){
                    return false;
                }
            }
        }
        return true;*/
    }
}
