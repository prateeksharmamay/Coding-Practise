
/*
String Substring/pattern search in a text
KMP Algorithm: String Matching Algorithm
How to compute Prefix Array
String str = "acbacxabcdabxabcdacbacdabcy"

String ptrn = "acbacdabcy"
'i' starts from 0
'j' starts from i+1

int prefixPtrn = new int[ptrn.length];
This array is pre-processed to skip unnecessary character comparison in str.

1) Always, prefixPtrn[0] = 0

2) If prefixPtrn[i] != prefixPtrn[j]
    * prefixPtrn[j] = 0
    * j = j+1
    * i = prefixPtrn[i-1]

3) If str[i] == ptrn[j]
    * a[j] = i+1
    * i = i+1 
    * j = j+1

4) next starting point is can be found at index:
    newStartIndex = prefixPtrn[prefixPtrn[j-1]]
*/


public class KMP_Algorithm {
    
    /**
     * Slow method of pattern matching
     */
    public boolean hasSubstring(char[] text, char[] pattern){
        int i=0;
        int j=0;
        int k = 0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                j=0;
                k++;
                i = k;
            }
        }
        if(j == pattern.length){
            return true;
        }
        return false;
    }
    
    /**
     * Compute temporary array to maintain size of suffix which is same as prefix
     * Time/space complexity is O(size of pattern)
     */
    private int[] computeTemporaryArray(char pat[]){
        int lps[] = new int[pat.length];
        
        int i = 0 , j = 1;
        
        while(j < pat.length) {
            
            if(pat[i] == pat[j]) {
                lps[j] = i+1;
                i++;
                j++;
            }
            else {
                if(i!=0) {
                    i = lps[i-1];
                }
                else {
                    lps[j] = 0;
                    j++;
                }
                
            }
        }
        
        return lps;
    }
    
    /**
     * KMP algorithm of pattern matching.
     */
    public boolean KMP(char []text, char []pattern){
        int patArr[] = computeTemporaryArray(pattern);
        
        int i = 0 , j = 0;
        
        while(i < text.length && j < pattern.length) {
            if(text[i]!=pattern[j]) {
                if(j!=0) {
                    j = patArr[j-1];
                }
                else {
                    i++;
                }
            }
            else {
                i++;
                j++;
            }
        }
        
        return j == pattern.length;
    }

     public static void main(String []args){
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        SubstringSearch ss = new SubstringSearch();
        boolean result = ss.KMP(str.toCharArray(), subString.toCharArray());
        System.out.print("Result : "+result);
     }
}
