package chap6.interview58;

import org.junit.Test;

public class Interv58Q2S2Test {

	@Test
	public void test1() {
		
		String str = "abcdefg";
		char[] arr = str.toCharArray();
		Interview58Q2S2.leftRotateString(arr, 2);
		
		if(arr == null) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}
	
	@Test
	public void test2() {
		
		String str = "abcdefg";
		char[] arr = str.toCharArray();
		Interview58Q2S2.leftRotateString(arr, 1);
		
		if(arr == null) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}
	
	@Test
	public void test3() {
		
		String str = "abcdefg";
		char[] arr = str.toCharArray();
		Interview58Q2S2.leftRotateString(arr, 6);
		
		if(arr == null) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}
	
	@Test
	public void test4() {
		
		char[] arr = null;
		Interview58Q2S2.leftRotateString(arr, 2);
		
		if(arr == null) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}
	
	@Test
	public void test5() {
		
		String str = "abcdefg";
		char[] arr = str.toCharArray();
		Interview58Q2S2.leftRotateString(arr, 0);
		
		if(arr == null) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}
	
	@Test
	public void test6() {
		
		String str = "abcdefg";
		char[] arr = str.toCharArray();
		Interview58Q2S2.leftRotateString(arr, 7);
		
		if(arr == null) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}
}
