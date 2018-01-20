package chap4.interview36;

import org.junit.Test;

public class Interv36Q1Test {

	@Test
	public void test1() {
		
		Interv36TreeNode node10 = new Interv36TreeNode(10);
		Interv36TreeNode node6 = new Interv36TreeNode(6);
		Interv36TreeNode node14 = new Interv36TreeNode(14);
		Interv36TreeNode node4 = new Interv36TreeNode(4);
		Interv36TreeNode node8 = new Interv36TreeNode(8);
		Interv36TreeNode node12 = new Interv36TreeNode(12);
		Interv36TreeNode node16 = new Interv36TreeNode(16);
		
		node10.left = node6;
		node10.right = node14;
		node6.left = node4;
		node6.right = node8;
		node14.left = node12;
		node14.right = node16;
		
		Interv36TreeNode node = Interview36Q1.convertTreeToList(node10);
		Interv36TreeNode lastNode = node;
		while(lastNode.right != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.right;
		}
		System.out.println(lastNode.value);
		
		while(lastNode.left != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.left;
		}
		System.out.println(lastNode.value);
	}
	
	@Test
	public void test2() {
		
		Interv36TreeNode node1 = new Interv36TreeNode(1);
		Interv36TreeNode node2 = new Interv36TreeNode(2);
		Interv36TreeNode node3 = new Interv36TreeNode(3);
		Interv36TreeNode node4 = new Interv36TreeNode(4);
		Interv36TreeNode node5 = new Interv36TreeNode(5);
		
		node5.left = node4;
		node4.left = node3;
		node3.left = node2;
		node2.left = node1;
		
		Interv36TreeNode node = Interview36Q1.convertTreeToList(node5);
		Interv36TreeNode lastNode = node;
		while(lastNode.right != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.right;
		}
		System.out.println(lastNode.value);
		
		while(lastNode.left != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.left;
		}
		System.out.println(lastNode.value);
	}
	
	@Test
	public void test3() {
		
		Interv36TreeNode node1 = new Interv36TreeNode(1);
		Interv36TreeNode node2 = new Interv36TreeNode(2);
		Interv36TreeNode node3 = new Interv36TreeNode(3);
		Interv36TreeNode node4 = new Interv36TreeNode(4);
		Interv36TreeNode node5 = new Interv36TreeNode(5);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		Interv36TreeNode node = Interview36Q1.convertTreeToList(node1);
		Interv36TreeNode lastNode = node;
		while(lastNode.right != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.right;
		}
		System.out.println(lastNode.value);
		
		while(lastNode.left != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.left;
		}
		System.out.println(lastNode.value);
	}
	
	@Test
	public void test4() {
		
		Interv36TreeNode node1 = new Interv36TreeNode(1);
		
		Interv36TreeNode node = Interview36Q1.convertTreeToList(node1);
		Interv36TreeNode lastNode = node;
		while(lastNode.right != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.right;
		}
		System.out.println(lastNode.value);
		
		while(lastNode.left != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.left;
		}
		System.out.println(lastNode.value);
	}
	
	@Test
	public void test5() {
		
		Interv36TreeNode node1 = null;
		
		Interv36TreeNode node = Interview36Q1.convertTreeToList(node1);
		
		if(node == null) {
			System.out.println("Output is null.");
			return;
		}
		Interv36TreeNode lastNode = node;
		while(lastNode.right != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.right;
		}
		System.out.println(lastNode.value);
		
		while(lastNode.left != null) {
			System.out.print(lastNode.value + " ");
			lastNode = lastNode.left;
		}
		System.out.println(lastNode.value);
	}
}
