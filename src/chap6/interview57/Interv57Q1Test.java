package chap6.interview57;

import org.junit.Test;

public class Interv57Q1Test {

	@Test
	public void test1() {
		
		int[] numbers = {1,2,4,7,11,15};
		int[] result = Interview57Q1.findNumbersWithSum(numbers, 15);
		
		if(result == null) {
			System.out.println("No such numbers in the Input array.");
		}else {
			for(int i = 0; i < 2; i++) {
				System.out.print(result[i] + " ");
			}
		}
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {1,2,4,7,11,15};
		int[] result = Interview57Q1.findNumbersWithSum(numbers, 16);
		
		if(result == null) {
			System.out.println("No such numbers in the Input array.");
		}else {
			for(int i = 0; i < 2; i++) {
				System.out.print(result[i] + " ");
			}
		}
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {1,2,4,7,11,15};
		int[] result = Interview57Q1.findNumbersWithSum(numbers, 10);
		
		if(result == null) {
			System.out.println("No such numbers in the Input array.");
		}else {
			for(int i = 0; i < 2; i++) {
				System.out.print(result[i] + " ");
			}
		}
	}
	
	@Test
	public void test4() {
		
		int[] numbers = null;
		int[] result = Interview57Q1.findNumbersWithSum(numbers, 15);
		
		if(result == null) {
			System.out.println("No such numbers in the Input array.");
		}else {
			for(int i = 0; i < 2; i++) {
				System.out.print(result[i] + " ");
			}
		}
	}
}
