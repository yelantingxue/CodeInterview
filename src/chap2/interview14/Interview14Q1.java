package chap2.interview14;

public class Interview14Q1 {
	
	/**
	 * Dynamic programming solution.
	 * @param rowLen
	 * @return
	 */
	public static int largestProductDP(int rowLen) {
		
		if(rowLen < 2) {
			return 0;
		}
		
		if(rowLen == 2) {
			return 1;
		}
		
		if(rowLen == 3) {
			return 2;
		}
		
		int[] products = new int[rowLen+1];
		products[0] = 0;
		products[1] = 1;
		products[2] = 2;
		products[3] = 3;
		
		for(int i = 4; i <= rowLen; i++) {
			for(int j = 1; j < i; j++) {
				if(products[j] * products[i-j] > products[i]) {
					products[i] = products[j] * products[i-j];
				}
			}
		}
		return products[rowLen];
	}
	
	/**
	 * Greedy solution.
	 * @param rowLen
	 * @return
	 */
	public static int largestProduceGreedy(int rowLen) {
		
		if(rowLen < 2) {
			return 0;
		}
		
		if(rowLen == 2) {
			return 1;
		}
		
		if(rowLen == 3) {
			return 2;
		}
		
		int maxProduct = 1;
		while(rowLen >= 5) {
			
			maxProduct *= 3;
			rowLen -= 3;
		
		}
		
		if(rowLen == 4) {
			
			maxProduct *= 4;
		}else {
			
			maxProduct *= rowLen;
		}
		
		return maxProduct;
	}
}
