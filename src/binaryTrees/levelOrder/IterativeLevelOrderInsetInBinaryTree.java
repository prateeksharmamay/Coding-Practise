package binaryTrees.levelOrder;

import java.util.LinkedList;

import java.util.Queue;

import binaryTrees.TreeNode;

public class IterativeLevelOrderInsetInBinaryTree {
	public TreeNode insertBTLevelOrder(TreeNode root, int data){
		if(root == null){
			return null;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();
			
			if(tmp != null){
				if(tmp.getLeft() != null){
					q.offer(tmp.getLeft());
				}
				else{
					tmp.setLeft(new TreeNode(data));
					return root;
				}
			}
			
			if(tmp.getRight() != null){
				q.offer(tmp.getRight());
			}
			else{
				tmp.setRight(new TreeNode(data));
				return root;
			}
		}
		return root;
	}
}
