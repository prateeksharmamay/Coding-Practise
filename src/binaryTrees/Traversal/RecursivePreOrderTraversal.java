package binaryTrees.Traversal;

import java.util.ArrayList;

import binaryTrees.TreeNode;;

public class RecursivePreOrderTraversal {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public void recursivePreorderTraversal(TreeNode root){
		if(root != null){
			res.add(root.getData());
			recursivePreorderTraversal(root.getLeft());
			recursivePreorderTraversal(root.getRight());
		}
	}
	
	@Override
	public String toString(){
		String display="";
		
		for(int i = 0 ; i < res.size(); i++){
			display += res.get(i)+"\t";
		}
		
		return display;
	}
}
