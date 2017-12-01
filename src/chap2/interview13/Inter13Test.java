package chap2.interview13;

import org.junit.Test;

public class Inter13Test {
	
	@Test
	public void testsumOfDigit() {
		System.out.println(Interview13S1.sumOfDigit(1238498923));
	}

	@Test
	public void test1() {
		//21
		System.out.println(Interview13S1.enteringCount(10, 10, 5));
	}
	
	@Test
	public void test2() {
		//359
		System.out.println(Interview13S1.enteringCount(20, 20, 15));
	}
	
	@Test
	public void test3() {
		//29
		System.out.println(Interview13S1.enteringCount(1, 100, 10));
	}
	
	@Test
	public void test4() {
		//10
		System.out.println(Interview13S1.enteringCount(1, 10, 10));
	}
	
	@Test
	public void test5() {
		//79
		System.out.println(Interview13S1.enteringCount(100, 1, 15));
	}
	
	@Test
	public void test6() {
		//10
		System.out.println(Interview13S1.enteringCount(10, 1, 15));
	}
	
	@Test
	public void test7() {
		//1
		System.out.println(Interview13S1.enteringCount(1, 1, 15));
	}
	
	@Test
	public void test8() {
		//1
		System.out.println(Interview13S1.enteringCount(1, 1, 0));
	}
	
	@Test
	public void test9() {
		//0
		System.out.println(Interview13S1.enteringCount(10, 10, -10));
	}
}
