package chap2.interview9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Use two queues to simulate a stack.
 * 
 * @param <T>
 */
public class QueueToStack<T> {
	
	public T data;
	
	public Queue<T> queue1 = new LinkedList<>();
	public Queue<T> queue2 = new LinkedList<>();
	
	/**
	 * Simulate "push" operation in stack.
	 * @param t
	 */
	public void push(T t) {
		
		if(queue1.size() == 0 && queue2.size() == 0) {
			queue1.add(t);
		}else {
			
			if(queue1.size() == 0) {
				queue2.add(t);
			}else {
				queue1.add(t);
			}
		}
	}
	
	/**
	 * Simulate "pop" operation in stack.
	 * @return
	 */
	public T pop() {
		
		if(queue1.size() == 0 && queue2.size() == 0) {
			return null;
		}
		
		if(queue1.size() == 0 || queue2.size() == 0) {
			
			if(queue1.size() == 0) {
				while(queue2.size() > 1) {
					queue1.add(queue2.poll());
				}
				return queue2.poll();
			
			}else {
				while(queue1.size() > 1) {
					queue2.add(queue1.poll());
				}
				return queue1.poll();
			}
		}else {
			throw new RuntimeException();
		}
	}
}
