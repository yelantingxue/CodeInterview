package chap2.interview23;

public class Interview23Q1 {

	public static Inter23ListNode entryNodeOfLoop(Inter23ListNode headNode) {
		
		if(headNode == null) {
			return null;
		}
		
		Inter23ListNode p1 = headNode;
		Inter23ListNode p2 = headNode;
		
		//Only one node in the list.
		if(p2.next == null) {
			return null;
		}
		
		//Judge if there is a ring in the linked list.
		do {
			p2 = p2.next.next;
			p1 = p1.next;
		}while(p2 != null && p2.next != null && p2 != p1);
		
		//There is no ring in the linked list.
		if(p2 == null || p2.next == null) {
			return null;
		}
		
		Inter23ListNode countPoint = p1;
		int countOfRing = 0;
		
		//Get the number of the nodes in the ring.
		do {
			countPoint = countPoint.next;
			countOfRing++;
		}while(countPoint != p1);
		
		p1 = headNode;
		p2 = headNode;
		
		//p2 moves countOfRing steps first.
		while(countOfRing > 0) {
			p2 = p2.next;
			countOfRing--;
		}
		
		//The node that p1 and p2 meets is what we want.
		while(p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
	}
	
}
