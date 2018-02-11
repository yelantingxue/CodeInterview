package chap6.interview53;

public class Interview53Q2 {

	public static int findMissingNumber(int[] numbers) {
		
		if(numbers == null || numbers.length == 0) {
			return -1;
		}
		
		int len = numbers.length;
		int result = findMissingNumberCore(numbers, 0, len-1);
		return result;
	}
	
	private static int findMissingNumberCore(int[] numbers, int lo, int hi) {
		
		if(lo == hi) {
			
			if(lo == numbers[lo]) {
				return lo+1;
			}else {
				return lo;
			}
			
		}
		
		int mid = (lo + hi)/2;
		if(numbers[mid] == mid) {
			return findMissingNumberCore(numbers, mid+1, hi);
		}else {
			return findMissingNumberCore(numbers, lo, mid);
		}
	}
}
