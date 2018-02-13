package chap6.interview63;

import org.junit.Test;

public class Interv63Test {

	@Test
	public void test1() {
		int[] price = {9, 11, 8, 5, 7, 12, 16, 14};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test2() {
		int[] price = {4, 1, 3, 2, 5};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test3() {
		int[] price = {1, 2, 4, 7, 11, 16};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test4() {
		int[] price = {16, 11, 7, 4, 2, 1};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test5() {
		int[] price = {16, 16, 16, 16, 16};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test6() {
		int[] price = {9, 11, 5, 7, 16, 1, 4, 2};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test7() {
		int[] price = {2, 4};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test8() {
		int[] price = {4,2};
		System.out.println(Interview63.maxProfit(price));
	}
	
	@Test
	public void test9() {
		int[] price = null;
		System.out.println(Interview63.maxProfit(price));
	}
}
