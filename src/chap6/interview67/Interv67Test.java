package chap6.interview67;

import org.junit.Test;

public class Interv67Test {

	@Test
	public void test1() throws Exception {
		
		String str = "123";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test2() throws Exception {
		
		String str = "+123";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test3() throws Exception {
		
		String str = "-123";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test4() throws Exception {
		
		String str = "1a33";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test5() throws Exception {
		
		String str = "+0";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test6() throws Exception {
		
		String str = "-0";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test7() throws Exception {
		
		String str = "";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test8() throws Exception {
		
		String str = null;
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test9() throws Exception {
		
		String str = "2147483647";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test10() throws Exception {
		
		String str = "-2147483647";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test11() throws Exception {
		
		String str = "2147483648";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test12() throws Exception {
		
		String str = "-2147483648";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test13() throws Exception {
		
		String str = "+2147483649";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test14() throws Exception {
		
		String str = "-2147483649";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test15() throws Exception {
		
		String str = "-";
		System.out.println(Interview67.strToInt(str));
	}
	
	@Test
	public void test16() throws Exception {
		
		String str = "+";
		System.out.println(Interview67.strToInt(str));
	}
}
