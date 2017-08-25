package binaryTrees.levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import binaryTrees.TreeNode;

public class LevelOrderTraversal {
	
	ArrayList<Integer> res = new ArrayList<>();
	
	public void levelOrderTraversal(TreeNode root){
		if(root == null){
			return;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(root);
		
		ArrayList<Integer> cn = new ArrayList<>();
		
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();
			
			if(tmp != null){
				cn.add(tmp.getData());
				
				if(tmp.getLeft() != null){
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight() != null){
					q.offer(tmp.getRight());
				}
			}
		}
		
		this.res = cn;
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
