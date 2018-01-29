package chap5.interview47;

import org.junit.Test;

public class Interv47Q1Test {

	@Test
	public void test1() {
		
		int[][] presents = {{1,10,3,8},
							{12, 2, 9, 6},
							{5, 7, 4, 11},
							{3, 7, 16, 5}};
		
		System.out.println(Interview47Q1.getPresentsWithMaxValue(presents));
	}
	
	@Test
	public void test2() {
		
		int[][] presents = {{1,2,3},
							{4, 5, 6},
							{7, 8, 9}};
		
		System.out.println(Interview47Q1.getPresentsWithMaxValue(presents));
	}
	
	@Test
	public void test3() {
		
		int[][] presents = {{1,10,3,8}};
		
		System.out.println(Interview47Q1.getPresentsWithMaxValue(presents));
	}
	
	@Test
	public void test4() {
		
		int[][] presents = {{1},
							{12},
							{5},
							{3}};
		
		System.out.println(Interview47Q1.getPresentsWithMaxValue(presents));
	}
	
	@Test
	public void test5() {
		
		int[][] presents = {{3}};
		
		System.out.println(Interview47Q1.getPresentsWithMaxValue(presents));
	}
	
	@Test
	public void test6() {
		
		int[][] presents = null;
		
		System.out.println(Interview47Q1.getPresentsWithMaxValue(presents));
	}
}
