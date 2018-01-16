package chap2.interview22;

import org.junit.Test;

public class Inter22Q1Test {

	/**
	 * The node to be found is in the middle of the linked list.
	 */
	@Test
	public void test1() {

		Inter22ListNode node1 = new Inter22ListNode(1);
		Inter22ListNode node2 = new Inter22ListNode(2);
		Inter22ListNode node3 = new Inter22ListNode(3);
		Inter22ListNode node4 = new Inter22ListNode(4);
		Inter22ListNode node5 = new Inter22ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		System.out.println(Interview22Q1.findKthToTail(node1, 2).value);
	}

	/**
	 * The node to be found is the last node of the linked list.
	 */
	@Test
	public void test2() {

		Inter22ListNode node1 = new Inter22ListNode(1);
		Inter22ListNode node2 = new Inter22ListNode(2);
		Inter22ListNode node3 = new Inter22ListNode(3);
		Inter22ListNode node4 = new Inter22ListNode(4);
		Inter22ListNode node5 = new Inter22ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		System.out.println(Interview22Q1.findKthToTail(node1, 1).value);
	}

	/**
	 * The node to be found is the first node of the linked list.
	 */
	@Test
	public void test3() {

		Inter22ListNode node1 = new Inter22ListNode(1);
		Inter22ListNode node2 = new Inter22ListNode(2);
		Inter22ListNode node3 = new Inter22ListNode(3);
		Inter22ListNode node4 = new Inter22ListNode(4);
		Inter22ListNode node5 = new Inter22ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		System.out.println(Interview22Q1.findKthToTail(node1, 5).value);
	}

	/**
	 * The input linked list is null.
	 */
	@Test
	public void test4() {

		Inter22ListNode node1 = Interview22Q1.findKthToTail(null, 2);

		if (node1 != null) {
			System.out.println(Interview22Q1.findKthToTail(node1, 2).value);
		} else {
			System.out.println("Return node is null");
		}

	}

	/**
	 * The second parameter of the method is larger than the length of the length.
	 */
	@Test
	public void test5() {

		Inter22ListNode node1 = new Inter22ListNode(1);
		Inter22ListNode node2 = new Inter22ListNode(2);
		Inter22ListNode node3 = new Inter22ListNode(3);
		Inter22ListNode node4 = new Inter22ListNode(4);
		Inter22ListNode node5 = new Inter22ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Inter22ListNode node = Interview22Q1.findKthToTail(node1, 6);

		if (node != null) {
			System.out.println(node.value);
		} else {
			System.out.println("Return node is null");
		}
	}
	
	/**
	 * The second parameter of the method is 0.
	 */
	@Test
	public void test6() {

		Inter22ListNode node1 = new Inter22ListNode(1);
		Inter22ListNode node2 = new Inter22ListNode(2);
		Inter22ListNode node3 = new Inter22ListNode(3);
		Inter22ListNode node4 = new Inter22ListNode(4);
		Inter22ListNode node5 = new Inter22ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Inter22ListNode node = Interview22Q1.findKthToTail(node1, 0);

		if (node != null) {
			System.out.println(node.value);
		} else {
			System.out.println("Return node is null");
		}
	}
}
