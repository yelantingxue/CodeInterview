package chap6.interview58;

import org.junit.Test;

public class Interv58Q1S1Test {

	@Test
	public void test1() {
		
		String sentence = "I am a student.";
		Interview58Q1S1.reverseSentence(sentence);
	}
	
	@Test
	public void test2() {
		
		String sentence = "Wonderful.";
		Interview58Q1S1.reverseSentence(sentence);
	}
	
	@Test
	public void test3() {
		
		String sentence = "";
		Interview58Q1S1.reverseSentence(sentence);
	}
	
	@Test
	public void test4() {
		
		String sentence = null;
		Interview58Q1S1.reverseSentence(sentence);
	}
}
