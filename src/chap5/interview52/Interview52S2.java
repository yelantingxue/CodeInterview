package chap5.interview52;

public class Interview52S2 {

	public static Interv52ListNode findFirstCommonNode(Interv52ListNode head1, Interv52ListNode head2) {
		
		if(head1 == null || head2 == null) {
			return null;
		}
		
		int lenOfList1 = 0;
		int lenOfList2 = 0;
		
		Interv52ListNode pNode1 = head1;
		Interv52ListNode pNode2 = head2;
		
		while(pNode1 != null || pNode2 != null) {
			
			if(pNode1 != null) {
				++lenOfList1;
				pNode1 = pNode1.next;
			}
			
			if(pNode2 != null) {
				++lenOfList2;
				pNode2 = pNode2.next;
			}
		}
		
		int diffLen = 0;
		Interv52ListNode longListHead = head1;
		Interv52ListNode shortListHead = head2;
		
		if(lenOfList1 >= lenOfList2) {
			diffLen = lenOfList1 - lenOfList2;
		}else {
			diffLen = lenOfList2 - lenOfList1;
			longListHead = head2;
			shortListHead = head1;
		}
		
		while(diffLen > 0) {
			longListHead = longListHead.next;
			--diffLen;
		}
		
		while(longListHead != null && shortListHead != null && longListHead != shortListHead) {
			longListHead = longListHead.next;
			shortListHead = shortListHead.next;
		}
		
		if(longListHead == null || shortListHead == null) {
			return null;
		}else {
			return longListHead;
		}
	}
}
