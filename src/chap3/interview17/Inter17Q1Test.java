package chap3.interview17;

import org.junit.Test;

public class Inter17Q1Test {

	@Test
	public void test1() {
		Interview17Q1.printOneToMaxOfNDigitsS1(0);
	}
	
	@Test
	public void test2() {
		Interview17Q1.printOneToMaxOfNDigitsS1(1);
	}
	
	@Test
	public void test3() {
//		Interview17Q1.printOneToMaxOfNDigitsS1(2);
		Interview17Q1.printOneToMaxOfNDigitsS2(2);
	}
	
	@Test
	public void test4() {
//		Interview17Q1.printOneToMaxOfNDigitsS1(3);
		Interview17Q1.printOneToMaxOfNDigitsS2(3);
	}
	
	@Test
	public void test5() {
		Interview17Q1.printOneToMaxOfNDigitsS1(-1);
	}
}
