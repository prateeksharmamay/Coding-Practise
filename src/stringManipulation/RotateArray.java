/* 189.
 Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Hint:
Could you do it in-place with O(1) extra space?
Related problem: Reverse Words in a String II
 */

package stringManipulation;

public class RotateArray {
	  /* public void rotate(int[] a, int k) {
    int len = a.length;
    int temp;
    k = k % len;
    int n = len - k;
    if(a.length < 2){
        System.out.println(a[0]);
        return;
    }
    int i;
    for(i = 0 ; i < k ; i++){
        temp = a[i];
        a[i] = a[n];
        a[n] = temp;
        n++;
    }
    
    for(int j = i ; j < len-1 ; j++){
        temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
    }
    
    for(int z = 0 ; z < len ; z++){
        System.out.println(a[z]);
    }
}*/

public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
}
