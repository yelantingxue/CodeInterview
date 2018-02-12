package chap6.interview57;

public class Interview57Q1 {

	public static int[] findNumbersWithSum(int[] numbers, int sum) {
		
		if(numbers == null || numbers.length == 0) {
			return null;
		}
		
		int lo = 0;
		int hi = numbers.length - 1;
		int[] result = new int[2];
		
		while(lo < hi) {
			
			if(numbers[lo] + numbers[hi] == sum) {
				result[0] = numbers[lo];
				result[1] = numbers[hi];
				
				return result;
			}else if(numbers[lo] + numbers[hi] < sum) {
				lo++;
			}else {
				hi--;
			}
		}
		
		return null;
	}
}
