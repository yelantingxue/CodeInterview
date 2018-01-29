package chap5.interview47;

public class Interview47Q1 {

	public static int getPresentsWithMaxValue(int[][] presents) {
		
		if(presents == null || presents.length == 0 || presents[0].length == 0) {
			return 0;
		}
		
		int rows = presents.length;
		int cols = presents[0].length;
		
		int[] maxValues = new int[cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				
				int up = 0;
				int left = 0;
				
				if(i > 0) {
					up = maxValues[j];
				}
				
				if(j > 0) {
					left = maxValues[j-1];
				}
				
				maxValues[j] = Math.max(up, left) + presents[i][j];
			}
		}
		
		return maxValues[cols-1];
	}
}
