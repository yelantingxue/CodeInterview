package chap5.interview50;

public class Interview50Q1 {

	public static char getFirstCharAppearOnce(String str) {
		
		if(str == null || str.length() == 0) {
			return '\0';
		}
		
		int[] times = new int[256];
		
		int len = str.length();
		
		for(int i = 0; i < len; i++) {
			times[(int)str.charAt(i)]++;
		}
		
		for(int i = 0; i < len; i++) {
			
			if(times[(int)str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}
		
		return '\0';
	}
}
