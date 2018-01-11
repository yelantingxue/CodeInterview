package chap2.interview9;

import org.junit.Test;

public class QueueToStackTest {

	@Test
	public void test() {
		
		QueueToStack<Integer> stack = new QueueToStack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		stack.push(4);
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
