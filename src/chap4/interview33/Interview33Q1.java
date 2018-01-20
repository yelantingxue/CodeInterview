package chap4.interview33;

public class Interview33Q1 {

	public static boolean verifySequenceOfBST(int[] a) {
		
		if(a == null || a.length == 0) {
			return false;
		}
		
		if(a.length == 1) {
			return true;
		}
		
		return verifyCore(a, 0, a.length-1);
	}
	
	private static boolean verifyCore(int[] a, int startIndex, int endIndex) {
		
		if(startIndex >= endIndex) {
			return true;
		}
		
		int rootValue = a[endIndex];
		
		int index = startIndex;
		while(index < endIndex && a[index] < rootValue) {
			index++;
		}
		
		for(int j = index; j < endIndex; j++) {
			if(a[j] < rootValue) {
				return false;
			}
		}
		
		return verifyCore(a, startIndex, index-1) && verifyCore(a, index, endIndex-1);
	}
}
