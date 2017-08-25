package binaryTrees.Traversal;

import java.util.ArrayList;

import binaryTrees.TreeNode;

public class MorrisInOrderTraversal {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public void morrisInoderTraversal(TreeNode root){
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
					curr = curr.getLeft();
				}
				else{
					pred.setRight(null);
					res.add(curr.getData());
					curr = curr.getRight();
				}
			}
		}
	}
	
	@Override
	public String toString(){
		String display = "";
		
		for(int i = 0 ; i < res.size(); i++){
			display += res.get(i)+"\t";
		}
		return display;
	}

}
