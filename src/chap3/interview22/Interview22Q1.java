package chap3.interview22;

public class Interview22Q1 {

	public static Inter22ListNode findKthToTail(Inter22ListNode headNode, int k) {
		
		if(headNode == null || k == 0) {
			return null;
		}
		
		Inter22ListNode tailNode = headNode;
		Inter22ListNode kthTailNode = headNode;
		
		int count = k-1;
		
		while(tailNode.next != null && count > 0) {
			tailNode = tailNode.next;
			count--;
		}
		
		if(count > 0) {
			return null;
		}
		
		while(tailNode.next != null) {
			tailNode = tailNode.next;
			kthTailNode = kthTailNode.next;
		}
		return kthTailNode;
	}
}
