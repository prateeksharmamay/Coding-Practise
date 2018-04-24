/**
https://www.youtube.com/watch?v=VdnvmfzA1pw
https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)

Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/

class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        backtracking(resList, list, nums, 0);
        
        return resList;
    }
    
    private void backtracking(List<List<Integer>> resList, List<Integer> list, int[] nums, int start){
        resList.add(new ArrayList(list));
        
        for(int i = start; i < nums.length ; i++) {
            list.add(nums[i]);
            backtracking(resList, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }
}
