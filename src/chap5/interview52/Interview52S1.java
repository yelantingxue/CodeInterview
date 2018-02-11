package chap5.interview52;

import java.util.Stack;

public class Interview52S1 {

	public static Interv52ListNode findFirstCommonNode(Interv52ListNode head1, Interv52ListNode head2) {
		
		if(head1 == null || head2 == null) {
			return null;
		}
		
		Interv52ListNode p1 = head1;
		Interv52ListNode p2 = head2;
		
		Stack<Interv52ListNode> stack1 = new Stack<>();
		Stack<Interv52ListNode> stack2 = new Stack<>();
		
		while(p1 != null || p2 != null) {
			
			if(p1 != null) {
				stack1.push(p1);
				p1 = p1.next;
			}
			
			if(p2 != null) {
				stack2.push(p2);
				p2 = p2.next;
			}
		}
		
		Interv52ListNode pNode1 = null;
		Interv52ListNode pNode2 = null;
		
		while(!stack1.isEmpty() && !stack2.isEmpty()) {
			
			pNode1 = stack1.pop();
			pNode2 = stack2.pop();
			
			if(pNode1 != pNode2) {
				break;
			}
		}
		
		if(pNode1 == null && pNode2 == null) {
			return null;
		}else if(pNode1 == pNode2) {
			return pNode1;
		}else {
			Interv52ListNode result = pNode1.next;
			return result;
		}
		
	}
}
