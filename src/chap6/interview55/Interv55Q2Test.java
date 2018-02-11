package chap6.interview55;

import org.junit.Test;

public class Interv55Q2Test {

	@Test
	public void test1() {
		
		Interv55TreeNode node1 = new Interv55TreeNode(1);
		Interv55TreeNode node2 = new Interv55TreeNode(2);
		Interv55TreeNode node3 = new Interv55TreeNode(3);
		Interv55TreeNode node4 = new Interv55TreeNode(4);
		Interv55TreeNode node5 = new Interv55TreeNode(5);
		Interv55TreeNode node6 = new Interv55TreeNode(6);
		Interv55TreeNode node7 = new Interv55TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node5.left = node7;
		node3.right = node6;
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
	
	@Test
	public void test2() {
		
		Interv55TreeNode node1 = new Interv55TreeNode(1);
		Interv55TreeNode node2 = new Interv55TreeNode(2);
		Interv55TreeNode node3 = new Interv55TreeNode(3);
		Interv55TreeNode node4 = new Interv55TreeNode(4);
		Interv55TreeNode node5 = new Interv55TreeNode(5);
		Interv55TreeNode node6 = new Interv55TreeNode(6);
		Interv55TreeNode node7 = new Interv55TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
	
	@Test
	public void test3() {
		
		Interv55TreeNode node1 = new Interv55TreeNode(1);
		Interv55TreeNode node2 = new Interv55TreeNode(2);
		Interv55TreeNode node3 = new Interv55TreeNode(3);
		Interv55TreeNode node4 = new Interv55TreeNode(4);
		Interv55TreeNode node5 = new Interv55TreeNode(5);
		Interv55TreeNode node6 = new Interv55TreeNode(6);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node5.left = node6;
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
	
	@Test
	public void test4() {
		
		Interv55TreeNode node1 = new Interv55TreeNode(1);
		Interv55TreeNode node2 = new Interv55TreeNode(2);
		Interv55TreeNode node3 = new Interv55TreeNode(3);
		Interv55TreeNode node4 = new Interv55TreeNode(4);
		Interv55TreeNode node5 = new Interv55TreeNode(5);
		
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		node4.left = node5;
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
	
	@Test
	public void test5() {
		
		Interv55TreeNode node1 = new Interv55TreeNode(1);
		Interv55TreeNode node2 = new Interv55TreeNode(2);
		Interv55TreeNode node3 = new Interv55TreeNode(3);
		Interv55TreeNode node4 = new Interv55TreeNode(4);
		Interv55TreeNode node5 = new Interv55TreeNode(5);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
	
	/**
	 * Only one node in the tree.
	 */
	@Test
	public void test6() {
		
		Interv55TreeNode node1 = new Interv55TreeNode(1);
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
	
	/**
	 * No node in the tree.
	 */
	@Test
	public void test7() {
		
		Interv55TreeNode node1 = null;
		
		System.out.println(Interview55Q2.isBalanced(node1));
	}
}
