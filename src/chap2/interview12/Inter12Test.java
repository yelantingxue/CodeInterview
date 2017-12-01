package chap2.interview12;

import org.junit.Test;

public class Inter12Test {
	
	@Test
	public void test1() {
		
		char[][] chrMatrix = { { 'a', 'b', 't', 'g' }, { 'c', 'f', 'c', 's' }, { 'j', 'd', 'e', 'h' } };
		
		String str = "bfce";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	/**
	 * Important!
	 * Recursion will change the value of array.
	 */
	@Test
	public void test2() {
		
		char[][] chrMatrix = { { 'a', 'b', 't', 'g' }, { 'c', 'f', 'c', 's' }, { 'j', 'd', 'e', 'h' } };
		
		String str = "bfcedjc";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test3() {
		
		char[][] chrMatrix = { { 'a', 'b', 'c', 'e' }, { 's', 'f', 'c', 's' }, { 'a', 'd', 'e', 'e' } };
		
		String str = "see";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test4() {
		
		char[][] chrMatrix = { { 'a', 'b', 't', 'g' }, { 'c', 'f', 'c', 's' }, { 'j', 'd', 'e', 'h' } };
		
		String str = "abfb";
		
		//false
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test5() {
		
		char[][] chrMatrix = { { 'a', 'b', 'c', 'e', 'h', 'j', 'i', 'g' }, 
							   { 's', 'f', 'c', 's', 'l', 'o', 'p', 'q' },
							   { 'a', 'd', 'e', 'e', 'm', 'n', 'o', 'e' }, 
							   { 'a', 'd', 'i', 'd', 'e', 'j', 'f', 'm' },
							   { 'v', 'c', 'e', 'i', 'f', 'g', 'g', 's' } };
		
		String str = "slhecceidejfggfie";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test6() {
		
		char[][] chrMatrix = { { 'a', 'b', 'c', 'e', 'h', 'j', 'i', 'g' }, 
							   { 's', 'f', 'c', 's', 'l', 'o', 'p', 'q' },
							   { 'a', 'd', 'e', 'e', 'm', 'n', 'o', 'e' }, 
							   { 'a', 'd', 'i', 'd', 'e', 'j', 'f', 'm' },
							   { 'v', 'c', 'e', 'i', 'f', 'g', 'g', 's' } };
		
		String str = "sggfiecvaasabcehjigqem";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test7() {
		
		char[][] chrMatrix = { { 'a', 'b', 'c', 'e', 'h', 'j', 'i', 'g' }, 
							   { 's', 'f', 'c', 's', 'l', 'o', 'p', 'q' },
							   { 'a', 'd', 'e', 'e', 'm', 'n', 'o', 'e' }, 
							   { 'a', 'd', 'i', 'd', 'e', 'j', 'f', 'm' },
							   { 'v', 'c', 'e', 'i', 'f', 'g', 'g', 's' } };
		
		String str = "sggfiecvaasabceejigoem";
		
		//false
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test8() {
		
		char[][] chrMatrix = { { 'a', 'b', 'c', 'e', 'h', 'j', 'i', 'g' }, 
							   { 's', 'f', 'c', 's', 'l', 'o', 'p', 'q' },
							   { 'a', 'd', 'e', 'e', 'm', 'n', 'o', 'e' }, 
							   { 'a', 'd', 'i', 'd', 'e', 'j', 'f', 'm' },
							   { 'v', 'c', 'e', 'i', 'f', 'g', 'g', 's' } };
		
		String str = "sggfiecvaasabcehjigqems";
		
		//false
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test9() {
		
		char[][] chrMatrix = { { 'a', 'a', 'a', 'a' }, { 'a', 'a', 'a', 'a' }, { 'a', 'a', 'a', 'a' } };
		
		String str = "aaaaaaaaaaaa";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test10() {
		
		char[][] chrMatrix = { { 'a', 'a', 'a', 'a' }, { 'a', 'a', 'a', 'a' }, { 'a', 'a', 'a', 'a' } };
		
		String str = "aaaaaaaaaaaaa";
		
		//false
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test11() {
		
		char[][] chrMatrix = { { 'a' } };
		
		String str = "a";
		
		//true
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
	
	@Test
	public void test12() {
		
		char[][] chrMatrix = { { 'a' } };
		
		String str = "b";
		
		//false
		System.out.println(Interview12Q1.findPath(chrMatrix, str));
		System.out.println(Interview12Q1S2.findPath(chrMatrix, str));
	}
}
