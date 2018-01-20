package chap4.interview28;

import org.junit.Test;

public class Interv28Q1Test {

	@Test
	public void test1() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(8);
		Interv28TreeNode node2 = new Interv28TreeNode(6);
		Interv28TreeNode node3 = new Interv28TreeNode(6);
		Interv28TreeNode node4 = new Interv28TreeNode(5);
		Interv28TreeNode node5 = new Interv28TreeNode(7);
		Interv28TreeNode node6 = new Interv28TreeNode(7);
		Interv28TreeNode node7 = new Interv28TreeNode(5);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	@Test
	public void test2() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(8);
		Interv28TreeNode node2 = new Interv28TreeNode(6);
		Interv28TreeNode node3 = new Interv28TreeNode(9);
		Interv28TreeNode node4 = new Interv28TreeNode(5);
		Interv28TreeNode node5 = new Interv28TreeNode(7);
		Interv28TreeNode node6 = new Interv28TreeNode(7);
		Interv28TreeNode node7 = new Interv28TreeNode(5);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	@Test
	public void test3() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(8);
		Interv28TreeNode node2 = new Interv28TreeNode(6);
		Interv28TreeNode node3 = new Interv28TreeNode(6);
		Interv28TreeNode node4 = new Interv28TreeNode(5);
		Interv28TreeNode node5 = new Interv28TreeNode(7);
		Interv28TreeNode node6 = new Interv28TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	@Test
	public void test4() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(5);
		Interv28TreeNode node2 = new Interv28TreeNode(3);
		Interv28TreeNode node3 = new Interv28TreeNode(3);
		Interv28TreeNode node4 = new Interv28TreeNode(4);
		Interv28TreeNode node5 = new Interv28TreeNode(4);
		Interv28TreeNode node6 = new Interv28TreeNode(2);
		Interv28TreeNode node7 = new Interv28TreeNode(2);
		Interv28TreeNode node8 = new Interv28TreeNode(1);
		Interv28TreeNode node9 = new Interv28TreeNode(1);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.right = node5;
		node4.left = node6;
		node5.right = node7;
		node6.left = node8;
		node7.right = node9;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	@Test
	public void test5() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(5);
		Interv28TreeNode node2 = new Interv28TreeNode(3);
		Interv28TreeNode node3 = new Interv28TreeNode(3);
		Interv28TreeNode node4 = new Interv28TreeNode(4);
		Interv28TreeNode node5 = new Interv28TreeNode(4);
		Interv28TreeNode node6 = new Interv28TreeNode(6);
		Interv28TreeNode node7 = new Interv28TreeNode(2);
		Interv28TreeNode node8 = new Interv28TreeNode(1);
		Interv28TreeNode node9 = new Interv28TreeNode(1);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.right = node5;
		node4.left = node6;
		node5.right = node7;
		node6.left = node8;
		node7.right = node9;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	@Test
	public void test6() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(5);
		Interv28TreeNode node2 = new Interv28TreeNode(3);
		Interv28TreeNode node3 = new Interv28TreeNode(3);
		Interv28TreeNode node4 = new Interv28TreeNode(4);
		Interv28TreeNode node5 = new Interv28TreeNode(4);
		Interv28TreeNode node6 = new Interv28TreeNode(2);
		Interv28TreeNode node7 = new Interv28TreeNode(2);
		Interv28TreeNode node9 = new Interv28TreeNode(1);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.right = node5;
		node4.left = node6;
		node5.right = node7;
		node7.right = node9;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	/**
	 * Only one node.
	 */
	@Test
	public void test7() {
		
		Interv28TreeNode node1 = new Interv28TreeNode(5);
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
	
	/**
	 * No nodes.
	 */
	@Test
	public void test8() {
		
		Interv28TreeNode node1 = null;
		
		System.out.println(Interview28Q1.isSymmetrical(node1));
	}
}
