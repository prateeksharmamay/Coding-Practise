/* 121
 Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
 */
package programmingQuestions;

public class ArrayMaxProfit {
	public int maxProfit(int[] a) {
        if(a.length == 0){
            return 0;
        }
        
        int max = 0, soFarMin = a[0];
        
        for(int i = 1 ; i < a.length ; i++){
            if(a[i] > soFarMin){
                max = Math.max(max, a[i] - soFarMin);
            }
            else{
                soFarMin = a[i];
            }
        }
        return max;
    }
}
