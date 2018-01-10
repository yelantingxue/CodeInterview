package chap2.interview6;

import org.junit.Test;

public class Interview6Q1Test {

	/**
	 * 2 -> 0 -> 1 -> 7
	 */
	@Test
	public void test1() {
		
		Interview6Node node1 = new Interview6Node(2);
		Interview6Node node2 = new Interview6Node(0);
		Interview6Node node3 = new Interview6Node(1);
		Interview6Node node4 = new Interview6Node(7);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		Interview6Q1.printListInReversedOrder(node1);
		Interview6Q1.printListInReversedOrder1(node1);
	}
	
	/**
	 * Linked list consists only one node.
	 */
	@Test
	public void test2() {
		
		Interview6Node node1 = new Interview6Node(2);
		
		Interview6Q1.printListInReversedOrder(node1);
		Interview6Q1.printListInReversedOrder1(node1);
	}
	
	/**
	 * Linked list is empty.
	 */
	@Test
	public void test3() {
		
		Interview6Node node1 = null;
		
		Interview6Q1.printListInReversedOrder(node1);
		Interview6Q1.printListInReversedOrder1(node1);
	}
}
