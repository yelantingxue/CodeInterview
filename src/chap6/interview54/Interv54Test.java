package chap6.interview54;

import org.junit.Test;

public class Interv54Test {

	@Test
	public void test1() {
		
		Interv54TreeNode node9 = new Interv54TreeNode(9);
		Interv54TreeNode node10 = new Interv54TreeNode(10);
		Interv54TreeNode node11 = new Interv54TreeNode(11);
		Interv54TreeNode node5 = new Interv54TreeNode(5);
		Interv54TreeNode node6 = new Interv54TreeNode(6);
		Interv54TreeNode node7 = new Interv54TreeNode(7);
		Interv54TreeNode node8 = new Interv54TreeNode(8);
		
		node8.left = node6;
		node8.right = node10;
		node6.left = node5;
		node6.right = node7;
		node10.left = node9;
		node10.right = node11;
		
		Interv54TreeNode result = Interview54.kthNode(node8, -1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 2);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 3);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 4);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 5);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 6);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 7);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node8, 8);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
	}
	
	
	@Test
	public void test2() {
		
		Interv54TreeNode node1 = new Interv54TreeNode(1);
		Interv54TreeNode node2 = new Interv54TreeNode(2);
		Interv54TreeNode node3 = new Interv54TreeNode(3);
		Interv54TreeNode node4 = new Interv54TreeNode(4);
		Interv54TreeNode node5 = new Interv54TreeNode(5);
		
		node5.left = node4;
		node4.left = node3;
		node3.left = node2;
		node2.left = node1;
		
		Interv54TreeNode result = Interview54.kthNode(node5, -1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node5, 1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node5, 2);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node5, 3);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node5, 4);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node5, 5);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node5, 6);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
	}
	
	
	@Test
	public void test3() {
		
		Interv54TreeNode node1 = new Interv54TreeNode(1);
		Interv54TreeNode node2 = new Interv54TreeNode(2);
		Interv54TreeNode node3 = new Interv54TreeNode(3);
		Interv54TreeNode node4 = new Interv54TreeNode(4);
		Interv54TreeNode node5 = new Interv54TreeNode(5);
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		
		Interv54TreeNode result = Interview54.kthNode(node1, 0);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 2);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 3);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 4);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 5);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 6);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
	}
	
	@Test
	public void test4() {
		
		Interv54TreeNode node1 = new Interv54TreeNode(1);
		
		Interv54TreeNode result = Interview54.kthNode(node1, 0);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 2);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
	}
	
	@Test
	public void test5() {
		
		Interv54TreeNode node1 = null;
		
		Interv54TreeNode result = Interview54.kthNode(node1, 0);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
		
		result = Interview54.kthNode(node1, 2);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No such node.");
		}
	}
}
