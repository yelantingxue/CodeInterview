package chap6.interview53;

import org.junit.Test;

public class Interv53Q2Test {

	@Test
	public void test1() {
		
		int[] numbers = {1,2,3,4,5};
		System.out.println(Interview53Q2.findMissingNumber(numbers));
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {0,1,2,3,4};
		System.out.println(Interview53Q2.findMissingNumber(numbers));
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {0,1,2,4,5};
		System.out.println(Interview53Q2.findMissingNumber(numbers));
	}
	
	@Test
	public void test4() {
		
		int[] numbers = {1};
		System.out.println(Interview53Q2.findMissingNumber(numbers));
	}
	
	@Test
	public void test5() {
		
		int[] numbers = {0};
		System.out.println(Interview53Q2.findMissingNumber(numbers));
	}
	
	@Test
	public void test6() {
		
		int[] numbers = null;
		System.out.println(Interview53Q2.findMissingNumber(numbers));
	}
}
