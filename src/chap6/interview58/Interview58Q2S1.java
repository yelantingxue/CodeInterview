package chap6.interview58;

public class Interview58Q2S1 {

	public static String leftRotateString(String str, int k) {
		
		if(str == null || str.length() == 0 || k > str.length() || k <= 0) {
			return null;
		}
		
		int len = str.length();
		if(len == k) {
			return str;
		}
		
		String roStr = str.substring(0, k);
		String leStr = str.substring(k);
		
		return leStr + roStr;
	}
}
