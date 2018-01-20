package chap4.interview27;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Interv27Q1Test {

	/**
	 *              8
	 *           6     10
	 *         5   7  9  11
	 */
	@Test
	public void test1() {
		
		Interv27TreeNode node1 = new Interv27TreeNode(8);
		Interv27TreeNode node2 = new Interv27TreeNode(6);
		Interv27TreeNode node3 = new Interv27TreeNode(10);
		Interv27TreeNode node4 = new Interv27TreeNode(5);
		Interv27TreeNode node5 = new Interv27TreeNode(7);
		Interv27TreeNode node6 = new Interv27TreeNode(9);
		Interv27TreeNode node7 = new Interv27TreeNode(11);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		List<Interv27TreeNode> preList = new ArrayList<>();
		Interv27TreeNode.preOrder(node1, preList);
		
		for(Interv27TreeNode treeNode: preList) {
			System.out.print(treeNode.value + " ");
		}
		
		System.out.println();
		
		Interview27Q1.mirrorBinaryTree(node1);
		
		List<Interv27TreeNode> preMirrorList = new ArrayList<>();
		Interv27TreeNode.preOrder(node1, preMirrorList);
		
		for(Interv27TreeNode treeNode: preMirrorList) {
			System.out.print(treeNode.value + " ");
		}
	}
	
	/**
	 * All nodes only have left sub-node.
	 */
	@Test
	public void test2() {
		
		Interv27TreeNode node1 = new Interv27TreeNode(8);
		Interv27TreeNode node2 = new Interv27TreeNode(7);
		Interv27TreeNode node3 = new Interv27TreeNode(6);
		Interv27TreeNode node4 = new Interv27TreeNode(5);
		Interv27TreeNode node5 = new Interv27TreeNode(4);
		
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		node4.left = node5;
		
		List<Interv27TreeNode> inList = new ArrayList<>();
		Interv27TreeNode.inOrder(node1, inList);
		
		for(Interv27TreeNode treeNode: inList) {
			System.out.print(treeNode.value + " ");
		}
		
		System.out.println();
		
		Interview27Q1.mirrorBinaryTree(node1);
		
		List<Interv27TreeNode> inMirrorList = new ArrayList<>();
		Interv27TreeNode.inOrder(node1, inMirrorList);
		
		for(Interv27TreeNode treeNode: inMirrorList) {
			System.out.print(treeNode.value + " ");
		}
	}
	
	/**
	 * All nodes only have right sub-node.
	 */
	@Test
	public void test3() {
		
		Interv27TreeNode node1 = new Interv27TreeNode(8);
		Interv27TreeNode node2 = new Interv27TreeNode(7);
		Interv27TreeNode node3 = new Interv27TreeNode(6);
		Interv27TreeNode node4 = new Interv27TreeNode(5);
		Interv27TreeNode node5 = new Interv27TreeNode(4);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		List<Interv27TreeNode> inList = new ArrayList<>();
		Interv27TreeNode.inOrder(node1, inList);
		
		for(Interv27TreeNode treeNode: inList) {
			System.out.print(treeNode.value + " ");
		}
		
		System.out.println();
		
		Interview27Q1.mirrorBinaryTree(node1);
		
		List<Interv27TreeNode> inMirrorList = new ArrayList<>();
		Interv27TreeNode.inOrder(node1, inMirrorList);
		
		for(Interv27TreeNode treeNode: inMirrorList) {
			System.out.print(treeNode.value + " ");
		}
	}
	
	/**
	 * Binary tree is null.
	 */
	@Test
	public void test4() {
		
		Interv27TreeNode node1 = null;
		
		Interview27Q1.mirrorBinaryTree(node1);
		
		if(node1 == null) {
			System.out.println("Root is null.");
		}
	}
	
	/**
	 * The binary tree only has one node.
	 */
	@Test
	public void test5() {
		
		Interv27TreeNode node1 = new Interv27TreeNode(8);
		
		Interview27Q1.mirrorBinaryTree(node1);
		
		List<Interv27TreeNode> inMirrorList = new ArrayList<>();
		Interv27TreeNode.inOrder(node1, inMirrorList);
		
		for(Interv27TreeNode treeNode: inMirrorList) {
			System.out.print(treeNode.value + " ");
		}
	}
}
