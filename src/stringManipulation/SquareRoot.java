/* 69
Implement int sqrt(int x).

Compute and return the square root of x.
 */

package stringManipulation;

public class SquareRoot {
	public int mySqrt(int x) {
        if(x == 0){
            return x;
        }
        
        int left = 1;
        int right = x;
        
        while(true){
            int mid = left + (right-left)/2;
            
            if(mid > x/mid){
                right = mid-1;
            }
            else{
                if((mid+1) > x/(mid+1)){
                    return mid;
                }
                left = mid+1;
            }
        }
        
        /*long r = x;
        
        while (r*r > x)
            r = (r + x/r) / 2;
    
        return (int) r;*/
    }
}
