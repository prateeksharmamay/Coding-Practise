package binaryTrees.Traversal;

import java.util.ArrayList;

import binaryTrees.TreeNode;;

public class RecursivePostOrderTraversal {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public void recursivePostorderTraversal(TreeNode root){
		if(root != null){
			recursivePostorderTraversal(root.getLeft());
			recursivePostorderTraversal(root.getRight());
			res.add(root.getData());
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
