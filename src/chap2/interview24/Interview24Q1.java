package chap2.interview24;

public class Interview24Q1 {

	public static Interv24ListNode reverseList(Interv24ListNode headNode) {
		
		if(headNode == null || headNode.next == null) {
			return headNode;
		}
		
		Interv24ListNode preNode = headNode;
		Interv24ListNode curNode = headNode.next;
		Interv24ListNode nextNode = headNode.next.next;
		
		preNode.next = null;
		
		while(nextNode != null) {
			curNode.next = preNode;
			
			preNode = curNode;
			curNode = nextNode;
			nextNode = nextNode.next;
		}
		curNode.next = preNode;
		
		return curNode;
	}
}
