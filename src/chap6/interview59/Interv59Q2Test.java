package chap6.interview59;

import org.junit.Test;

public class Interv59Q2Test {

	@Test
	public void test1() {

		Interview59Q2 queue = new Interview59Q2();

		// [2]
		queue.add(2);
		System.out.println(queue.maxNumber());

		// [2,3]
		queue.add(3);
		System.out.println(queue.maxNumber());

		// [2,3,4]
		queue.add(4);
		System.out.println(queue.maxNumber());

		// [2,3,4,2]
		queue.add(2);
		System.out.println(queue.maxNumber());

		// [3,4,2]
		queue.removeFirst();
		System.out.println(queue.maxNumber());
		
		//[4,2]
		queue.removeFirst();
		System.out.println(queue.maxNumber());
		
		//[2]
		queue.removeFirst();
		System.out.println(queue.maxNumber());
		
		//[2,6]
		queue.add(6);
		System.out.println(queue.maxNumber());
		
		//[2,6,2]
		queue.add(2);
		System.out.println(queue.maxNumber());
		
		//[2,6,2,5]
		queue.add(5);
		System.out.println(queue.maxNumber());
		
		//[6,2,5]
		queue.removeFirst();
		System.out.println(queue.maxNumber());
		
		//[2, 5]
		queue.removeFirst();
		System.out.println(queue.maxNumber());
		
		//[5]
		queue.removeFirst();
		System.out.println(queue.maxNumber());
		
		//[5, 1]
		queue.add(1);
		System.out.println(queue.maxNumber());
	}
}
