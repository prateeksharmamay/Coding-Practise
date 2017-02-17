package binaryTrees.Traversal;

import java.util.ArrayList;

import binaryTrees.TreeNode;;

public class RecursiveInOrderTraversal {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public void recursiveInorderTraversal(TreeNode root){
		if(root != null){
			recursiveInorderTraversal(root.getLeft());
			res.add(root.getData());
			recursiveInorderTraversal(root.getRight());
		}
	}
	
	public String toString(){
		String display="";
		
		for(int i = 0 ; i < res.size(); i++){
			display += res.get(i)+"\t";
		}
		
		return display;
	}
}
