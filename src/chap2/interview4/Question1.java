package chap2.interview4;

public class Question1 {
	public static boolean findIn2DMatrix(int[][] a, int num) {
		
		if(a.length == 0) {
			return false;
		}
		int row = 0;
		int col = a[0].length-1;
		
		while(row < a.length && col >= 0 && a[row][col]!=num) {
			if(a[row][col] > num) {
				col--;
			}else {
				row++;
			}
		}
		
		if(row < a.length && col >= 0 && a[row][col]==num) {
			return true;
		}
		return false;
	}
}
