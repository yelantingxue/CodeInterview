package chap6.interview53;

import org.junit.Test;

public class Interv53Q1Test {

	@Test
	public void test1() {
		
		int[] numbers = {1,2,3,3,3,3,4,5};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 3));
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {3,3,3,3,4,5};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 3));
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {1,2,3,3,3,3};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 3));
	}
	
	@Test
	public void test4() {
		
		int[] numbers = {1,3,3,3,3,4,5};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 2));
	}
	
	@Test
	public void test5() {
		
		int[] numbers = {1,2,3,3,3,3,4,5};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 0));
	}
	
	@Test
	public void test6() {
		
		int[] numbers = {1,2,3,3,3,3,4,5};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 6));
	}
	
	@Test
	public void test7() {
		
		int[] numbers = {3,3,3,3};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 3));
	}
	
	@Test
	public void test8() {
		
		int[] numbers = {3,3,3,3};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 4));
	}
	
	@Test
	public void test9() {
		
		int[] numbers = {3};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 3));
	}
	
	@Test
	public void test10() {
		
		int[] numbers = {3};
		System.out.println(Interview53Q1.getNumberOfK(numbers, 4));
	}
}
