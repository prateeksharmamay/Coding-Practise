package binaryTrees.levelOrder;

import binaryTrees.TreeNode;

public class RecursiveLevelOrderInsertInBT {
	
	public void insertRecursiveBT(TreeNode root, int data){
		if(root == null){
			root = new TreeNode(data);
		}
		else{
			insertHelper(root, data);
		}
	}
	
	private void insertHelper(TreeNode root, int data){
		if(root.getLeft() == null){
			root.setLeft(new TreeNode(data));
		}
		else {
			insertHelper(root.getRight(), data);
		}
		
		if(root.getRight() == null){
			root.setRight(new TreeNode(data));
		}
		else {
			insertHelper(root.getRight(), data);
		}
	}
}