package chap6.interview66;

import org.junit.Test;

public class Interv66Test {

	/**
	 * No zero in the input array.
	 */
	@Test
	public void test1() {
		
		int[] a = {1,2,3,4,5};
		
		int[] result = Interview66.multipleArray(a);
		
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	/**
	 * One zero in the input array.
	 */
	@Test
	public void test2() {
		
		int[] a = {1,2,0,4,5};
		
		int[] result = Interview66.multipleArray(a);
		
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	/**
	 * Two zeroes in the input array.
	 */
	@Test
	public void test3() {
		
		int[] a = {1,2,0,4,0};
		
		int[] result = Interview66.multipleArray(a);
		
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	/**
	 * There are both positive and negative in the input array.
	 */
	@Test
	public void test4() {
		
		int[] a = {1,-2,3,-4,5};
		
		int[] result = Interview66.multipleArray(a);
		
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	/**
	 * Only two numbers in the input array.
	 */
	@Test
	public void test5() {
		
		int[] a = {1,-2};
		
		int[] result = Interview66.multipleArray(a);
		
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
}
