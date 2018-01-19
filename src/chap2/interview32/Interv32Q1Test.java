package chap2.interview32;

import org.junit.Test;

public class Interv32Q1Test {

	@Test
	public void test1() {
		
		Interv32TreeNode node8 = new Interv32TreeNode(8);
		Interv32TreeNode node6 = new Interv32TreeNode(6);
		Interv32TreeNode node10 = new Interv32TreeNode(10);
		Interv32TreeNode node5 = new Interv32TreeNode(5);
		Interv32TreeNode node7 = new Interv32TreeNode(7);
		Interv32TreeNode node9 = new Interv32TreeNode(9);
		Interv32TreeNode node11 = new Interv32TreeNode(11);
		
		node8.left = node6;
		node8.right = node10;
		node6.left = node5;
		node6.right = node7;
		node10.left = node9;
		node10.right = node11;
		
		Interview32Q1.printBinaryFromTopToBottom(node8);
	}
	
	@Test
	public void test2() {
		
		Interv32TreeNode node8 = new Interv32TreeNode(8);
		Interv32TreeNode node6 = new Interv32TreeNode(6);
		Interv32TreeNode node10 = new Interv32TreeNode(10);
		Interv32TreeNode node14 = new Interv32TreeNode(14);
		Interv32TreeNode node4 = new Interv32TreeNode(4);
		Interv32TreeNode node12 = new Interv32TreeNode(12);
		Interv32TreeNode node16 = new Interv32TreeNode(16);
		
		node10.left = node6;
		node10.right = node14;
		node6.left = node4;
		node6.right = node8;
		node14.left = node12;
		node14.right = node16;
		
		Interview32Q1.printBinaryFromTopToBottom(node10);
	}
	
	@Test
	public void test3() {
		
		Interv32TreeNode node5 = new Interv32TreeNode(5);
		Interv32TreeNode node4 = new Interv32TreeNode(4);
		Interv32TreeNode node3 = new Interv32TreeNode(3);
		Interv32TreeNode node2 = new Interv32TreeNode(2);
		Interv32TreeNode node1 = new Interv32TreeNode(1);
		
		node5.left = node4;
		node4.left = node3;
		node3.left = node2;
		node2.left = node1;
		
		Interview32Q1.printBinaryFromTopToBottom(node5);
	}
	
	@Test
	public void test4() {
		
		Interv32TreeNode node5 = new Interv32TreeNode(5);
		Interv32TreeNode node4 = new Interv32TreeNode(4);
		Interv32TreeNode node3 = new Interv32TreeNode(3);
		Interv32TreeNode node2 = new Interv32TreeNode(2);
		Interv32TreeNode node1 = new Interv32TreeNode(1);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		Interview32Q1.printBinaryFromTopToBottom(node1);
	}
	
	@Test
	public void test5() {
		
		Interv32TreeNode node1 = new Interv32TreeNode(1);
		
		Interview32Q1.printBinaryFromTopToBottom(node1);
	}
	
	@Test
	public void test6() {
		
		Interv32TreeNode node1 = null;
		
		Interview32Q1.printBinaryFromTopToBottom(node1);
	}
}
