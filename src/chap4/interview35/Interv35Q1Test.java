package chap4.interview35;

import org.junit.Test;

public class Interv35Q1Test {

	@Test
	public void test1() {
		
		Interv35ComplexListNode node1 = new Interv35ComplexListNode(1);
		Interv35ComplexListNode node2 = new Interv35ComplexListNode(2);
		Interv35ComplexListNode node3 = new Interv35ComplexListNode(3);
		Interv35ComplexListNode node4 = new Interv35ComplexListNode(4);
		Interv35ComplexListNode node5 = new Interv35ComplexListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node1.randomNode = node3;
		node2.randomNode = node5;
		node4.randomNode = node2;
		
		Interv35ComplexListNode newHead = Interview35Q1.cloneComplexList(node1);
		
		newHead.printComplexList(newHead);
	}
	
	/**
	 * node3.randomNode points to itself.
	 */
	@Test
	public void test2() {
		
		Interv35ComplexListNode node1 = new Interv35ComplexListNode(1);
		Interv35ComplexListNode node2 = new Interv35ComplexListNode(2);
		Interv35ComplexListNode node3 = new Interv35ComplexListNode(3);
		Interv35ComplexListNode node4 = new Interv35ComplexListNode(4);
		Interv35ComplexListNode node5 = new Interv35ComplexListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node3.randomNode = node3;
		node2.randomNode = node5;
		node4.randomNode = node2;
		
		Interv35ComplexListNode newHead = Interview35Q1.cloneComplexList(node1);
		
		newHead.printComplexList(newHead);
	}
	
	/**
	 * Nodes' randomNodes form a circle.
	 */
	@Test
	public void test3() {
		
		Interv35ComplexListNode node1 = new Interv35ComplexListNode(1);
		Interv35ComplexListNode node2 = new Interv35ComplexListNode(2);
		Interv35ComplexListNode node3 = new Interv35ComplexListNode(3);
		Interv35ComplexListNode node4 = new Interv35ComplexListNode(4);
		Interv35ComplexListNode node5 = new Interv35ComplexListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node2.randomNode = node4;
		node4.randomNode = node2;
		
		Interv35ComplexListNode newHead = Interview35Q1.cloneComplexList(node1);
		
		newHead.printComplexList(newHead);
	}
	
	/**
	 * Only one node.
	 */
	@Test
	public void test4() {
		
		Interv35ComplexListNode node1 = new Interv35ComplexListNode(1);
		
		Interv35ComplexListNode newHead = Interview35Q1.cloneComplexList(node1);
		
		newHead.printComplexList(newHead);
	}
	
	/**
	 * Input is null.
	 */
	@Test
	public void test5() {
		
		Interv35ComplexListNode node1 = null;
		
		Interv35ComplexListNode newHead = Interview35Q1.cloneComplexList(node1);
		
		if(newHead == null) {
			System.out.println("The node is null.");
		}
	}
}
