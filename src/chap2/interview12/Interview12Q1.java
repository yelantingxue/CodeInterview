package chap2.interview12;

public class Interview12Q1 {
	
	public static boolean findPath(char[][] chr, String str) {
		
		int rows = chr.length;
		
		//chr = []
		if(rows == 0) {
			return false;
		}
		
		int cols = chr[0].length;
		
		//chr = [[]]
		if(cols == 0) {
			return false;
		}
		
		
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(chr[i][j] == str.charAt(0)) {
					
					if(str.length() == 1) {
						return true;
					}
					
					//Pay attention to the position of this statement.
					//If there is more than one character equals to the first of the string, 
					//this statement will reset the matrix visited[][].
					boolean[][] visited = new boolean[rows][cols];
					
					if(hasPath(chr, str, i, j, visited, 1, rows, cols)) {
						return true;
					}
				}
				
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param chr: Character Matrix.
	 * @param str: The path to be found in character matrix.
	 * @param row: The row of the character.
	 * @param col: The col of the character.
	 * @param visited: The boolean matrix that record if this character is added to the path.
	 * @param offset: The character position in the str.
	 * @param rows: The number of rows of chr.
	 * @param cols: The number of cols of chr.
	 * @return
	 */
	private static boolean hasPath(char[][] chr, String str, 
			int row, int col, boolean visited[][], int offset, int rows, int cols) {
		
		visited[row][col] = true;
		
		if(row > 0 && !visited[row-1][col]) {
			
			//visited[row-1][col] = true;
			
			if(chr[row-1][col] == str.charAt(offset)) {
				
				if(offset >= str.length()-1) {
					return true;
				}
				if(hasPath(chr, str, row-1, col, visited, offset+1, rows, cols)) {
					return true;
				}
			}
			
		}
		
		if(row < rows-1 && !visited[row+1][col]) {
			
			//visited[row+1][col] = true;
			
			if(chr[row+1][col] == str.charAt(offset)) {
				
				if(offset >= str.length()-1) {
					return true;
				}
				
				if(hasPath(chr, str, row+1, col, visited, offset+1, rows, cols)) {
					return true;
				}
			}
		}
		
		if(col > 0 && !visited[row][col-1]) {
			//visited[row][col-1] = true;
			
			if(chr[row][col-1] == str.charAt(offset)) {
				
				if(offset >= str.length()-1) {
					return true;
				}
				
				if(hasPath(chr, str, row, col-1, visited, offset+1, rows, cols)) {
					return true;
				}
			}
		}
		
		if(col < cols-1 && !visited[row][col+1]) {
			//visited[row][col+1] = false;
			
			if(chr[row][col+1] == str.charAt(offset)) {
				
				if(offset >= str.length()-1) {
					return true;
				}
				
				if(hasPath(chr,str, row, col+1, visited, offset+1, rows, cols)) {
					return true;
				}
			}
		}
		
		/**
		 * If one character is not in the path, reset this character, 
		 * so that we can add this character to the path later, if we need.
		 */
		visited[row][col] = false;
		return false;
	}
}
