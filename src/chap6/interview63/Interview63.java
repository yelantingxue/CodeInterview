package chap6.interview63;

public class Interview63 {

	public static int maxProfit(int[] price) {
		
		if(price == null || price.length <= 1) {
			return 0;
		}
		
		int result = Integer.MIN_VALUE;
		int min = price[0];
		
		for(int i = 1; i < price.length; i++) {
			
			int differ = price[i] - min;
			result = result > differ ? result : differ;
			
			if(price[i] < min) {
				min = price[i];
			}
			
//			if(price[i] > min) {
//				
//				int differ = price[i] - min;
//				result = result > differ ? result : differ;
//				
//			}else {
//				min = price[i];
//			}
		}
		
		return result;
	}
}
