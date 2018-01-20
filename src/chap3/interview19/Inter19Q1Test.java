package chap3.interview19;

import org.junit.Test;

public class Inter19Q1Test {

	@Test
	public void test1() {
		System.out.println(Interview19Q1.isMatch("", ""));
		System.out.println(Interview19Q1.isMatchDP("", ""));
	}
	
	@Test
	public void test2() {
		System.out.println(Interview19Q1.isMatch("", ".*"));
		System.out.println(Interview19Q1.isMatchDP("", ".*"));
	}
	
	@Test
	public void test3() {
		System.out.println(Interview19Q1.isMatch("", "."));
		System.out.println(Interview19Q1.isMatchDP("", "."));
	}
	
	@Test
	public void test4() {
		System.out.println(Interview19Q1.isMatch("", "c*"));
		System.out.println(Interview19Q1.isMatchDP("", "c*"));
	}
	
	@Test
	public void test5() {
		System.out.println(Interview19Q1.isMatch("a", ".*"));
		System.out.println(Interview19Q1.isMatchDP("a", ".*"));
	}
	
	@Test
	public void test6() {
		System.out.println(Interview19Q1.isMatch("a", "a."));
		System.out.println(Interview19Q1.isMatchDP("a", "a."));
	}
	
	@Test
	public void test7() {
		System.out.println(Interview19Q1.isMatch("a", ""));
		System.out.println(Interview19Q1.isMatchDP("a", ""));
	}
	
	@Test
	public void test8() {
		System.out.println(Interview19Q1.isMatch("a", "."));
		System.out.println(Interview19Q1.isMatchDP("a", "."));
	}
	
	@Test
	public void test9() {
		System.out.println(Interview19Q1.isMatch("a", "ab*"));
		System.out.println(Interview19Q1.isMatchDP("a", "ab*"));
	}
	
	@Test
	public void test10() {
		System.out.println(Interview19Q1.isMatch("a", "ab*a"));
		System.out.println(Interview19Q1.isMatchDP("a", "ab*a"));
	}
	
	@Test
	public void test11() {
		System.out.println(Interview19Q1.isMatch("aa", "aa"));
		System.out.println(Interview19Q1.isMatchDP("aa", "aa"));
	}
	
	@Test
	public void test12() {
		System.out.println(Interview19Q1.isMatch("aa", "a*"));
		System.out.println(Interview19Q1.isMatchDP("aa", "a*"));
	}
	
	@Test
	public void test13() {
		System.out.println(Interview19Q1.isMatch("aa", ".*"));
		System.out.println(Interview19Q1.isMatchDP("aa", ".*"));
	}
	
	@Test
	public void test14() {
		System.out.println(Interview19Q1.isMatch("aa", "."));
		System.out.println(Interview19Q1.isMatchDP("aa", "."));
	}
	
	@Test
	public void test15() {
		System.out.println(Interview19Q1.isMatch("ab", ".*"));
		System.out.println(Interview19Q1.isMatchDP("ab", ".*"));
	}
	
	@Test
	public void test16() {
		System.out.println(Interview19Q1.isMatch("ab", ".*"));
		System.out.println(Interview19Q1.isMatchDP("ab", ".*"));
	}
	
	@Test
	public void test17() {
		System.out.println(Interview19Q1.isMatch("aaa", "aa*"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "aa*"));
	}
	
	@Test
	public void test18() {
		System.out.println(Interview19Q1.isMatch("aaa", "aa.a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "aa.a"));
	}
	
	@Test
	public void test19() {
		System.out.println(Interview19Q1.isMatch("aaa", "a.a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "a.a"));
	}
	
	@Test
	public void test20() {
		System.out.println(Interview19Q1.isMatch("aaa", ".a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", ".a"));
	}
	
	@Test
	public void test21() {
		System.out.println(Interview19Q1.isMatch("aaa", "a*a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "a*a"));
	}
	
	@Test
	public void test22() {
		System.out.println(Interview19Q1.isMatch("aaa", "ab*a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "ab*a"));
	}
	
	@Test
	public void test23() {
		System.out.println(Interview19Q1.isMatch("aaa", "ab*ac*a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "ab*ac*a"));
	}
	
	@Test
	public void test24() {
		System.out.println(Interview19Q1.isMatch("aaa", "ab*a*c*a"));
		System.out.println(Interview19Q1.isMatchDP("aaa", "ab*a*c*a"));
	}
	
	@Test
	public void test25() {
		System.out.println(Interview19Q1.isMatch("aaa", ".*"));
		System.out.println(Interview19Q1.isMatchDP("aaa", ".*"));
	}
	
	@Test
	public void test26() {
		System.out.println(Interview19Q1.isMatch("aab", "c*a*b"));
		System.out.println(Interview19Q1.isMatchDP("aab", "c*a*b"));
	}
	
	@Test
	public void test27() {
		System.out.println(Interview19Q1.isMatch("aaca", "ab*a*c*a"));
		System.out.println(Interview19Q1.isMatchDP("aaca", "ab*a*c*a"));
	}
	
	@Test
	public void test28() {
		System.out.println(Interview19Q1.isMatch("aaba", "ab*a*c*a"));
		System.out.println(Interview19Q1.isMatchDP("aaba", "ab*a*c*a"));
	}
	
	@Test
	public void test29() {
		System.out.println(Interview19Q1.isMatch("bbbba", ".*a*a"));
		System.out.println(Interview19Q1.isMatchDP("bbbba", ".*a*a"));
	}
	
	@Test
	public void test30() {
		System.out.println(Interview19Q1.isMatch("bcbbabab", ".*a*a"));
		System.out.println(Interview19Q1.isMatchDP("bcbbabab", ".*a*a"));
	}
	
	@Test
	public void test31() {
		System.out.println(Interview19Q1.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
		System.out.println(Interview19Q1.isMatchDP("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*b"));
	}
}
