package chap2.interview21;

import org.junit.Test;

public class Inter21Q1Test {

	@Test
	public void test1() {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		Interview21Q1.reorderOddEven(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void test2() {
		int[] a = {2, 4, 6, 1, 3, 5, 7};
		Interview21Q1.reorderOddEven(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void test3() {
		int[] a = {1, 3, 5, 7, 2, 4, 6};
		Interview21Q1.reorderOddEven(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void test4() {
		int[] a = {1};
		Interview21Q1.reorderOddEven(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void test5() {
		int[] a = {2};
		Interview21Q1.reorderOddEven(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
