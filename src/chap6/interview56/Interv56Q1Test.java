package chap6.interview56;

import org.junit.Test;

public class Interv56Q1Test {

	@Test
	public void test1() {
		
		int[] numbers = {2,4,3,6,3,2,5,5};
		int[] result = Interview56Q1.singleNumber(numbers);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {4,6};
		int[] result = Interview56Q1.singleNumber(numbers);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {4,6,1,1,1,1};
		int[] result = Interview56Q1.singleNumber(numbers);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
