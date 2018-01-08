package chap2.interview3;

import java.util.Random;

import org.junit.Test;

public class Question1Test {

	/**
	 * Test and compare the run time of two methods.
	 * @param a
	 */
	@Test
	public void testTime() {
		
		Random random = new Random();
		
		int[] a = new int[100000000];
		a = random.ints(100000000, 0, 100000000).toArray();

		int[] b = new int[100000000];

		System.arraycopy(a, 0, b, 0, 100000000);

		double repeated1Start = System.currentTimeMillis();
		Question1.repeatedNumber1(a);
		double repeated1End = System.currentTimeMillis();
		double repeated1Time = repeated1End - repeated1Start;

		// int[] b = {2,3,1,0,4,5,8};
		double repeated2Start = System.currentTimeMillis();
		Question1.repeatedNumber2(b);
		double repeated2End = System.currentTimeMillis();
		double repeated2Time = repeated2End - repeated2Start;

		System.out.println(repeated1Time);
		System.out.println(repeated2Time);
	}
	
	/**
	 * Duplicated number is the smallest number in an array.
	 */
	@Test
	public void test1() {
		
		int[] a = {2,1,3,1,4};
		System.out.println(Question1.repeatedNumber1(a));
	}
	
	/**
	 * Duplicated number is the largest number in an array.
	 */
	@Test
	public void test2() {
		
		int[] a = {2,4,3,1,4};
		System.out.println(Question1.repeatedNumber1(a));
	}
	
	/**
	 * There are more than one duplicated number in an array.
	 */
	@Test
	public void test3() {
		
		int[] a = {2,1,2,1,4};
		System.out.println(Question1.repeatedNumber1(a));
	}
	
	/**
	 * There is no duplicated number in an array.
	 */
	@Test
	public void test4() {
		
		int[] a = {2,1,3,0,4};
		System.out.println(Question1.repeatedNumber1(a));
	}
	
	/**
	 * There is no duplicated number in an array.
	 */
	@Test
	public void test5() {
		
		int[] a = {2,1,3,5,4};
		System.out.println(Question1.repeatedNumber1(a));
	}
	
	/**
	 * Invalid input.
	 */
	@Test
	public void test6() {
		
		int[] a = {};
		System.out.println(Question1.repeatedNumber1(a));
	}
}
