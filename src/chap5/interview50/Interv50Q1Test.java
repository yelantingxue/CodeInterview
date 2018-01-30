package chap5.interview50;

import org.junit.Test;

public class Interv50Q1Test {

	@Test
	public void test1() {
		
		String str = "abaccdeff";
		System.out.println(Interview50Q1.getFirstCharAppearOnce(str));
	}
	
	@Test
	public void test2() {
		
		String str = "google";
		System.out.println(Interview50Q1.getFirstCharAppearOnce(str));
	}
	
	@Test
	public void test3() {
		
		String str = "aabccdbd";
		System.out.println(Interview50Q1.getFirstCharAppearOnce(str));
	}
	
	@Test
	public void test4() {
		
		String str = "abcdefg";
		System.out.println(Interview50Q1.getFirstCharAppearOnce(str));
	}
	
	@Test
	public void test5() {
		
		String str = null;
		System.out.println(Interview50Q1.getFirstCharAppearOnce(str));
	}
}
