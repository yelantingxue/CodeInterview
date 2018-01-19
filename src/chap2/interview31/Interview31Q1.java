package chap2.interview31;

import java.util.Stack;

public class Interview31Q1 {

	public static boolean isPopOrder(int[] pushOrder, int[] popOrder) {
		
		if(pushOrder == null && popOrder == null) {
			return true;
		}
		
		if(pushOrder == null || popOrder == null) {
			return false;
		}
		
		if(pushOrder.length == 0 && popOrder.length == 0) {
			return true;
		}
		
		if(pushOrder.length == 0 || popOrder.length == 0) {
			return false;
		}
		
		Stack<Integer> pushStack = new Stack<>();
		
		int iPush = 0;
		int iPop = 0;
		
		for(iPush = 0; iPush < pushOrder.length; iPush++) {
			pushStack.push(pushOrder[iPush]);
			
			while(!pushStack.empty() && iPop < popOrder.length 
					&& pushStack.peek() == popOrder[iPop]) {
				pushStack.pop();
				iPop++;
			}
		}
		
		if(!pushStack.empty()) {
			return false;
		}else {
			return true;
		}
	}
}
