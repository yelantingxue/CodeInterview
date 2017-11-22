package chap2.interview9;

import java.util.Stack;

public class Inter9Queue<T> {
	
	private T data;
	
	private Stack<T> stack1 = new Stack<>();
	
	private Stack<T> stack2 = new Stack<>();
	

	public void appendTail(T t) {
		
		stack1.push(t);
	}
	
	public T deleteHead() {
		
		if(!stack2.isEmpty()) {
			
			return stack2.pop();
		
		}else if(stack1.isEmpty()) {
			
			return null;
		
		}else {
			
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			
			return stack2.pop();
		}
	}

}
