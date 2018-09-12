/**
 * 215. Kth Largest Element in an Array
 * 
 * 
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

    Example 1:
    
    Input: [3,2,1,5,6,4] and k = 2
    Output: 5
    Example 2:
    
    Input: [3,2,3,1,2,4,5,5,6] and k = 4
    Output: 4
    Note: 
    You may assume k is always valid, 1 ≤ k ≤ array's length.
    
    Time Complexity: O(n log n)
    Space: O(N)
    
*/

class KthLargestElementInAnArray_215 {
    public int findKthLargest(int[] nums, int k) {
        //Comparator<Integer> comp = new IntegerComparator();// 1
        //PriorityQueue<Integer> pq = new PriorityQueue<>(10,comp);1
        //PriorityQueue<Integer> pq = new PriorityQueue<>(10,(a,b) -> a-b);//2
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n: nums){
            pq.offer(n);
            if(pq.size() == k+1) pq.poll();
        }
        
        return pq.poll();
    }
    
    /*//1
    public class IntegerComparator implements Comparator<Integer> {
        
        @Override
        public int compare(Integer x, Integer y) {
            if(x > y) {
                return 1;
            }
            else if(x < y) {
                return -1;
            }
            else
                return 0;
        }
    }
    */
}
