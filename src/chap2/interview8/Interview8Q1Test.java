package chap2.interview8;

import org.junit.Test;

public class Interview8Q1Test {

	/**
	 *         8
	 *     6       10
	 *    5 7    9    11
	 *     
	 */
	@Test
	public void test1(){
		
		Interview8BinaryTree node8 = new Interview8BinaryTree(8);
		Interview8BinaryTree node6 = new Interview8BinaryTree(6);
		Interview8BinaryTree node10 = new Interview8BinaryTree(10);
		Interview8BinaryTree node5 = new Interview8BinaryTree(5);
		Interview8BinaryTree node7 = new Interview8BinaryTree(7);
		Interview8BinaryTree node9 = new Interview8BinaryTree(9);
		Interview8BinaryTree node11 = new Interview8BinaryTree(11);
		
		node8.left = node6;
		node8.right = node10;
		node6.left = node5;
		node6.right = node7;
		node6.parent = node8;
		node10.left = node9;
		node10.right = node11;
		node10.parent = node8;
		node5.parent = node6;
		node7.parent = node6;
		node9.parent = node10;
		node11.parent = node10;
		
		System.out.println(Interview8Q1.getNext(node8).value);
		System.out.println(Interview8Q1.getNext(node6).value);
		System.out.println(Interview8Q1.getNext(node10).value);
		
		if(Interview8Q1.getNext(node5) != null) {
			System.out.println(Interview8Q1.getNext(node5).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node7) != null) {
			System.out.println(Interview8Q1.getNext(node7).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node9) != null) {
			System.out.println(Interview8Q1.getNext(node9).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node11) != null) {
			System.out.println(Interview8Q1.getNext(node11).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
	}
	
	@Test
	public void test2() {
		
		Interview8BinaryTree node5 = new Interview8BinaryTree(5);
		Interview8BinaryTree node4 = new Interview8BinaryTree(4);
		Interview8BinaryTree node3 = new Interview8BinaryTree(3);
		Interview8BinaryTree node2 = new Interview8BinaryTree(2);
		
		node5.left = node4;
		node4.left = node3;
		node4.parent = node5;
		node3.left = node2;
		node3.parent = node4;
		node2.parent = node3;
		
		if(Interview8Q1.getNext(node5) != null) {
			System.out.println(Interview8Q1.getNext(node5).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node4) != null) {
			System.out.println(Interview8Q1.getNext(node4).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node3) != null) {
			System.out.println(Interview8Q1.getNext(node3).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node2) != null) {
			System.out.println(Interview8Q1.getNext(node2).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
	}
	
	@Test
	public void test3() {
		
		Interview8BinaryTree node5 = new Interview8BinaryTree(5);
		Interview8BinaryTree node4 = new Interview8BinaryTree(4);
		Interview8BinaryTree node3 = new Interview8BinaryTree(3);
		Interview8BinaryTree node2 = new Interview8BinaryTree(2);
		
		node2.right = node3;
		node3.right = node4;
		node3.parent = node2;
		node4.right = node5;
		node4.parent = node3;
		node5.parent = node4;
		
		if(Interview8Q1.getNext(node5) != null) {
			System.out.println(Interview8Q1.getNext(node5).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node4) != null) {
			System.out.println(Interview8Q1.getNext(node4).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node3) != null) {
			System.out.println(Interview8Q1.getNext(node3).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
		
		if(Interview8Q1.getNext(node2) != null) {
			System.out.println(Interview8Q1.getNext(node2).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
	}
	
	@Test
	public void test4() {
		
		Interview8BinaryTree node5 = new Interview8BinaryTree(5);
		
		if(Interview8Q1.getNext(node5) != null) {
			System.out.println(Interview8Q1.getNext(node5).value);
		}else {
			System.out.println("The last node in in-order traverse.");
		}
	}
}
