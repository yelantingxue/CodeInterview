package chap2.interview24;

import org.junit.Test;

public class Inter24Q1Test {

	/**
	 * A list has multiple nodes.
	 */
	@Test
	public void test1() {
		Interv24ListNode node1 = new Interv24ListNode(1);
		Interv24ListNode node2 = new Interv24ListNode(2);
		Interv24ListNode node3 = new Interv24ListNode(3);
		Interv24ListNode node4 = new Interv24ListNode(4);
		Interv24ListNode node5 = new Interv24ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Interv24ListNode node = Interview24Q1.reverseList(node1);
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	/**
	 * A list has two nodes.
	 */
	@Test
	public void test2() {
		Interv24ListNode node1 = new Interv24ListNode(1);
		Interv24ListNode node2 = new Interv24ListNode(2);
		
		node1.next = node2;
		
		Interv24ListNode node = Interview24Q1.reverseList(node1);
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	/**
	 * A list has only one node.
	 */
	@Test
	public void test3() {
		Interv24ListNode node1 = new Interv24ListNode(1);
		
		Interv24ListNode node = Interview24Q1.reverseList(node1);
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	/**
	 * Input list is null.
	 */
	@Test
	public void test4() {
		Interv24ListNode node1 = null;
		
		Interv24ListNode node = Interview24Q1.reverseList(node1);
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
