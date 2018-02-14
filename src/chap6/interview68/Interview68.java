package chap6.interview68;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Interview68 {

	public static Interv68TreeNode lastCommonParent(Interv68TreeNode head, 
			Interv68TreeNode target1, Interv68TreeNode target2) {
		
		if(head == null || head.numOfSubNode == 0 
				|| target1 == null || target2 == null) {
			return null;
		}
		
		Deque<Interv68TreeNode> parents1 = new ArrayDeque<>();
		Deque<Interv68TreeNode> parents2 = new ArrayDeque<>();
		
		boolean hasCommon1 = preOrder(head, parents1, target1);
		boolean hasCommon2 = preOrder(head, parents2, target2);
		
		if(!(hasCommon1 && hasCommon2)) {
			return null;
		}
		
		Interv68TreeNode result = head;
		while(!parents1.isEmpty() && !parents2.isEmpty()) {
			
			Interv68TreeNode tmp1 = parents1.poll();
			Interv68TreeNode tmp2 = parents2.poll();
			
			if(tmp1 == tmp2) {
				result = tmp1;
			}else {
				break;
			}
		}
		
		return result;
	}
	
	private static boolean preOrder(Interv68TreeNode head, 
			Deque<Interv68TreeNode> queue, Interv68TreeNode target) {
		
		if(head == null) {
			return false;
		}
		
		if(head == target) {
			return true;
		}
		
		queue.add(head);
		
		for(Interv68TreeNode node: head.subNodes) {
			if(preOrder(node, queue, target)) {
				return true;
			}else {
				queue.removeLast();
			}
		}
		return false;
	}
}
