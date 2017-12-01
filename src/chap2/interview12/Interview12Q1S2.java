package chap2.interview12;

public class Interview12Q1S2 {

	public static boolean findPath(char[][] chrMatrix, String str) {

		int rows = chrMatrix.length;
		if (rows == 0) {
			return false;
		}

		int cols = chrMatrix[0].length;
		if (cols == 0) {
			return false;
		}

		int offset = 0;

		boolean[][] visited = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPath(chrMatrix, str, rows, cols, i, j, offset, visited)) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean hasPath(char[][] chrMatrix, String str, int rows, 
			int cols, int row, int col, int offset, boolean[][] visited) {
		
		boolean hasPath = false;
		
		if(offset == str.length()) {
			return true;
		}
		
		if(row>=0 && row < rows && col >= 0 && col < cols 
				&& chrMatrix[row][col] == str.charAt(offset) 
				&& visited[row][col] == false) {
			
			++offset;
			visited[row][col] = true;
			
			hasPath = hasPath(chrMatrix, str, rows, cols, row, col-1, offset, visited) 
					|| hasPath(chrMatrix, str, rows, cols, row-1, col, offset, visited) 
					|| hasPath(chrMatrix, str, rows, cols, row, col+1, offset, visited) 
					|| hasPath(chrMatrix, str, rows, cols, row+1, col, offset, visited);
			
			if(hasPath == false) {
				--offset;
				visited[row][col] = false;
			}
		}
		
		return hasPath;
	}
}
