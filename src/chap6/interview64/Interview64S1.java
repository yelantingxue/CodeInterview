package chap6.interview64;

public class Interview64S1 {

	public static int accumulate(int n) {
		
		int result = n;
		
		boolean flag = (n > 0) && (result += accumulate(n-1)) > 0;
		
		return result;
	}
}
