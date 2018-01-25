package chap5.interview40;

import org.junit.Test;

public class Interv40S3Test {

	/**
	 * k < length of the array.
	 */
	@Test
	public void test1() {
		
		int[] number = {4,5,1,6,2,7,3,8};
		Interview40Q1S3.getLeastNumbers(number, 5);
	}
	
	/**
	 * k == length of the array.
	 */
	@Test
	public void test2() {
		
		int[] number = {4,5,1,6,2,7,3,8};
		Interview40Q1S3.getLeastNumbers(number, 8);
	}
	
	/**
	 * k > length of the array.
	 */
	@Test
	public void test3() {
		
		int[] number = {4,5,1,6,2,7,3,8};
		Interview40Q1S3.getLeastNumbers(number, 10);
	}
	
	/**
	 * k = 1.
	 */
	@Test
	public void test4() {
		
		int[] number = {4,5,1,6,2,7,3,8};
		Interview40Q1S3.getLeastNumbers(number, 1);
	}
	
	/**
	 * k = 0.
	 */
	@Test
	public void test5() {
		
		int[] number = {4,5,1,6,2,7,3,8};
		Interview40Q1S3.getLeastNumbers(number, 0);
	}
	
	/**
	 * There are repeated numbers in the array.
	 */
	@Test
	public void test6() {
		
		int[] number = {4,5,1,6,2,7,2,8};
		Interview40Q1S3.getLeastNumbers(number, 4);
	}
	
	/**
	 * Input array is null.
	 */
	@Test
	public void test7() {
		
		int[] number = null;
		Interview40Q1S3.getLeastNumbers(number, 8);
	}
	
	/**
	 * There are repeated numbers in the array.
	 */
	@Test
	public void test8() {
		
		int[] number = {1,3,2,4,3,5,2,8,10,6};
		Interview40Q1S3.getLeastNumbers(number, 7);
	}
}
