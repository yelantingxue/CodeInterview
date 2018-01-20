package chap3.interview25;

import org.junit.Test;

public class Interv25Q1Test {

	/**
	 * 1->3->5->7
	 * 2->4->6->8
	 */
	@Test
	public void test1() {
		
		Interv25Node node1 = new Interv25Node(1);
		Interv25Node node2 = new Interv25Node(2);
		Interv25Node node3 = new Interv25Node(3);
		Interv25Node node4 = new Interv25Node(4);
		Interv25Node node5 = new Interv25Node(5);
		Interv25Node node6 = new Interv25Node(6);
		Interv25Node node7 = new Interv25Node(7);
		Interv25Node node8 = new Interv25Node(8);
		
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		
		node2.next = node4;
		node4.next = node6;
		node6.next = node8;
		
//		Interv25Node nodeS1 = Interview25Q1.mergeS1(node1, node2);
		Interv25Node nodeS2 = Interview25Q1.mergeS2(node1, node2);
		
		Interv25Node tmp = nodeS2;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
	
	/**
	 * 1->3->5->7
	 * 1->3->5->7
	 */
	@Test
	public void test2() {
		
		Interv25Node node1 = new Interv25Node(1);
		Interv25Node node2 = new Interv25Node(1);
		Interv25Node node3 = new Interv25Node(3);
		Interv25Node node4 = new Interv25Node(3);
		Interv25Node node5 = new Interv25Node(5);
		Interv25Node node6 = new Interv25Node(5);
		Interv25Node node7 = new Interv25Node(7);
		Interv25Node node8 = new Interv25Node(7);
		
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		
		node2.next = node4;
		node4.next = node6;
		node6.next = node8;
		
//		Interv25Node nodeS1 = Interview25Q1.mergeS1(node1, node2);
		Interv25Node nodeS2 = Interview25Q1.mergeS2(node1, node2);
		
		Interv25Node tmp = nodeS2;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
	
	/**
	 * list1: 1
	 * list2: 2
	 */
	@Test
	public void test3() {
		
		Interv25Node node1 = new Interv25Node(1);
		Interv25Node node2 = new Interv25Node(2);
		
//		Interv25Node nodeS1 = Interview25Q1.mergeS1(node1, node2);
		Interv25Node nodeS2 = Interview25Q1.mergeS2(node1, node2);
		
		Interv25Node tmp = nodeS2;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
	
	/**
	 * list1: 1->3->5->7
	 * list2: empty
	 */
	@Test
	public void test4() {
		
		Interv25Node node1 = new Interv25Node(1);
		
		Interv25Node node3 = new Interv25Node(3);
		
		Interv25Node node5 = new Interv25Node(5);
		
		Interv25Node node7 = new Interv25Node(7);
		
		
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		
		Interv25Node node2 = null;
		
//		Interv25Node nodeS1 = Interview25Q1.mergeS1(node1, node2);
		Interv25Node nodeS2 = Interview25Q1.mergeS2(node1, node2);
		
		Interv25Node tmp = nodeS2;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
	
	/**
	 * Two lists are all empty.
	 */
	@Test
	public void test5() {
		
		Interv25Node node1 = null;
		Interv25Node node2 = null;
		
//		Interv25Node nodeS1 = Interview25Q1.mergeS1(node1, node2);
		Interv25Node nodeS2 = Interview25Q1.mergeS2(node1, node2);
		
		Interv25Node tmp = nodeS2;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}
}
