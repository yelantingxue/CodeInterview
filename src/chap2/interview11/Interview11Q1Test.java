package chap2.interview11;

import org.junit.Test;

public class Interview11Q1Test {

	/**
	 * Conventional input, a rotation of a monotonically increasing array.
	 */
	@Test
	public void test1() {
		
		int[] a = { 3, 4, 5, 1, 2 };
		System.out.println(Interview11Q1.minRotatedArray(a));
	}
	
	/**
	 * There are repeated numbers in the array, and the repeated number is 
	 * exactly the smallest number.
	 */
	@Test
	public void test2() {
		
		int[] a = { 3, 4, 5, 1, 1, 2 };
		System.out.println(Interview11Q1.minRotatedArray(a));
	}
	
	/**
	 * There are repeated numbers in the array, and the repeated number is 
	 * neither the smallest nor the largest.
	 */
	@Test
	public void test3() {
		
		int[] a = { 3, 4, 5, 1, 2, 2 };
		System.out.println(Interview11Q1.minRotatedArray(a));
	}
	
	/**
	 * There are repeated numbers in the array, and the repeated number is 
	 * exactly the largest number.
	 */
	@Test
	public void test4() {
		
		int[] a = { 1, 0, 1, 1, 1 };
		System.out.println(Interview11Q1.minRotatedArray(a));
	}
	
	/**
	 * A monotonically increasing array, no rotation.
	 */
	@Test
	public void test5() {
		
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Interview11Q1.minRotatedArray(a));
	}
	
	/**
	 * There is only one number in the input array.
	 */
	@Test
	public void test6() {
		
		int[] a = { 2 };
		System.out.println(Interview11Q1.minRotatedArray(a));
	}
}
