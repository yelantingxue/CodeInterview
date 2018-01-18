package chap2.interview29;

public class Interview29Q1 {

	public static void printCircleMatrix(int[][] matrix) {
		
		int row = matrix.length;
		
		if(row == 0) {
			return;
		}
		
		int col = matrix[0].length;
		
		for(int i = 0; (row > 2*i && col > 2*i); i++) {
			printCircleMatrixCore(matrix, i, row, col);
		}
	}
	
	private static void printCircleMatrixCore(int[][] matrix, int start, int row, int col) {
		
		int endOfRow = row - 1 - start;
		int endOfCol = col - 1 - start;
		
		if(endOfCol >= start) {
			for(int i = start; i <= endOfCol; i++) {
				System.out.println(matrix[start][i]);
			}
		}
		
		if(endOfRow > start) {
			for(int i = start+1; i <= endOfRow; i++) {
				System.out.println(matrix[i][endOfCol]);
			}
		}
		
		if(endOfCol > start && endOfRow > start) {
			for(int i = endOfCol-1; i >= start; i--) {
				System.out.println(matrix[endOfRow][i]);
			}
		}
		
		if(endOfCol > start && endOfRow-1 > start) {
			for(int i = endOfRow-1; i > start; i--) {
				System.out.println(matrix[i][start]);
			}
		}
	}
}
