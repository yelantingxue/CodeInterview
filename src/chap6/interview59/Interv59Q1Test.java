package chap6.interview59;

import org.junit.Test;

public class Interv59Q1Test {

	@Test
	public void test1() {
		
		int[] numbers = {2,3,4,2,6,2,5,1};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 3);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test2() {
		
		int[] numbers = {1,3,-1,-3,5,3,6,7};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 3);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test3() {
		
		int[] numbers = {1,3,5,7,9,11,13,15};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 4);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test4() {
		
		int[] numbers = {16,14,12,10,8,6,4};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 5);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test5() {
		
		int[] numbers = {10, 14, 12, 11};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 1);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test6() {
		
		int[] numbers = {10, 14, 12, 11};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 4);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test7() {
		
		int[] numbers = {10, 14, 12, 11};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 0);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test8() {
		
		int[] numbers = {10, 14, 12, 11};
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 5);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
	
	@Test
	public void test9() {
		
		int[] numbers = null;
		int[] result = Interview59Q1.maxNumsInWindow(numbers, 4);
		
		if(result == null) {
			
			System.out.println("Invalid Input.");
			
		}else {
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
}
