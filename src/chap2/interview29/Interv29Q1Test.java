package chap2.interview29;

import org.junit.Test;

public class Interv29Q1Test {

	@Test
	public void test1() {
		
		int[][] matrix = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test2() {
		
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test3() {
		
		int[][] matrix = {{1}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test4() {
		
		int[][] matrix = {{1,2}, {3,4}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test5() {
		
		int[][] matrix = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test6() {
		
		int[][] matrix = {{1}, {2}, {3}, {4}, {5}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test7() {
		
		int[][] matrix = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test8() {
		
		int[][] matrix = {{1,2,3}, {4,5,6,}, {7,8,9},{10,11,12}, {13,14,15}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test9() {
		
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test10() {
		
		int[][] matrix = {{1,2,3,4,5}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test11() {
		
		int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}};
		Interview29Q1.printCircleMatrix(matrix);
	}
	
	@Test
	public void test12() {
		
		int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15}};
		Interview29Q1.printCircleMatrix(matrix);
	}
}
