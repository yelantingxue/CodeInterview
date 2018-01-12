package chap2.interview16;

import org.junit.Test;

public class Inter16Q1Test {

	@Test
	public void test1() {
		System.out.println(Interview16Q1.power1(2, 7));
		System.out.println(Interview16Q1.power2(2, 7));
	}
	
	@Test
	public void test2() {
		System.out.println(Interview16Q1.power1(-2, 7));
		System.out.println(Interview16Q1.power2(-2, 7));
	}
	
	@Test
	public void test3() {
		System.out.println(Interview16Q1.power1(2, -3));
		System.out.println(Interview16Q1.power2(2, -3));
	}
	
	@Test
	public void test4() {
		System.out.println(Interview16Q1.power1(2, 0));
		System.out.println(Interview16Q1.power2(2, 0));
	}
	
	@Test
	public void test5() {
		System.out.println(Interview16Q1.power1(0, 0));
		System.out.println(Interview16Q1.power2(0, 0));
	}
	
	@Test
	public void test6() {
		System.out.println(Interview16Q1.power1(0, 4));
		System.out.println(Interview16Q1.power2(0, 4));
	}
	
	@Test
	public void test7() {
		System.out.println(Interview16Q1.power1(0, -4));
		System.out.println(Interview16Q1.power2(0, -4));
	}
}
