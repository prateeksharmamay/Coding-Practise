/*
102. Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
] 
 
 */

package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(root == null){
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> lvl = new ArrayList<Integer>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            
            if(curr != null){
                lvl.add(curr.getData());
                if(curr.getLeft() != null){
                    q.offer(curr.getLeft());
                }
                
                if(curr.getRight() != null){
                    q.offer(curr.getRight());
                }
            }
            
            else{
               List<Integer> c = new ArrayList<Integer>(lvl);
                res.add(c);
                lvl.clear();
                
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
        return res;
    }
}
