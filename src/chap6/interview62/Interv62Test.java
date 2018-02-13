package chap6.interview62;

import java.io.IOException;

import org.junit.Test;

public class Interv62Test {

	@Test
	public void test1() throws IOException {
		
		System.out.println(Interview62S1.lastNumber(5, 3));
		System.out.println(Interview62S2.lastNumber(5, 3));
	}
	
	@Test
	public void test2() throws IOException {
		
		System.out.println(Interview62S1.lastNumber(5, 2));
		System.out.println(Interview62S2.lastNumber(5, 2));
	}
	
	@Test
	public void test3() throws IOException {
		
		System.out.println(Interview62S1.lastNumber(6, 7));
		System.out.println(Interview62S2.lastNumber(6, 7));
	}
	
	@Test
	public void test4() throws IOException {
		
		System.out.println(Interview62S1.lastNumber(6, 6));
		System.out.println(Interview62S2.lastNumber(6, 6));
	}
	
	@Test
	public void test5() throws IOException {
		
		System.out.println(Interview62S1.lastNumber(4000, 997));
		System.out.println(Interview62S2.lastNumber(4000, 997));
	}
	
}
