package chap2.interview9;

import org.junit.Test;

public class Inter9QueueTest {

	@Test
	public void test1() {
		Inter9Queue<Integer> queue = new Inter9Queue<>();
		queue.appendTail(1);
		queue.appendTail(2);
		queue.appendTail(3);
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		queue.appendTail(7);
		queue.appendTail(5);
		System.out.println(queue.deleteHead());
		queue.appendTail(8);
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
	}
}
