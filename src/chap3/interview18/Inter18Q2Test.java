package chap3.interview18;

import org.junit.Test;

public class Inter18Q2Test {

	/**
	 * Some nodes are duplicated.
	 * 1-2-3-3-4-4-5
	 */
	@Test
	public void test1() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(2);
		Interview18Node node3 = new Interview18Node(3);
		Interview18Node node4 = new Interview18Node(3);
		Interview18Node node5 = new Interview18Node(4);
		Interview18Node node6 = new Interview18Node(4);
		Interview18Node node7 = new Interview18Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * There is no duplicated nodes.
	 * 1-2-3-4-5-6-7
	 */
	@Test
	public void test2() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(2);
		Interview18Node node3 = new Interview18Node(3);
		Interview18Node node4 = new Interview18Node(4);
		Interview18Node node5 = new Interview18Node(5);
		Interview18Node node6 = new Interview18Node(6);
		Interview18Node node7 = new Interview18Node(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * All nodes in the linked list have the same value, except one node.
	 * 1-1-1-1-1-1-7
	 */
	@Test
	public void test3() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(1);
		Interview18Node node3 = new Interview18Node(1);
		Interview18Node node4 = new Interview18Node(1);
		Interview18Node node5 = new Interview18Node(1);
		Interview18Node node6 = new Interview18Node(1);
		Interview18Node node7 = new Interview18Node(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * All nodes have the same value.
	 * 1-1-1-1-1-1-1
	 */
	@Test
	public void test4() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(1);
		Interview18Node node3 = new Interview18Node(1);
		Interview18Node node4 = new Interview18Node(1);
		Interview18Node node5 = new Interview18Node(1);
		Interview18Node node6 = new Interview18Node(1);
		Interview18Node node7 = new Interview18Node(1);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * All nodes' values appear in pairs.
	 * 1-1-2-2-3-3-4-4
	 */
	@Test
	public void test5() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(1);
		Interview18Node node3 = new Interview18Node(2);
		Interview18Node node4 = new Interview18Node(2);
		Interview18Node node5 = new Interview18Node(3);
		Interview18Node node6 = new Interview18Node(3);
		Interview18Node node7 = new Interview18Node(4);
		Interview18Node node8 = new Interview18Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * All nodes' values appear in pairs exception two nodes.
	 * 1-1-2-3-3-4-5-5
	 */
	@Test
	public void test6() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(1);
		Interview18Node node3 = new Interview18Node(2);
		Interview18Node node4 = new Interview18Node(3);
		Interview18Node node5 = new Interview18Node(3);
		Interview18Node node6 = new Interview18Node(4);
		Interview18Node node7 = new Interview18Node(5);
		Interview18Node node8 = new Interview18Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * There are only two nodes, and the values of the two nodes is not duplicated.
	 * 1-2
	 */
	@Test
	public void test7() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(2);
		
		node1.next = node2;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * There are only one node.
	 * 1
	 */
	@Test
	public void test8() {
		
		Interview18Node node1 = new Interview18Node(1);
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * There are only two duplicated nodes.
	 * 1-2
	 */
	@Test
	public void test9() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(1);
		
		node1.next = node2;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * Empty linked list.
	 * 
	 */
	@Test
	public void test10() {
		
		Interview18Node node1 = null;
		
		Interview18Node ptr = node1;
		if(ptr == null) {
			return;
		}
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Node head = node1;
		
		head = Interview18Q2.deleteDuplicatedNodes(head);
		
		System.out.println();
		
		ptr = head;
		if(ptr == null) {
			return;
		}
		
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
}
