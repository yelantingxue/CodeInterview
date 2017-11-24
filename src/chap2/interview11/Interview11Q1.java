package chap2.interview11;

/**
 * Find the minimum value in a rotated ascending array.
 * 
 * My solution, a little different from the book.
 *
 */
public class Interview11Q1 {
	
	public static int minRotatedArray(int[] a) {
		
		if(a.length == 0) {
			return 0;
		}
		
		if(a.length == 1) {
			return a[0];
		}
		
		int lo = 0;
		int hi = a.length - 1;
		int mid;
		
		if(a[lo] < a[hi]) {
			return a[lo];
		}
		
		while(hi - lo > 1) {
			
			mid = (lo + hi)/2;
			
			/**
			 * If a[lo] == a[hi] == a[mid], we can only search the array in order.
			 */
			if(a[lo] == a[hi] && a[mid] == a[lo]) {
				return minInOrder(a, lo, hi);
			}
			
			if(a[mid] >= a[lo]) {
				lo = mid;
			}else if(a[mid] <= a[hi]) {
				hi = mid;
			}
		}
		
		return a[hi];
		
	}
	
	private static int minInOrder(int[] a, int lo, int hi) {
		int minValue = a[lo];
		for(int i = lo+1; i <= hi; ++i) {
			if(a[i] < minValue) {
				minValue = a[i];
			}
		}
		return minValue;
	}
}
