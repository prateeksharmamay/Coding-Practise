/* 66
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 */
package programmingQuestions;

public class ArrayNumberPlusOne {
	public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        
        return newNumber;
    }
    
    /*public int[] plusOne(int[] a) {
       int len = a.length;
       int carry = 0;
       int sum =0;
       for(int i = len-1; i >= 0 ; i-- ){
           
           if(i == len -1){
               sum= a[i]+1;
           }
           else{
               sum = a[i] + carry;
           }
           
           if(sum == 10){
               if(i == 0){
                   int arr[] = new int[len];
                   System.arraycopy(arr,0,a,0,len);
                   a = new int[len+1];
                   
                   a[0] = 1;
                   
                   System.arraycopy(a,1,arr,0,len);
                   break;
               }
               else{
                   carry = 1;
                   a[i] = 0;
               }
           }
           else{
               a[i] = sum;
               carry=0;
           }
        }
        
        return a;
    }*/
}
