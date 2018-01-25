package chap5.interview41;

import org.junit.Test;

public class Interv41Q1Test {

	@Test
	public void test1() {
		
		MedianFinder mf = new MedianFinder();
		mf.addNum(5);
		System.out.println(mf.findMedian());
		
		mf.addNum(2);
		System.out.println(mf.findMedian());
		
		mf.addNum(3);
		System.out.println(mf.findMedian());
		
		mf.addNum(4);
		System.out.println(mf.findMedian());
		
		mf.addNum(1);
		System.out.println(mf.findMedian());
		
		mf.addNum(6);
		System.out.println(mf.findMedian());
		
		mf.addNum(7);
		System.out.println(mf.findMedian());
		
		mf.addNum(0);
		System.out.println(mf.findMedian());
		
		mf.addNum(8);
		System.out.println(mf.findMedian());
	}
}
