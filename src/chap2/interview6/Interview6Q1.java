package chap2.interview6;

import java.util.Iterator;
import java.util.Stack;

public class Interview6Q1 {
	
	public static void printListInReversedOrder(Interview6Node n) {
		
		Stack<Interview6Node> stack = new Stack<>();
		Interview6Node m = n;
		while(m != null) {
			stack.push(m);
			m = m.next;
		}
		
		while(!stack.empty()) {
			System.out.println(stack.pop().value);
		}
	}
	
	public static void printListInReversedOrder1(Interview6Node n) {
		
		if(n != null && n.next != null) {
			printListInReversedOrder1(n.next);
			System.out.println(n.value);
		}else if(n != null) {
			System.out.println(n.value);
		}
	}
}
