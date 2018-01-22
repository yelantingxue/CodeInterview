package chap4.interview38;

import org.junit.Test;

public class Interv38Q2Test {

	@Test
	public void test1() {
		
		String str = "abcd";
		Interview38Q2.stringCombination(str);
	}
	
	@Test
	public void test2() {
		
		String str = "abc";
		Interview38Q2.stringCombination(str);
	}
	
	@Test
	public void test3() {
		
		String str = "ab";
		Interview38Q2.stringCombination(str);
	}
	
	@Test
	public void test4() {
		
		String str = "a";
		Interview38Q2.stringCombination(str);
	}
	
	@Test
	public void test5() {
		
		String str = "";
		Interview38Q2.stringCombination(str);
	}
}
