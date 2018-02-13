package chap6.interview61;

import org.junit.Test;

public class Interv61Test {

	@Test
	public void test1() {
		
		int[] numbers = {1, 3, 2, 5, 4};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {1, 3, 2, 6, 4};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {0, 3, 2, 6, 4};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test4() {
		
		int[] numbers = {0, 3, 1, 6, 4};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test5() {
		
		int[] numbers = {1, 3, 0, 5, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test6() {
		
		int[] numbers = {1, 3, 0, 7, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test7() {
		
		int[] numbers = {1, 0, 0, 5, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test8() {
		
		int[] numbers = {1, 0, 0, 7, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test9() {
		
		int[] numbers = {3, 0, 0, 0, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test10() {
		
		int[] numbers = {0, 0, 0, 0, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test11() {
		
		int[] numbers = {1, 0, 0, 1, 0};
		System.out.println(Interview61.isConsecutive(numbers));
	}
	
	@Test
	public void test12() {
		
		int[] numbers = null;
		System.out.println(Interview61.isConsecutive(numbers));
	}
}
