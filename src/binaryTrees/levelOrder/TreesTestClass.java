package binaryTrees.levelOrder;

import binaryTrees.TreeNode;

public class TreesTestClass {
	public static void main(String[] args) {
		IterativeLevelOrderInsetInBinaryTree tree = new IterativeLevelOrderInsetInBinaryTree();
		TreeNode t1 = new TreeNode(1);
		
		tree.insertBTLevelOrder(t1, 2);
		tree.insertBTLevelOrder(t1, 3);
		tree.insertBTLevelOrder(t1, 4);
		tree.insertBTLevelOrder(t1, 5);
		
		LevelOrderTraversal levelTrav = new LevelOrderTraversal();
		
		levelTrav.levelOrderTraversal(t1);
		System.out.println(levelTrav);
	}
}
