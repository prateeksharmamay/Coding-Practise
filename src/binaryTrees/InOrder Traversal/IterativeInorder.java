import java.util.ArrayList;
import java.util.Stack;

import binaryTrees.TreeNode;

public class IterativeInorder {

	public static ArrayList<Integer> inorderTraversal(TreeNode root){
		ArrayList<Integer> res = new ArrayList<>();
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
		return res;
	}
}
