/* 383
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters. 
*/

package programmingQuestions;

public class StringRansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        
        for(char ch : magazine.toCharArray()){
            arr[ch - 'a']++;
        }
        
        for(char ch : ransomNote.toCharArray()){
            if(arr[ch - 'a'] == 0){
                return false;                
            }
            else{
                arr[ch - 'a']--;
            }
        }
        return true;
    }
    
    /*public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dict = new HashMap<>();
        int count = 0;
        
        for(int i = 0 ; i < magazine.length() ; i++){
            char ch = magazine.charAt(i);
            
            if(!dict.containsKey(ch)){
               count = 0;
            }
            else{
                count = dict.get(ch);
            }
            dict.put(ch, ++count);
        }

        for(char ch : ransomNote.toCharArray()){
            
            if(dict.containsKey(ch)){
               if(dict.get(ch) != 0){
                    int val = dict.get(ch);
                    dict.put(ch, --val);
               }
               else{
                   return false;
               }
            }
            else{
                return false;
            }
        }
        return true;
    }*/
}
