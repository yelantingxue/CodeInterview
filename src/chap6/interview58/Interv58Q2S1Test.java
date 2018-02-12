package chap6.interview58;

import org.junit.Test;

public class Interv58Q2S1Test {

	@Test
	public void test1() {
		
		String str = "abcdefg";
		String result = Interview58Q2S1.leftRotateString(str, 2);
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			System.out.println(result);
		}
	}
	
	@Test
	public void test2() {
		
		String str = "abcdefg";
		String result = Interview58Q2S1.leftRotateString(str, 1);
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			System.out.println(result);
		}
	}
	
	@Test
	public void test3() {
		
		String str = "abcdefg";
		String result = Interview58Q2S1.leftRotateString(str, 6);
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			System.out.println(result);
		}
	}
	
	@Test
	public void test4() {
		
		String str = null;
		String result = Interview58Q2S1.leftRotateString(str, 2);
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			System.out.println(result);
		}
	}
	
	@Test
	public void test5() {
		
		String str = "abcdefg";
		String result = Interview58Q2S1.leftRotateString(str, 0);
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			System.out.println(result);
		}
	}
	
	@Test
	public void test6() {
		
		String str = "abcdefg";
		String result = Interview58Q2S1.leftRotateString(str, 7);
		if(result == null) {
			System.out.println("Invalid Input.");
		}else {
			System.out.println(result);
		}
	}
}
