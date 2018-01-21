package chap4.interview38;

import org.junit.Test;

public class Interv38Q1Test {

	@Test
	public void test1() {
		
		String str = "abcd";
		Interview38Q1.stringPermutation(str);
	}
	
	@Test
	public void test2() {
		
		String str = "ab";
		Interview38Q1.stringPermutation(str);
	}
	
	@Test
	public void test3() {
		
		String str = "a";
		Interview38Q1.stringPermutation(str);
	}
	
	@Test
	public void test4() {
		
		String str = "";
		Interview38Q1.stringPermutation(str);
	}
}
