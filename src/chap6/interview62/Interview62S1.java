package chap6.interview62;

import java.io.IOException;

public class Interview62S1 {

	public static int lastNumber(int num, int m) throws IOException{
		
		if(num <= 0 || m <= 0) {
			throw new IOException("Invalid Input.");
		}
		
		if(num == 1) {
			return 0;
		}
		
		if(m == 1) {
			return num - 1;
		}
		
		Interv62ListNode head = new Interv62ListNode(0);
		Interv62ListNode pNode = head;
		
		for(int i = 1; i < num; i++) {
			
			pNode.next = new Interv62ListNode(i);
			pNode = pNode.next;
		}
		
		pNode = head;
		while(head.next != null) {
			
			if(pNode == null) {
				pNode = head;
			}
			
			for(int i = m; i > 2; --i) {
				
				if(pNode.next == null) {
					pNode = head;
				}else {
					pNode = pNode.next;
				}
			}
			
			if(pNode.next == null) {
				
				head = head.next;
				pNode = head;
			}else {
				pNode.next = pNode.next.next;
				pNode = pNode.next;
			}
			
		}
		
		return head.value;
	}
}
