package chap4.interview37;

import java.util.List;

import org.junit.Test;

public class Interv37Q1Test {

	@Test
	public void test1() {
		
		Interv37TreeNode node1 = new Interv37TreeNode(1);
		Interv37TreeNode node2 = new Interv37TreeNode(2);
		Interv37TreeNode node3 = new Interv37TreeNode(3);
		Interv37TreeNode node4 = new Interv37TreeNode(4);
		Interv37TreeNode node5 = new Interv37TreeNode(5);
		Interv37TreeNode node6 = new Interv37TreeNode(6);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		
		String serialStr = Interview37Q1.serializeBinaryTree(node1);
		
		System.out.println(serialStr);
		
		Interv37TreeNode root = Interview37Q1.deserializeBinaryTree(serialStr);
		
		Interv37TreeNode.preOrder(root);
	}
	
	@Test
	public void test2() {
		
		Interv37TreeNode node8 = new Interv37TreeNode(8);
		Interv37TreeNode node10 = new Interv37TreeNode(10);
		Interv37TreeNode node7 = new Interv37TreeNode(7);
		Interv37TreeNode node9 = new Interv37TreeNode(9);
		Interv37TreeNode node5 = new Interv37TreeNode(5);
		Interv37TreeNode node6 = new Interv37TreeNode(6);
		Interv37TreeNode node11 = new Interv37TreeNode(11);
		
		node8.left = node6;
		node8.right = node10;
		node6.left = node5;
		node6.right = node7;
		node10.left = node9;
		node10.right = node11;
		
		String serialStr = Interview37Q1.serializeBinaryTree(node8);
		
		System.out.println(serialStr);
		
		Interv37TreeNode root = Interview37Q1.deserializeBinaryTree(serialStr);
		
		Interv37TreeNode.preOrder(root);
	}
	
	@Test
	public void test3() {
		
		Interv37TreeNode node2 = new Interv37TreeNode(2);
		Interv37TreeNode node3 = new Interv37TreeNode(3);
		Interv37TreeNode node4 = new Interv37TreeNode(4);
		Interv37TreeNode node5 = new Interv37TreeNode(5);
		
		node5.left = node4;
		node4.left = node3;
		node3.left = node2;
		
		String serialStr = Interview37Q1.serializeBinaryTree(node5);
		
		System.out.println(serialStr);
		
		Interv37TreeNode root = Interview37Q1.deserializeBinaryTree(serialStr);
		
		Interv37TreeNode.preOrder(root);
	}
	
	@Test
	public void test4() {
		
		Interv37TreeNode node2 = new Interv37TreeNode(2);
		Interv37TreeNode node3 = new Interv37TreeNode(3);
		Interv37TreeNode node4 = new Interv37TreeNode(4);
		Interv37TreeNode node5 = new Interv37TreeNode(5);
		
		node5.right = node4;
		node4.right = node3;
		node3.right = node2;
		
		String serialStr = Interview37Q1.serializeBinaryTree(node5);
		
		System.out.println(serialStr);
		
		Interv37TreeNode root = Interview37Q1.deserializeBinaryTree(serialStr);
		
		Interv37TreeNode.preOrder(root);
	}
	
	@Test
	public void test5() {
		
		Interv37TreeNode node5 = new Interv37TreeNode(5);
		
		String serialStr = Interview37Q1.serializeBinaryTree(node5);
		
		System.out.println(serialStr);
		
		Interv37TreeNode root = Interview37Q1.deserializeBinaryTree(serialStr);
		
		Interv37TreeNode.preOrder(root);
	}
	
	@Test
	public void test6() {
		
		Interv37TreeNode node1 = new Interv37TreeNode(5);
		Interv37TreeNode node2 = new Interv37TreeNode(5);
		Interv37TreeNode node3 = new Interv37TreeNode(5);
		Interv37TreeNode node4 = new Interv37TreeNode(5);
		Interv37TreeNode node5 = new Interv37TreeNode(5);
		Interv37TreeNode node6 = new Interv37TreeNode(5);
		Interv37TreeNode node7 = new Interv37TreeNode(5);
		Interv37TreeNode node8 = new Interv37TreeNode(5);
		Interv37TreeNode node9 = new Interv37TreeNode(5);
		
		node1.right = node2;
		node2.right = node3;
		node3.left = node4;
		node4.left = node5;
		node5.left = node6;
		node6.left = node8;
		node5.right = node7;
		node7.right = node9;
		
		String serialStr = Interview37Q1.serializeBinaryTree(node1);
		
		System.out.println(serialStr);
		
		Interv37TreeNode root = Interview37Q1.deserializeBinaryTree(serialStr);
		
		Interv37TreeNode.preOrder(root);
	}
}
