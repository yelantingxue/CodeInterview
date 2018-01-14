package chap2.interview18;

import org.junit.Test;

public class Inter18Q1Test {

	/**
	 * Node to be deleted is in the middle of the linked list.
	 */
	@Test
	public void test1() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(2);
		Interview18Node node3 = new Interview18Node(3);
		Interview18Node node4 = new Interview18Node(4);
		Interview18Node node5 = new Interview18Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Q1.deleteNode(node1, node3);
		
		System.out.println();
		
		ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * Node to be deleted is the last node of the linked list.
	 */
	@Test
	public void test2() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(2);
		Interview18Node node3 = new Interview18Node(3);
		Interview18Node node4 = new Interview18Node(4);
		Interview18Node node5 = new Interview18Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Q1.deleteNode(node1, node5);
		
		System.out.println();
		
		ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
	
	/**
	 * Node to be deleted is the head node of the linked list.
	 */
	@Test
	public void test3() {
		
		Interview18Node node1 = new Interview18Node(1);
		Interview18Node node2 = new Interview18Node(2);
		Interview18Node node3 = new Interview18Node(3);
		Interview18Node node4 = new Interview18Node(4);
		Interview18Node node5 = new Interview18Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Interview18Node ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
		
		Interview18Q1.deleteNode(node1, node1);
		
		System.out.println();
		
		ptr = node1;
		while(ptr.next != null) {
			System.out.print(ptr.value);
			System.out.print(" ");
			ptr = ptr.next;
		}
		System.out.print(ptr.value);
	}
}
