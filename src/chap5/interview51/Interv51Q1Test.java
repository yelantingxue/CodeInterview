package chap5.interview51;

import org.junit.Test;

public class Interv51Q1Test {

	@Test
	public void test1() {
		
		int[] nums = {7,5,6,4};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	@Test
	public void test2() {
		
		int[] nums = {1,2,3,4,7,6,5};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	/**
	 * Numbers in the input array are decreasing.
	 */
	@Test
	public void test3() {
		
		int[] nums = {6,5,4,3,2,1};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	/**
	 * Numbers in the input array are increasing.
	 */
	@Test
	public void test4() {
		
		int[] nums = {1,2,3,4,5,6};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	/**
	 * There is only one number in the array.
	 */
	@Test
	public void test5() {
		
		int[] nums = {1};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	/**
	 * There are only two numbers, increasing.
	 */
	@Test
	public void test6() {
		
		int[] nums = {1,2};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	/**
	 * There are only two numbers, decreasing.
	 */
	@Test
	public void test7() {
		
		int[] nums = {2,1};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	/**
	 * Some numbers are equal in the array.
	 */
	@Test
	public void test8() {
		
		int[] nums = {1,2,1,2,1};
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
	
	@Test
	public void test9() {
		
		int[] nums = null;
		System.out.println(Interview51Q1.numOfInversePairs(nums));
	}
}
