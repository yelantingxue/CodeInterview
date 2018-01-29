package chap5.interview48;

import org.junit.Test;

public class Interv48Q1Test {

	@Test
	public void test1() {
		
		String str = "arabcacfr";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test2() {
		
		String str = "abcacfrar";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test3() {
		
		String str = "acfrarabc";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test4() {
		
		String str = "aaaa";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test5() {
		
		String str = "abcdefg";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test6() {
		
		String str = "aaabbbccc";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test7() {
		
		String str = "abcdcba";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test8() {
		
		String str = "abcdaef";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test9() {
		
		String str = "a";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
	
	@Test
	public void test10() {
		
		String str = "";
		System.out.println(Interview48Q1.lengthOfLongestSubstring(str));
	}
}
