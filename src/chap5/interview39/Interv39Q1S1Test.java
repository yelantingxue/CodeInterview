package chap5.interview39;

import org.junit.Test;

public class Interv39Q1S1Test {

	@Test
	public void test1() {
		int[] number = {1,2,3,2,2,2,5,4,2};
		System.out.println(Interview39Q1S1.moreThanHalfNum(number));
	}
	
	@Test
	public void test2() {
		int[] number = {1, 2, 3, 2, 4, 2, 5, 2, 3};
		System.out.println(Interview39Q1S1.moreThanHalfNum(number));
	}
	
	@Test
	public void test3() {
		int[] number = {2, 2, 2, 2, 2, 1, 3, 4, 5};
		System.out.println(Interview39Q1S1.moreThanHalfNum(number));
	}
	
	@Test
	public void test4() {
		int[] number = {1, 3, 4, 5, 2, 2, 2, 2, 2};
		System.out.println(Interview39Q1S1.moreThanHalfNum(number));
	}
	
	@Test
	public void test5() {
		int[] number = {1};
		System.out.println(Interview39Q1S1.moreThanHalfNum(number));
	}
	
	@Test
	public void test6() {
		int[] number = null;
		System.out.println(Interview39Q1S1.moreThanHalfNum(number));
	}
}
