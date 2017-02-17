package binaryTrees.Traversal;

import java.util.ArrayList;
import java.util.Stack;

import binaryTrees.TreeNode;;

public class IterativePreOrderTraversal {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public void iterativePreOrderTraversal(TreeNode root){
		
		if(root == null){
			return;
		}
		
		Stack<TreeNode> s = new Stack<>();
		
		s.push(root);
		
		while(!s.isEmpty()){
			TreeNode tmp = s.pop();
			
			res.add(tmp.getData());
			
			if(tmp.getRight() != null){
				s.push(tmp.getRight());
			}
			
			if(tmp.getLeft() != null){
				s.push(tmp.getLeft());
			}
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
