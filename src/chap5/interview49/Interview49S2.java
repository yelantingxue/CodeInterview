package chap5.interview49;

public class Interview49S2 {

	public static int getNthUglyNumber(int n) {
		
		if(n <= 0) {
			return 0;
		}
		
		int[] uglyNums = new int[n];
		uglyNums[0] = 1;
		
		int split2 = 0;
		int split3 = 0;
		int split5 = 0;
		
		for(int i = 1; i < n; i++) {
			
			if(uglyNums[split2]*2 < uglyNums[split3]*3) {
				uglyNums[i] = Math.min(uglyNums[split2] * 2, uglyNums[split5] * 5);
			}else {
				uglyNums[i] = Math.min(uglyNums[split3] * 3, uglyNums[split5] * 5);
			}
			
			while(uglyNums[split2] * 2 <= uglyNums[i]) {
				split2++;
			}
			
			while(uglyNums[split3] * 3 <= uglyNums[i]) {
				split3++;
			}
			
			while(uglyNums[split5] * 5 <= uglyNums[i]) {
				split5++;
			}
		}
		
		return uglyNums[n-1];
	}
}
