package stringManipulation;

import binaryTrees.TreeNode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if(balancedHeight(root) > -1){
            return true;
        }
        
        return false;
    }
    
    public int balancedHeight(TreeNode n){
        if(n == null){
            return 0;
        }
        
        int left = balancedHeight(n.getLeft());
        int right = balancedHeight(n.getRight());
        
        if(left == -1 || right == -1){
            return -1;
        }
        
        if(Math.abs(left - right) > 1){
            return -1;
        }
        
        if(left > right){
            return left+1;
        }
        return right+1;
    }
}
