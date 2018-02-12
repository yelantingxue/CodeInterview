package chap6.interview58;

public class Interview58Q2S2 {

	public static void leftRotateString(char[] strArray, int k) {
		
		if(strArray == null || strArray.length == 0) {
			return;
		}
		
		int len = strArray.length;
		
		if(k <= 0 || k >= len) {
			return;
		}
		
		reverse(strArray, 0, k-1);
		reverse(strArray, k, len-1);
		reverse(strArray, 0, len-1);
	}
	
	private static void reverse(char[] chrArray, int lo, int hi) {
		
		while(lo < hi) {
			char tmp = chrArray[lo];
			chrArray[lo] = chrArray[hi];
			chrArray[hi] = tmp;
			
			lo++;
			hi--;
		}
	}
}
