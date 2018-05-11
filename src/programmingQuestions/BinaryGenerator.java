/**
 * Generate all possible binary combinations for the number of digits provided by user
 * for n=3:
 *  0 -> 
 *      00 ->
 *          000 <-
 *          001 <-
 *          <-
 *      01  ->
 *          010 <-
 *          011 <-
 *          <-
 *      <-
 * 1 -> 
 *      10 ->
 *          100 <-
 *          101 <-
 *          <-
 *      11  ->
 *          110 <-
 *          111 <-
 *          <-
 *      <-
 * 
 * Hint: backtracking
 * Ref: https://www.youtube.com/watch?v=HvGkzDT2ffI&index=13&list=PLnfg8b9vdpLn9exZweTJx44CII1bYczuk
 * 
 */

public class BinaryGenerator{

     public static void main(String []args){
        BinaryGenerator bg = new BinaryGenerator();
        
        bg.printBinary(3);
     }
     
     public void printBinary(int noDigits){
         helper("",noDigits);
     }
     
     public void helper(String prefix, int noDigits){
         if(prefix.length() == noDigits) {
             System.out.println(prefix);
         }
         else {
             helper(prefix+"0",noDigits);
             helper(prefix+"1",noDigits);
         }
     }
}
