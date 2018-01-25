package chap5.interview41;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {

	Queue<Long> large = new PriorityQueue<>();
	Queue<Long> small = new PriorityQueue<>();
	
	public void addNum(int num) {
		
		//Add num to large
		large.add((long)num);
		
		//Poll the smallest number in large, 
		//and add its opposite number to small.
		small.add(-large.poll());
		
		//If the size of large is less than small, 
		//poll the smallest number in small(negative number),
		//and add its opposite number(positive number) to large.
		if(large.size() < small.size()) {
			large.add(-small.poll());
		}
	}
	
	public double findMedian() {
		
		return large.size() > small.size() ? large.peek() : (large.peek() - small.peek())/2;
	}
}
