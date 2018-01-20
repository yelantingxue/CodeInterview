package chap4.interview34;

import org.junit.Test;

public class Interv34Q1Test {

	@Test
	public void test1() {
		
		Interv34TreeNode node10 = new Interv34TreeNode(10);
		Interv34TreeNode node5 = new Interv34TreeNode(5);
		Interv34TreeNode node12 = new Interv34TreeNode(12);
		Interv34TreeNode node4 = new Interv34TreeNode(4);
		Interv34TreeNode node7 = new Interv34TreeNode(7);
		
		node10.left = node5;
		node10.right = node12;
		node5.left = node4;
		node5.right = node7;
		
		Interview34Q1.findPath(node10, 22);
	}
	
	@Test
	public void test2() {
		
		Interv34TreeNode node10 = new Interv34TreeNode(10);
		Interv34TreeNode node5 = new Interv34TreeNode(5);
		Interv34TreeNode node12 = new Interv34TreeNode(12);
		Interv34TreeNode node4 = new Interv34TreeNode(4);
		Interv34TreeNode node7 = new Interv34TreeNode(7);
		
		node10.left = node5;
		node10.right = node12;
		node5.left = node4;
		node5.right = node7;
		
		Interview34Q1.findPath(node10, 15);
	}
	
	@Test
	public void test3() {
		
		Interv34TreeNode node1 = new Interv34TreeNode(1);
		Interv34TreeNode node5 = new Interv34TreeNode(5);
		Interv34TreeNode node2 = new Interv34TreeNode(2);
		Interv34TreeNode node4 = new Interv34TreeNode(4);
		Interv34TreeNode node3 = new Interv34TreeNode(3);
		
		node5.left = node4;
		node4.left = node3;
		node3.left = node2;
		node2.left = node1;
		
		Interview34Q1.findPath(node5, 15);
	}
	
	@Test
	public void test4() {
		
		Interv34TreeNode node1 = new Interv34TreeNode(1);
		Interv34TreeNode node5 = new Interv34TreeNode(5);
		Interv34TreeNode node2 = new Interv34TreeNode(2);
		Interv34TreeNode node4 = new Interv34TreeNode(4);
		Interv34TreeNode node3 = new Interv34TreeNode(3);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		Interview34Q1.findPath(node1, 16);
	}
	
	@Test
	public void test5() {
		
		Interv34TreeNode node1 = new Interv34TreeNode(1);
		
		Interview34Q1.findPath(node1, 1);
	}
	
	@Test
	public void test6() {
		
		Interv34TreeNode node1 = null;
		
		Interview34Q1.findPath(node1, 0);
	}
}
