package binaryTrees.Traversal;
import java.util.ArrayList;
import java.util.Stack;

import binaryTrees.TreeNode;

public class IterativeInorder {
	private ArrayList<Integer> res = new ArrayList<>();

	public void inorderTraversal(TreeNode root){
		Stack<TreeNode> s = new Stack<>();
		TreeNode currentNode = root;
		
		boolean done = false;
		
		while(!done){
			if(currentNode != null){
				s.push(currentNode);
				currentNode = currentNode.getLeft();
			}
			else{
				if(s.isEmpty()){
					done = true;
				}
				else{
					currentNode = s.pop();
					res.add(currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
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
