package chap4.interview33;

import org.junit.Test;

public class Interv33Q1Test {

	@Test
	public void test1() {
		
		int[] a = {5,7,6,9,11,10,8};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test2() {
		
		int[] a = {7,4,6,5};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test3() {
		
		int[] a = {4, 8, 6, 12, 16, 14, 10};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test4() {
		
		int[] a = {4,6,7,5};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test5() {
		
		int[] a = {1,2,3,4,5};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test6() {
		
		int[] a = {5,4,3,2,1};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test7() {
		
		int[] a = {5};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test8() {
		
		int[] a = {4, 6, 12, 8, 16, 14, 10};
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
	
	@Test
	public void test9() {
		
		int[] a = null;
		System.out.println(Interview33Q1.verifySequenceOfBST(a));
	}
}
