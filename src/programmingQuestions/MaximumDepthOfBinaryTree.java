/* 104
 Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

package programmingQuestions;

import binaryTrees.TreeNode;

public class MaximumDepthOfBinaryTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root == null){
	            return 0;
	        }
	        int left = maxDepth(root.getLeft());
	        int right = maxDepth(root.getRight());
	        
	        if(left > right){
	            return left+1;
	        }
	        else
	            return right+1;
	    }
	}
}
