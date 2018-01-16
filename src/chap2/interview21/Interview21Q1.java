package chap2.interview21;

public class Interview21Q1 {

	/**
	 * Conventional solution.
	 * @param a
	 */
	public static void reorderOddEven(int[] a) {
		
		int len = a.length;
		
		if(len <= 1) {
			return;
		}
		int lo = 0;
		int hi = len-1;
		
		while(lo < hi) {
			
			if(a[lo]%2 == 1 && a[hi]%2 == 0) {
				
				lo++;
				hi--;
				
			}else if(a[lo]%2 == 0 && a[hi]%2 == 1) {
				
				int tmp = a[hi];
				a[hi] = a[lo];
				a[lo] = tmp;
				
				lo++;
				hi--;
				
			}else if(a[lo]%2 == 0 && a[hi]%2 == 0) {
				hi--;
			}else {
				lo++;
			}
		}
	}
}
