package chap5.interview45;

import org.junit.Test;

public class Interv45Q1Test {

	@Test
	public void test1() {
		
		int[] a = {3,32,321};
		Interview45Q1.minNumCombineArrayElements(a);
	}
	
	@Test
	public void test2() {
		
		int[] a = {3,5,1,4,2};
		Interview45Q1.minNumCombineArrayElements(a);
	}
	
	@Test
	public void test3() {
		
		int[] a = {3,323,32123};
		Interview45Q1.minNumCombineArrayElements(a);
	}
	
	@Test
	public void test4() {
		
		int[] a = {1,11,111};
		Interview45Q1.minNumCombineArrayElements(a);
	}
	
	@Test
	public void test5() {
		
		int[] a = {321};
		Interview45Q1.minNumCombineArrayElements(a);
	}
	
	@Test
	public void test6() {
		
		int[] a = null;
		Interview45Q1.minNumCombineArrayElements(a);
	}
	
	@Test
	public void test7() {
		
		int[] a = {};
		Interview45Q1.minNumCombineArrayElements(a);
	}
}
