package chap2.interview31;

import org.junit.Test;

public class Interv31Q1Test {

	@Test
	public void test1() {
		
		int[] pushOrder = {1,2,3,4,5};
		int[] popOrder = {4,5,3,2,1};
		
		System.out.println(Interview31Q1.isPopOrder(pushOrder, popOrder));
	}
	
	@Test
	public void test2() {
		
		int[] pushOrder = {1,2,3,4,5};
		int[] popOrder = {4,3,5,1,2};
		
		System.out.println(Interview31Q1.isPopOrder(pushOrder, popOrder));
	}
	
	@Test
	public void test3() {
		
		int[] pushOrder = {1,2,3,4,5};
		int[] popOrder = {3,5,4,2,1};
		
		System.out.println(Interview31Q1.isPopOrder(pushOrder, popOrder));
	}
	
	@Test
	public void test4() {
		
		int[] pushOrder = {1,2,3,4,5};
		int[] popOrder = {3,5,4,1,2};
		
		System.out.println(Interview31Q1.isPopOrder(pushOrder, popOrder));
	}
	
	@Test
	public void test5() {
		
		int[] pushOrder = {1};
		int[] popOrder = {4};
		
		System.out.println(Interview31Q1.isPopOrder(pushOrder, popOrder));
	}
	
	@Test
	public void test6() {
		
		int[] pushOrder = {1};
		int[] popOrder = {1};
		
		System.out.println(Interview31Q1.isPopOrder(pushOrder, popOrder));
	}
}
