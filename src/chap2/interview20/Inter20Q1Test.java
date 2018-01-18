package chap2.interview20;

import org.junit.Test;

public class Inter20Q1Test {

	@Test
	public void test1() {
		System.out.println(Interview20S1.isNumetric("100"));
	}
	
	@Test
	public void test2() {
		System.out.println(Interview20S1.isNumetric("123.45e+6"));
	}
	
	@Test
	public void test3() {
		System.out.println(Interview20S1.isNumetric("+500"));
	}
	
	@Test
	public void test4() {
		System.out.println(Interview20S1.isNumetric("5e2"));
	}
	
	@Test
	public void test5() {
		System.out.println(Interview20S1.isNumetric("3.1416"));
	}
	
	@Test
	public void test6() {
		System.out.println(Interview20S1.isNumetric("600."));
		System.out.println(Interview20S1.isNumetricRegExpMatch("600."));
	}
	
	@Test
	public void test7() {
		System.out.println(Interview20S1.isNumetric("-.123"));
	}
	
	@Test
	public void test8() {
		System.out.println(Interview20S1.isNumetric("-1E-16"));
	}
	
	@Test
	public void test9() {
		System.out.println(Interview20S1.isNumetric("1.79769313486232E+308"));
	}
	
	@Test
	public void test10() {
		System.out.println(Interview20S1.isNumetric("12e"));
	}
	
	@Test
	public void test11() {
		System.out.println(Interview20S1.isNumetric("1a3.14"));
	}
	
	@Test
	public void test12() {
		System.out.println(Interview20S1.isNumetric("1+23"));
	}
	
	@Test
	public void test13() {
		System.out.println(Interview20S1.isNumetric("1.2.3"));
	}
	
	@Test
	public void test14() {
		System.out.println(Interview20S1.isNumetric("+-5"));
	}
	
	@Test
	public void test15() {
		System.out.println(Interview20S1.isNumetric("12e+5.4"));
	}
	
	@Test
	public void test16() {
		System.out.println(Interview20S1.isNumetric("."));
	}
	
	@Test
	public void test17() {
		System.out.println(Interview20S1.isNumetric(".e1"));
		System.out.println(Interview20S1.isNumetricRegExpMatch(".e1"));
	}
	
	@Test
	public void test18() {
		System.out.println(Interview20S1.isNumetric("e1"));
	}
	
	@Test
	public void test19() {
		System.out.println(Interview20S1.isNumetric("+."));
	}
	
	@Test
	public void test20() {
		System.out.println(Interview20S1.isNumetric(""));
	}
	
	@Test
	public void test21() {
		System.out.println(Interview20S1.isNumetric(null));
	}
	
	@Test
	public void test22() {
		System.out.println(Interview20S1.isNumetric("10.1."));
	}
}
