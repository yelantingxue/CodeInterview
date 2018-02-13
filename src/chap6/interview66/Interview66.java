package chap6.interview66;

public class Interview66 {

	public static int[] multipleArray(int[] a) {
		
		if(a == null || a.length <= 1) {
			return null;
		}
		
		int len = a.length;
		
		int multipleBefore = 1;
		int multipleBehind = 1;
		int[] beforeI = new int[len];
		int[] iBehind = new int[len];
		
		beforeI[0] = 1;
		for(int i = 1; i < len; i++) {
			
			multipleBefore *= a[i-1];
			beforeI[i] = multipleBefore;
		}
		
		iBehind[len - 1] = multipleBehind;
		for(int j = len-2; j >= 0; j--) {
			
			multipleBehind *= a[j+1];
			iBehind[j] = multipleBehind;
		}
		
		int[] result = new int[len];
		
		for(int i = 0; i < len; i++) {
			result[i] = beforeI[i] * iBehind[i];
		}
		
		return result;
	}
}
