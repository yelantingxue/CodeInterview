package chap2.interview5;

import org.junit.Test;

public class Interview5Q1Test {

	/**
	 * Space is at the middle of the string.
	 */
	@Test
	public void test1() {
		String str = "hello world";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * Space is at the start of the string.
	 */
	@Test
	public void test2() {
		String str = " helloworld";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * Space is at the end of the string.
	 */
	@Test
	public void test3() {
		String str = "helloworld ";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * There are two consecutive spaces in the string.
	 */
	@Test
	public void test4() {
		String str = "hello  world";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * The input string is empty.
	 */
	@Test
	public void test5() {
		String str = "";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * The input string is just a space.
	 */
	@Test
	public void test6() {
		String str = " ";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * The input string doesn't consist of spaces.
	 */
	@Test
	public void test7() {
		String str = "helloworld";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
	
	/**
	 * The input string only consists of spaces.
	 */
	@Test
	public void test8() {
		String str = "   ";
		char[] charArray = new char[20];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Interview5Q1.replaceBlank(charArray, 20);
		System.out.println(Interview5Q1.replaceBlank(str));
		System.out.println(charArray);
	}
}
