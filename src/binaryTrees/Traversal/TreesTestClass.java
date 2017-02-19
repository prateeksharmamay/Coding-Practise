package binaryTrees.Traversal;

import binaryTrees.TreeNode;
import binaryTrees.levelOrder.*;

public class TreesTestClass {
	public static void main(String[] args) {
		/*IterativeLevelOrderInsetInBinaryTree tree = new IterativeLevelOrderInsetInBinaryTree();
		TreeNode t1 = new TreeNode(1);
		
		tree.insertBTLevelOrder(t1, 2);
		tree.insertBTLevelOrder(t1, 3);
		tree.insertBTLevelOrder(t1, 4);
		tree.insertBTLevelOrder(t1, 5);
		tree.insertBTLevelOrder(t1, 6);
		tree.insertBTLevelOrder(t1, 7);
		*/
		RecursiveLevelOrderInsertInBT tree = new RecursiveLevelOrderInsertInBT();
		TreeNode t1 = new TreeNode(1);
		
		tree.insertRecursiveBT(t1, 2);
		tree.insertRecursiveBT(t1, 3);
		tree.insertRecursiveBT(t1, 4);
		tree.insertRecursiveBT(t1, 5);
		tree.insertRecursiveBT(t1, 6);
		tree.insertRecursiveBT(t1, 7);
		
		try {
			LevelOrderTraversal levelTrav = new LevelOrderTraversal();
			levelTrav.levelOrderTraversal(t1);

			System.out.println(levelTrav);
		} catch (Exception e) {
			System.out.println(e);		}
		/*
		MorrisPreOrderTraversal mPreTrav = new MorrisPreOrderTraversal();
		mPreTrav.morrisPreoderTraversal(t1);
		
		System.out.println(mPreTrav);*/
		
		/*MorrisInOrderTraversal mInTrav = new MorrisInOrderTraversal();
		mInTrav.morrisInoderTraversal(t1);
		
		System.out.println(mInTrav);*/
		
		/*RecursivePostOrderTraversal recPost = new RecursivePostOrderTraversal();
		recPost.recursivePostorderTraversal(t1);
		
		System.out.println(recPost);*/
		
		/*IterativePostOrderTraversal postOrderTrav = new IterativePostOrderTraversal();
		postOrderTrav.iterativePostOrder(t1);
		
		System.out.println(postOrderTrav);*/
		
		/*RecursiveInOrderTraversal inOrderTraversal = new RecursiveInOrderTraversal();
		
		inOrderTraversal.recursiveInorderTraversal(t1);
		System.out.println(inOrderTraversal);*/
		
		/*IterativeInorder inOrderTrav = new IterativeInorder();
		
		inOrderTrav.inorderTraversal(t1);
		System.out.println(inOrderTrav);*/
		
		/*IterativePreOrderTraversal preOrderTrav = new IterativePreOrderTraversal();
		
		preOrderTrav.iterativePreOrderTraversal(t1);
		System.out.println(preOrderTrav);*/
		
		/*RecursivePreOrderTraversal preOrderTrav = new RecursivePreOrderTraversal();
		
		preOrderTrav.recursivePreorderTraversal(t1);
		System.out.println(preOrderTrav);*/
		
		
	}
}
