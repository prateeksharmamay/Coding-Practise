package binaryTrees.Traversal;

import java.util.ArrayList;

import binaryTrees.TreeNode;

public class MorrisPreOrderTraversal {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public void morrisPreoderTraversal(TreeNode root){
		TreeNode curr = root;
		
		while(curr != null){
			if(curr.getLeft() == null){
				res.add(curr.getData());
				curr = curr.getRight();
			}
			
			else{
				TreeNode pred = curr.getLeft();
				
				while(pred.getRight() != curr && pred.getRight() != null){
					pred  = pred.getRight();
				}
				
				if(pred.getRight() == null){
					pred.setRight(curr);
					res.add(curr.getData());
					curr = curr.getLeft();
				}
				else{
					pred.setRight(null);
					curr = curr.getRight();
				}
			}
		}
	}
	
	public String toString(){
		String display = "";
		
		for(int i = 0 ; i < res.size(); i++){
			display += res.get(i)+"\t";
		}
		return display;
	}

}
