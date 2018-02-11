package chap5.interview52;

import org.junit.Test;

public class Interv52S2Test {

	/**
	 * Expected: 6
	 */
	@Test
	public void test1() {
		
		Interv52ListNode node1 = new Interv52ListNode(1);
		Interv52ListNode node2 = new Interv52ListNode(2);
		Interv52ListNode node3 = new Interv52ListNode(3);
		Interv52ListNode node4 = new Interv52ListNode(4);
		Interv52ListNode node5 = new Interv52ListNode(5);
		Interv52ListNode node6 = new Interv52ListNode(6);
		Interv52ListNode node7 = new Interv52ListNode(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node6;
		node6.next = node7;
		
		node4.next = node5;
		node5.next = node6;
		
		Interv52ListNode result = Interview52S2.findFirstCommonNode(node1, node4);
		System.out.println(result.value);
	}
	
	@Test
	public void test2() {
		
		Interv52ListNode node1 = new Interv52ListNode(1);
		Interv52ListNode node2 = new Interv52ListNode(2);
		Interv52ListNode node3 = new Interv52ListNode(3);
		Interv52ListNode node4 = new Interv52ListNode(4);
		Interv52ListNode node5 = new Interv52ListNode(5);
		Interv52ListNode node6 = new Interv52ListNode(6);
		Interv52ListNode node7 = new Interv52ListNode(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		node5.next = node6;
		node6.next = node7;
		
		Interv52ListNode result = Interview52S2.findFirstCommonNode(node1, node5);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No Common node.");
		}
		
	}
	
	@Test
	public void test3() {
		
		Interv52ListNode node1 = new Interv52ListNode(1);
		Interv52ListNode node2 = new Interv52ListNode(2);
		Interv52ListNode node3 = new Interv52ListNode(3);
		Interv52ListNode node4 = new Interv52ListNode(4);
		Interv52ListNode node5 = new Interv52ListNode(5);
		Interv52ListNode node6 = new Interv52ListNode(6);
		Interv52ListNode node7 = new Interv52ListNode(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node7;
		
		node5.next = node6;
		node6.next = node7;
		
		Interv52ListNode result = Interview52S2.findFirstCommonNode(node1, node5);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No Common node.");
		}
		
	}
	
	@Test
	public void test4() {
		
		Interv52ListNode node1 = new Interv52ListNode(1);
		Interv52ListNode node2 = new Interv52ListNode(2);
		Interv52ListNode node3 = new Interv52ListNode(3);
		Interv52ListNode node4 = new Interv52ListNode(4);
		Interv52ListNode node5 = new Interv52ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Interv52ListNode result = Interview52S2.findFirstCommonNode(node1, node1);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No Common node.");
		}
		
	}
	
	@Test
	public void test5() {
		
		Interv52ListNode node1 = new Interv52ListNode(1);
		Interv52ListNode node2 = new Interv52ListNode(2);
		Interv52ListNode node3 = new Interv52ListNode(3);
		Interv52ListNode node4 = new Interv52ListNode(4);
		Interv52ListNode node5 = new Interv52ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Interv52ListNode result = Interview52S2.findFirstCommonNode(node1, null);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No Common node.");
		}
		
	}
	
	@Test
	public void test6() {
		
		Interv52ListNode result = Interview52S2.findFirstCommonNode(null, null);
		if(result != null) {
			System.out.println(result.value);
		}else {
			System.out.println("No Common node.");
		}
		
	}
}
