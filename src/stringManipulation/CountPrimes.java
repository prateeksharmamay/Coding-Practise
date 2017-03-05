/* 204
Description:

Count the number of prime numbers less than a non-negative number, n.
 */

package stringManipulation;

public class CountPrimes {
	public int countPrimes(int n) {
        
        if(n < 3){
            return 0;
        }
        
       /* int f = 0, count = 0 ; 
        for(int i = 2 ; i < n ; i++){
            f = 0;
            for(int j = 2 ; j <= i ; j++){
                if(i % j == 0){
                    f++;
                }
            }
            if(f == 1){
                count++;
            }
        }*/
        
        boolean np[] = new boolean[n];
        int count = 0 ;
        
        for(int i = 2 ; i < n ; i++){
            
            if(np[i] == false){
                count++;
                
                for(int j = 2 ; i*j < n ; j++){
                    np[i*j] = true; 
                }
            }
        }
        return count;
    }
}
