package chap5.interview40;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Interview40Q1S3 {

	/**
	 * Solution based max heap, using java.util.PriorityQueue.
	 * @param numbers
	 * @param k
	 */
	public static void getLeastNumbers(int[] numbers, int k) {
		
		if(numbers == null || k < 1 
				|| numbers.length == 0 || k > numbers.length) {
			return;
		}
		
		Queue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < numbers.length; i++) {
			
			maxPQ.add(numbers[i]);
			
			if(maxPQ.size() > k) {
				
				maxPQ.poll();
			}
		}
		
		for(Integer a : maxPQ) {
			System.out.println(a);
		}
	}
}
