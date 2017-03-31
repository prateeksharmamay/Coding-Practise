/* 235
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */

package stringManipulation;

import binaryTrees.TreeNode;

public class LowestCommonAncestorBST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	       /* Recursive Soln
	       
	       if(root.val < Math.min(p.val,q.val)){
	            return lowestCommonAncestor(root.right, p, q);
	        }
	        if(root.val > Math.max(p.val,q.val)){
	            return lowestCommonAncestor(root.left, p, q);
	        }
	        
	        return root;*/
	        
	        boolean done = true;
	        TreeNode temp = root;
	        while(done){
	            if(temp.getData() < Math.min(p.getData(),q.getData())){
	                temp = temp.getRight();
	            }
	            
	            else if(temp.getData() > Math.max(p.getData(),q.getData())){
	                temp = temp.getLeft();            
	            }
	            else{
	                return temp;
	            }
	        }
	        return temp;
	    }
}
