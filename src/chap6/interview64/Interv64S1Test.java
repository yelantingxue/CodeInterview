package chap6.interview64;

import org.junit.Test;

public class Interv64S1Test {

	@Test
	public void test1() {
		
		int n = 10;
		
		System.out.println(Interview64S1.accumulate(n));
	}
	
	@Test
	public void test2() {
		
		int n = 1;
		
		System.out.println(Interview64S1.accumulate(n));
	}
	
	@Test
	public void test3() {
		
		int n = 5;
		
		System.out.println(Interview64S1.accumulate(n));
	}
	
	@Test
	public void test4() {
		
		int n = 0;
		
		System.out.println(Interview64S1.accumulate(n));
	}
}
