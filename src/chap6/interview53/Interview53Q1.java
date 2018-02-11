package chap6.interview53;

public class Interview53Q1 {

	public static int getNumberOfK(int[] numbers, int k) {
		
		if(numbers == null || numbers.length == 0) {
			return 0;
		}
		
		int len = numbers.length;
		if(k < numbers[0] || k > numbers[len-1]) {
			return 0;
		}
		
		int firstKInArray = getFirstOfK(numbers, k, 0, len-1);
		int lastKInArray = getLastOfK(numbers, k, 0, len-1);
		
		if(firstKInArray == -1 && lastKInArray == -1) {
			return 0;
		}else {
			return lastKInArray - firstKInArray + 1;
		}
	}
	
	private static int getFirstOfK(int[] numbers, int k, int lo, int hi) {
		
		if(lo > hi) {
			return -1;
		}
		
		if(lo == hi) {
			
			if(numbers[lo] == k) {
				return lo;
			}else {
				return -1;
			}
		}
		
		int mid = (lo + hi)/2;
		if(numbers[mid] < k) {
			
			return getFirstOfK(numbers, k, mid+1, hi);
			
		}else if(numbers[mid] > k) {
			
			return getFirstOfK(numbers, k, lo, mid-1);
		}else {
			
			if(mid > 0 && numbers[mid-1] == k) {
				return getFirstOfK(numbers, k, lo, mid-1);
			}else {
				return mid;
			}
		}
	}
	
	private static int getLastOfK(int[] numbers, int k, int lo, int hi) {
		
		if(lo > hi) {
			return -1;
		}
		
		if(lo == hi) {
			
			if(numbers[lo] == k) {
				return lo;
			}else {
				return -1;
			}
		}
		
		int mid = (lo + hi)/2;
		if(numbers[mid] < k) {
			
			return getLastOfK(numbers, k, mid+1, hi);
			
		}else if(numbers[mid] > k) {
			
			return getLastOfK(numbers, k, lo, mid-1);
		}else {
			
			if(mid < numbers.length && numbers[mid+1] == k) {
				return getLastOfK(numbers, k, mid+1, hi);
			}else {
				return mid;
			}
		}
	}
}
