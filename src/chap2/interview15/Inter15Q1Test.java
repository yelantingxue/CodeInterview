package chap2.interview15;

import org.junit.Test;

public class Inter15Q1Test {

	@Test
	public void test1() {
		System.out.println(Interview15Q1.numberOf1InBinary(0));
		System.out.println(Interview15Q1.numberOf1InBinaryS2(0));
	}
	
	@Test
	public void test2() {
		System.out.println(Interview15Q1.numberOf1InBinary(1));
		System.out.println(Interview15Q1.numberOf1InBinaryS2(1));
	}
	
	@Test
	public void test3() {
		System.out.println(Interview15Q1.numberOf1InBinary(10));
		System.out.println(Interview15Q1.numberOf1InBinaryS2(10));
	}
	
	@Test
	public void test4() {
		System.out.println(Interview15Q1.numberOf1InBinary(0x7FFFFFFF));
		System.out.println(Interview15Q1.numberOf1InBinaryS2(0x7FFFFFFF));
	}
	
	@Test
	public void test5() {
		System.out.println(Interview15Q1.numberOf1InBinary(0xFFFFFFFF));
		System.out.println(Interview15Q1.numberOf1InBinaryS2(0XFFFFFFFF));
	}
	
	@Test
	public void test6() {
		System.out.println(Interview15Q1.numberOf1InBinary(0x80000000));
		System.out.println(Interview15Q1.numberOf1InBinaryS2(0x80000000));
	}
}
