package chap2.interview23;

import org.junit.Test;

public class Inter23Q1Test {

	/**
	 * A list has multiple nodes, with a loop.
	 */
	@Test
	public void test1() {
		
		Inter23ListNode node1 = new Inter23ListNode(1);
		Inter23ListNode node2 = new Inter23ListNode(2);
		Inter23ListNode node3 = new Inter23ListNode(3);
		Inter23ListNode node4 = new Inter23ListNode(4);
		Inter23ListNode node5 = new Inter23ListNode(5);
		Inter23ListNode node6 = new Inter23ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node3;
		
		System.out.println(Interview23Q1.entryNodeOfLoop(node1).value);
	}
	
	/**
	 * A list has a node, without a loop.
	 */
	@Test
	public void test2() {
		
		Inter23ListNode node1 = new Inter23ListNode(1);
		
		Inter23ListNode node = Interview23Q1.entryNodeOfLoop(node1);
		if(node != null) {
			System.out.println(node.value);
		}else {
			System.out.println("Return node is null.");
		}
	}
	
	/**
	 * A list has a node, with a loop.
	 */
	@Test
	public void test3() {
		
		Inter23ListNode node1 = new Inter23ListNode(1);
		node1.next = node1;
		
		Inter23ListNode node = Interview23Q1.entryNodeOfLoop(node1);
		if(node != null) {
			System.out.println(node.value);
		}else {
			System.out.println("Return node is null.");
		}
	}
	
	/**
	 * A list has multiple nodes, with a loop.
	 */
	@Test
	public void test4() {
		
		Inter23ListNode node1 = new Inter23ListNode(1);
		Inter23ListNode node2 = new Inter23ListNode(2);
		Inter23ListNode node3 = new Inter23ListNode(3);
		Inter23ListNode node4 = new Inter23ListNode(4);
		Inter23ListNode node5 = new Inter23ListNode(5);
		Inter23ListNode node6 = new Inter23ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node1;
		
		System.out.println(Interview23Q1.entryNodeOfLoop(node1).value);
	}
	
	/**
	 * A list has multiple nodes, with a loop.
	 */
	@Test
	public void test5() {
		
		Inter23ListNode node1 = new Inter23ListNode(1);
		Inter23ListNode node2 = new Inter23ListNode(2);
		Inter23ListNode node3 = new Inter23ListNode(3);
		Inter23ListNode node4 = new Inter23ListNode(4);
		Inter23ListNode node5 = new Inter23ListNode(5);
		Inter23ListNode node6 = new Inter23ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node6;
		
		System.out.println(Interview23Q1.entryNodeOfLoop(node1).value);
	}
	
	/**
	 * A list has multiple nodes, without a loop.
	 */
	@Test
	public void test6() {
		
		Inter23ListNode node1 = new Inter23ListNode(1);
		Inter23ListNode node2 = new Inter23ListNode(2);
		Inter23ListNode node3 = new Inter23ListNode(3);
		Inter23ListNode node4 = new Inter23ListNode(4);
		Inter23ListNode node5 = new Inter23ListNode(5);
		Inter23ListNode node6 = new Inter23ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		Inter23ListNode node = Interview23Q1.entryNodeOfLoop(node1);
		if(node != null) {
			System.out.println(node.value);
		}else {
			System.out.println("Return node is null.");
		}
	}
	
	/**
	 * Empty List.
	 */
	@Test
	public void test7() {
		
		Inter23ListNode node1 = null;
		
		Inter23ListNode node = Interview23Q1.entryNodeOfLoop(node1);
		if(node != null) {
			System.out.println(node.value);
		}else {
			System.out.println("Return node is null.");
		}
	}
}
