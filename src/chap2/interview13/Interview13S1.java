package chap2.interview13;

public class Interview13S1 {
	
	public static int enteringCount(int rows, int cols, int threshold) {
		
		if(rows < 0 || cols < 0) {
			return 0;
		}
		
		boolean[][] visited = new boolean[rows][cols];
		
		int count = enteringCountCore(rows, cols, 0, 0, threshold, visited);
		
		return count;
	}
	
	private static int enteringCountCore(int rows, int cols, int row, 
			int col, int threshold, boolean[][] visited) {
		
		int count = 0;
		
		if(row >= 0 && row < rows && col >= 0 && col < cols && !visited[row][col]) {
			visited[row][col] = true;
		}else {
			return count;
		}
		
		if(sumOfCoorDigit(row, col) <= threshold) {
			
			count = 1 + enteringCountCore(rows, cols, row-1, col, threshold, visited) 
						+ enteringCountCore(rows, cols, row, col-1, threshold, visited) 
						+ enteringCountCore(rows, cols, row+1, col, threshold, visited) 
						+ enteringCountCore(rows, cols, row, col+1, threshold, visited);
		}
		return count;
	}
	
	private static int sumOfCoorDigit(int row, int col) {
		
		int sum = sumOfDigit(row) + sumOfDigit(col);
		
		return sum;
	}
	
	public static int sumOfDigit(int n) {
		
		int sum = 0;
		
		while(n > 0) {
			int remainder = n % 10;
			sum += remainder;
			n -= remainder;
			n = n/10;
		}
		return sum;
	}
}
