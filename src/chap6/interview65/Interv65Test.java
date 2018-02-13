package chap6.interview65;

import org.junit.Test;

public class Interv65Test {

	@Test
	public void test1() {
		
		System.out.println(Interview65.add(1, 2));
	}
	
	@Test
	public void test2() {
		
		System.out.println(Interview65.add(111, 899));
	}
	
	@Test
	public void test3() {
		
		System.out.println(Interview65.add(-1, 2));
	}
	
	@Test
	public void test4() {
		
		System.out.println(Interview65.add(1, -2));
	}
	
	@Test
	public void test5() {
		
		System.out.println(Interview65.add(3, 0));
	}
	
	@Test
	public void test6() {
		
		System.out.println(Interview65.add(0, -4));
	}
	
	@Test
	public void test7() {
		
		System.out.println(Interview65.add(-2, -8));
	}
}
