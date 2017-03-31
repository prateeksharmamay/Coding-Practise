/* 107
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */

package stringManipulation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import binaryTrees.TreeNode;

public class BinaryTreeLevelOrderReverse {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null){
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> s = new Stack<>();
        List<Integer> curr = new ArrayList<>();
        
        q.offer(root);
        q.offer(null);
        
        /*while(!q.isEmpty()){
            TreeNode tmp = q.poll();
            
            if(tmp !=null){
                curr.add(tmp.val);
                if(tmp.left != null){
                    q.offer(tmp.left);
                }
                if(tmp.right != null){
                     q.offer(tmp.right);
                }
            }
            
            else{
                List<Integer> copy = new ArrayList<>(curr);
                curr.clear();
                s.push(copy);
                
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
        
        while(!s.isEmpty()){
            res.add(s.pop());
        }*/
        
        while(!q.isEmpty()){
            TreeNode tmp = q.poll();
            
            if(tmp !=null){
                curr.add(tmp.getData());
                if(tmp.getLeft() != null){
                    q.offer(tmp.getLeft());
                }
                if(tmp.getRight() != null){
                     q.offer(tmp.getRight());
                }
            }
            
            else{
                List<Integer> copy = new ArrayList<>(curr);
                curr.clear();
                
                res.add(0,copy);
                //s.push(copy);
                
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
        
        return res;
    }
}
