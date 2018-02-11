package chap6.interview56;

import java.io.IOException;

import org.junit.Test;

public class Interv56Q2Test {

	@Test
	public void test1() throws IOException {
		
		int[] numbers = {2,2,2,3,6,6,6};
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test2() throws IOException {
		
		int[] numbers = {1,1,2,2,2,1,3};
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test3() throws IOException {
		
		int[] numbers = {4,3,3,2,2,2,3};
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test4() throws IOException {
		
		int[] numbers = {4,4,1,1,1,7,4};
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test5() throws IOException {
		
		int[] numbers = {-10,214,214,214,6,6,6};
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test6() throws IOException {
		
		int[] numbers = {-209,3467,-209,-209};
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test7() throws IOException {
		
		int[] numbers =  { 1024, -1025, 1024, -1025, 1024, -1025, 1023 };
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test8() throws IOException {
		
		int[] numbers =  { -1024, -1024, -1024, -1023 };
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test9() throws IOException {
		
		int[] numbers =  { -23, 0, 214, -23, 214, -23, 214 };
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
	
	@Test
	public void test10() throws IOException {
		
		int[] numbers =  { 0, 3467, 0, 0, 0, 0, 0, 0 };
		System.out.println(Interview56Q2.findNumberAppearingOnce(numbers));
	}
}
