package chap6.interview58;

import org.junit.Test;

public class Interv58Q1S2Test {

	@Test
	public void test1() {
		
		String sentence = "I am a student.";
		char[] chars = sentence.toCharArray();
		Interview58Q1S2.reverseString(chars);
		
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
	
	@Test
	public void test2() {
		
		String sentence = "Wonderful.";
		char[] chars = sentence.toCharArray();
		Interview58Q1S2.reverseString(chars);
		
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
	
	@Test
	public void test3() {
		
		String sentence = "Those setbacks, made us stronger, and set us on the path to a bright future.";
		char[] chars = sentence.toCharArray();
		Interview58Q1S2.reverseString(chars);
		
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
	
	@Test
	public void test4() {
		
		char[] input = null;
		Interview58Q1S2.reverseString(input);
		
		if(input == null) {
			System.out.println("Invalid input");
		}
	}
	
	
	@Test
	public void test5() {
		
		String sentence = "";
		char[] chars = sentence.toCharArray();
		Interview58Q1S2.reverseString(chars);
		
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
	
	@Test
	public void test6() {
		
		String sentence = "The turbulent business environment alse has senior managers "
				+ "cause of letting vague pronouncements cloud their reputations.";
		char[] chars = sentence.toCharArray();
		Interview58Q1S2.reverseString(chars);
		
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
}
