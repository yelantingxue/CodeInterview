package chap6.interview53;

import org.junit.Test;

public class Interv53Q3Test {

	@Test
	public void test1() {
		
		int[] numbers = {-3, -1, 1, 3, 5};
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {0, 1, 3, 5, 6};
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {-1, 0, 1, 2, 4};
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
	
	@Test
	public void test4() {
		
		int[] numbers = {-1, 0, 1, 2, 5};
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
	
	@Test
	public void test5() {
		
		int[] numbers = {0};
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
	
	@Test
	public void test6() {
		
		int[] numbers = {10};
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
	
	@Test
	public void test7() {
		
		int[] numbers = null;
		System.out.println(Interview53Q3.getNumberSameAsIndex(numbers));
	}
}
