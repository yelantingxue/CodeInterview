package chap4.interview30;

import java.util.Stack;

public class StackWithMin {

	public Stack<Integer> data;
	public Stack<Integer> min;
	
	
	
	public StackWithMin() {
		super();
		
		data = new Stack<>();
		min = new Stack<>();
	}

	public void push(Integer t) {
		
		data.push(t);
		
		if(min.isEmpty()) {
			
			min.push(t);
			
		}else if(t < min.peek()) {
			
			min.push(t);
		}else {
			min.push(min.peek());
		}
	}
	
	public Integer pop() {
		min.pop();
		return data.pop();
	}
	
	
	public Integer min() {
		return min.peek();
	}
}
