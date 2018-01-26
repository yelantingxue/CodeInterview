package chap5.interview42;

import org.junit.Test;

public class Interv42Q1S1Test {

	@Test
	public void test1() {
		
		int[] num = {1,-2,3,10,-4,7,2,-5};
		System.out.println(Interview42Q1S1.findGreatestSumOfSubArray(num));
	}
	
	/**
	 * All numbers are negative.
	 */
	@Test
	public void test2() {
		
		int[] num = {-2, -8, -1, -5, -9};
		System.out.println(Interview42Q1S1.findGreatestSumOfSubArray(num));
	}
	
	/**
	 * All numbers are positive.
	 */
	@Test
	public void test3() {
		
		int[] num = {2,8,1,5,9};
		System.out.println(Interview42Q1S1.findGreatestSumOfSubArray(num));
	}
	
	@Test
	public void test4() {
		
		int[] num = null;
		System.out.println(Interview42Q1S1.findGreatestSumOfSubArray(num));
	}
	
	@Test
	public void test5() {
		
		int[] num = {};
		System.out.println(Interview42Q1S1.findGreatestSumOfSubArray(num));
	}
}
