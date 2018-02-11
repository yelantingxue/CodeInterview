package chap6.interview53;

public class Interview53Q3 {

	public static int getNumberSameAsIndex(int[] numbers) {
		
		if(numbers == null || numbers.length == 0) {
			return -1;
		}
		
		int len = numbers.length;
		int result = getNumberSameAsIndexCore(numbers, 0, len-1);
		return result;
	}
	
	private static int getNumberSameAsIndexCore(int[] numbers, int lo, int hi) {
		
		if(lo > hi) {
			return -1;
		}
		
		if(lo == hi) {
			if(numbers[lo] == lo) {
				return lo;
			}else {
				return -1;
			}
		}
		
		int mid = (lo + hi)/2;
		
		if(numbers[mid] < mid) {
			return getNumberSameAsIndexCore(numbers, mid+1, hi);
		}else if(numbers[mid] > mid) {
			return getNumberSameAsIndexCore(numbers, lo, mid-1);
		}else {
			return mid;
		}
	}
}
