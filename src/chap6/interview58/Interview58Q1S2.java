package chap6.interview58;

public class Interview58Q1S2 {

	public static void reverseString(char[] chrArray) {
		
		if(chrArray == null || chrArray.length == 0) {
			return;
		}
		
		int len = chrArray.length;
		if(len == 1) {
			return;
		}
		
		reverse(chrArray, 0, len-1);
		
		int begin = 0;
		int end = -2;
		
		int space = 0;
		
		while(space < len) {
			
			if(chrArray[space] == ' ') {
				
				begin = end+2;
				end = space-1;
				
				reverse(chrArray, begin, end);
			}
			
			if(space == len - 1) {
				begin = end+2;
				end = space;
				reverse(chrArray, begin, end);
			}
			
			++space;
		}
		
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
