package chap2.interview3;

public class Question2 {
	
	/**
	 * 
	 * @param a
	 * @return other number: Input is valid, and there are duplicated numbers in the entering array. 
	 * 						 Return value is the duplicated number.
	 * @return -1: Input is invalid, or there is no duplicated numbers in the entering array.
	 */
	public static int repeatedNumber(int[] a) {
		if(a.length == 0) {
			return -1;
		}
		int lo = 1;
		int hi = a.length-1;
		
		while(lo<=hi) {
			
			int mid = (lo + hi)/2;
			int count = count(a, lo, mid);
			
			if(lo == hi) {
				if(count > 1) {
					return lo;
				}else {
					return -1;
				}
			}
			
			if(count > mid-lo+1) {
				hi = mid;
			}else {
				lo = mid+1;
			}
			
		}
		return -1;
	}
	
	public static int count(int[] a, int lo, int hi) {
		if(lo < 0 || hi > a.length-1) {
			return -1;
		}
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= lo && a[i] <= hi) {
				count++;
			}
		}
		return count;
	}
}
