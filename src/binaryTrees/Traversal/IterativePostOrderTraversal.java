package binaryTrees.Traversal;

import java.util.ArrayList;
import java.util.Stack;

import binaryTrees.TreeNode;

public class IterativePostOrderTraversal {
	ArrayList<Integer> res = new ArrayList<>();
	
	public void iterativePostOrder(TreeNode root){
		Stack<TreeNode> s = new Stack<>();
		TreeNode prev = null;
		s.push(root);
		
		while(!s.isEmpty()){
			TreeNode curr = s.peek();
			
			if(prev == null || prev.getLeft() == curr || prev.getRight() == curr){
				if(curr.getLeft() != null){
					s.push(curr.getLeft());
				}
				else if(curr.getRight() != null){
					s.push(curr.getRight());
				}
			}
			else if(curr.getLeft() == prev){
				if(curr.getRight() != null){
					s.push(curr.getRight());
				}
			}
			else{
				res.add(curr.getData());
				s.pop();
			}
			prev = curr;
		}
	}
	
	public String toString(){
		String display="";
		
		for(int i = 0 ; i < res.size() ; i++){
			display += res.get(i)+"\t";
		}
		return display;
	}
}
