package chap3.interview24;

public class Interview24Q1 {

	/**
	 * Solution 1: Conventional method.
	 * @param headNode
	 * @return
	 */
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
	
	/**
	 * Solution 2: Recursion method.
	 * @param headNode
	 * @return
	 */
	public static Interv24ListNode reverseListRecur(Interv24ListNode headNode) {
		
		if(headNode == null || headNode.next == null) {
			return headNode;
		}
		
		Interv24ListNode newHead = headNode;
		Interv24ListNode oldHead = headNode;
		oldHead = oldHead.next;
		newHead.next = null;
		
		return recursionReverseCore(newHead, oldHead);
	}
	
	private static Interv24ListNode recursionReverseCore(Interv24ListNode newHead, Interv24ListNode oldHead) {
		
		if(oldHead != null) {
			
			Interv24ListNode tmp = oldHead;
			oldHead = oldHead.next;
			tmp.next = newHead;
			newHead = tmp;
			
			return recursionReverseCore(newHead, oldHead);
		}
		
		return newHead;
	}
}
