package chap2.interview3;

import org.junit.Test;

public class Question2Test {

	/**
	 * More than one duplicated numbers.
	 */
	@Test
	public void test1() {
		
		int[] a = {2, 3, 5, 4, 3, 2, 6, 7};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * One duplicated number.
	 */
	@Test
	public void test2() {
		
		int[] a = {3, 2, 1, 4, 4, 5, 6, 7};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * Duplicated number is the smallest number in an array.
	 */
	@Test
	public void test3() {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 1, 8};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * Duplicated number is the largest number in an array.
	 */
	@Test
	public void test4() {
		int[] a = {1, 7, 3, 4, 5, 6, 8, 2, 8};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * There are only two numbers in an array.
	 */
	@Test
	public void test5() {
		int[] a = {1, 1};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * Duplicated number is in the middle of the input array.
	 */
	@Test
	public void test6() {
		int[] a = {3, 2, 1, 3, 4, 5, 6, 7};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * More than one duplicated number.
	 */
	@Test
	public void test7() {
		int[] a = {1, 2, 2, 6, 4, 5, 6};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * One number duplicate three times.
	 */
	@Test
	public void test8() {
		int[] a = {1, 2, 2, 6, 4, 5, 2};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * No duplicated number.
	 */
	@Test
	public void test9() {
		int[] a = {1, 2, 6, 4, 5, 3};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	/**
	 * Invalid input.
	 */
	@Test
	public void test10() {
		int[] a = {};
		System.out.println(Question2.repeatedNumber(a));
	}
}
