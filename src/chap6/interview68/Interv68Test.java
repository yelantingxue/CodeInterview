package chap6.interview68;

import org.junit.Test;

public class Interv68Test {

	@Test
	public void test1() {
		
		Interv68TreeNode node1 = new Interv68TreeNode(1);
		Interv68TreeNode node2 = new Interv68TreeNode(2);
		Interv68TreeNode node3 = new Interv68TreeNode(3);
		Interv68TreeNode node4 = new Interv68TreeNode(4);
		Interv68TreeNode node5 = new Interv68TreeNode(5);
		Interv68TreeNode node6 = new Interv68TreeNode(6);
		Interv68TreeNode node7 = new Interv68TreeNode(7);
		Interv68TreeNode node8 = new Interv68TreeNode(8);
		Interv68TreeNode node9 = new Interv68TreeNode(9);
		Interv68TreeNode node10 = new Interv68TreeNode(10);
		
		node1.addSubNode(node2);
		node1.addSubNode(node3);
		node2.addSubNode(node4);
		node2.addSubNode(node5);
		node4.addSubNode(node6);
		node4.addSubNode(node7);
		node5.addSubNode(node8);
		node5.addSubNode(node9);
		node5.addSubNode(node10);
		
		Interv68TreeNode result = Interview68.lastCommonParent(node1, node6, node8);
		if(result == null) {
			System.out.println("No common parent.");
		}else {
			System.out.println(result.value);
		}
	}
	
	@Test
	public void test2() {
		
		Interv68TreeNode node1 = new Interv68TreeNode(1);
		Interv68TreeNode node2 = new Interv68TreeNode(2);
		Interv68TreeNode node3 = new Interv68TreeNode(3);
		Interv68TreeNode node4 = new Interv68TreeNode(4);
		Interv68TreeNode node5 = new Interv68TreeNode(5);
		Interv68TreeNode node6 = new Interv68TreeNode(6);
		Interv68TreeNode node7 = new Interv68TreeNode(7);
		Interv68TreeNode node8 = new Interv68TreeNode(8);
		Interv68TreeNode node9 = new Interv68TreeNode(9);
		Interv68TreeNode node10 = new Interv68TreeNode(10);
		
		node1.addSubNode(node2);
		node1.addSubNode(node3);
		node2.addSubNode(node4);
		node2.addSubNode(node5);
		node4.addSubNode(node6);
		node4.addSubNode(node7);
		node5.addSubNode(node8);
		node5.addSubNode(node9);
		node5.addSubNode(node10);
		
		Interv68TreeNode result = Interview68.lastCommonParent(node1, node8, node10);
		if(result == null) {
			System.out.println("No common parent.");
		}else {
			System.out.println(result.value);
		}
	}
	
	@Test
	public void test3() {
		
		Interv68TreeNode node1 = new Interv68TreeNode(1);
		Interv68TreeNode node2 = new Interv68TreeNode(2);
		Interv68TreeNode node3 = new Interv68TreeNode(3);
		Interv68TreeNode node4 = new Interv68TreeNode(4);
		Interv68TreeNode node5 = new Interv68TreeNode(5);
		
		node1.addSubNode(node2);
		node2.addSubNode(node3);
		node3.addSubNode(node4);
		node4.addSubNode(node5);
		
		Interv68TreeNode result = Interview68.lastCommonParent(node1, node5, node4);
		if(result == null) {
			System.out.println("No common parent.");
		}else {
			System.out.println(result.value);
		}
	}
	
	@Test
	public void test4() {
		
		Interv68TreeNode node1 = new Interv68TreeNode(1);
		Interv68TreeNode node2 = new Interv68TreeNode(2);
		Interv68TreeNode node3 = new Interv68TreeNode(3);
		Interv68TreeNode node4 = new Interv68TreeNode(4);
		Interv68TreeNode node5 = new Interv68TreeNode(5);
		Interv68TreeNode node6 = new Interv68TreeNode(6);
		
		node1.addSubNode(node2);
		node2.addSubNode(node3);
		node3.addSubNode(node4);
		node4.addSubNode(node5);
		
		Interv68TreeNode result = Interview68.lastCommonParent(node1, node5, node6);
		if(result == null) {
			System.out.println("No common parent.");
		}else {
			System.out.println(result.value);
		}
	}
	
	@Test
	public void test5() {
		
		Interv68TreeNode result = Interview68.lastCommonParent(null, null, null);
		if(result == null) {
			System.out.println("No common parent.");
		}else {
			System.out.println(result.value);
		}
	}
}
