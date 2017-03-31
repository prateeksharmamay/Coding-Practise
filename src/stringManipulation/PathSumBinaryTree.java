/* 112
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

package stringManipulation;

import binaryTrees.TreeNode;

public class PathSumBinaryTree {
	public boolean hasPathSum(TreeNode root, int sum) {
        /*if(root == null){
            return false;
        }
        
        if(root.getLeft() == null && root.getRight() == null){
            if(root.getData() == sum){
                return true;
            }
            else{
                return false;
            }
        }
        
        if(hasPathSum(root.getLeft(), (sum-root.getData()))){
            return true;
        }
        
        if(hasPathSum(root.getLeft(), (sum-root.getData()))){
            return true;
        }
        
        return false;*/
		
		if(root.getLeft()==null && root.getRight()==null && sum==root.getData())
            return true;
            
        return hasPathSum(root.getLeft(),sum-root.getData())||hasPathSum(root.getRight(),sum-root.getData());
    }
}
