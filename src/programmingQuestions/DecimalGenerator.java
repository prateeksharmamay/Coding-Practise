/**
 * Generate all possible Decimal combinations for the number of digits provided by user
 * for n=3: 000 till 999
 *  
 * Hint: backtracking
 * Ref: https://www.youtube.com/watch?v=HvGkzDT2ffI&index=13&list=PLnfg8b9vdpLn9exZweTJx44CII1bYczuk
 * 
 */

public class DecimalGenerator{

     public static void main(String []args){
        DecimalGenerator dg = new DecimalGenerator();
        
        dg.printDecimal(3);
     }
     
     public void printDecimal(int noDigits){
         helper("",noDigits);
     }
     
     public void helper(String prefix, int noDigits){
         if(prefix.length() == noDigits) {
             System.out.println(prefix);
         }
         else {
             for(int i = 0 ; i <= 9 ; i++){
                 helper(prefix+String.valueOf(i),noDigits);
             }
         }
     }
}
