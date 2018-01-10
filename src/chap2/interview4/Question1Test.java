package chap2.interview4;

import org.junit.Test;

public class Question1Test {

	/**
	 * The number to be found is in the matrix.
	 */
	@Test
	public void test1() {
		int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(Question1.findIn2DMatrix(matrix, 7));
	}
	
	/**
	 * The number to be found is not in the matrix.
	 */
	@Test
	public void test2() {
		int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(Question1.findIn2DMatrix(matrix, 5));
	}
	
	/**
	 * The number to be found is the smallest number in the matrix.
	 */
	@Test
	public void test3() {
		int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(Question1.findIn2DMatrix(matrix, 1));
	}
	
	/**
	 * The number to be found is the largest number in the matrix.
	 */
	@Test
	public void test4() {
		int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(Question1.findIn2DMatrix(matrix, 15));
	}
	
	/**
	 * The number to be found is smaller than the smallest number in the matrix.
	 */
	@Test
	public void test5() {
		int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(Question1.findIn2DMatrix(matrix, 0));
	}
	
	/**
	 * The number to be found is larger than the largest number in the matrix.
	 */
	@Test
	public void test6() {
		int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(Question1.findIn2DMatrix(matrix, 16));
	}
	
	/**
	 * Input is empty matrix.
	 */
	@Test
	public void test7() {
		int[][] matrix = {};
		System.out.println(Question1.findIn2DMatrix(matrix, 5));
	}
}
