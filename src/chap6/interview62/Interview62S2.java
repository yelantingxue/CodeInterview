package chap6.interview62;

public class Interview62S2 {

	public static int lastNumber(int num, int m) {
		
		if(num <= 0 || m <= 0) {
			return -1;
		}
		
		if(num == 1) {
			return 0;
		}
		
		if(m == 1) {
			return num-1;
		}
		
		int result = 0;
		for(int i = 2; i <= num; i++) {
			result = (result + m) % i;
		}
		
		return result;
	}
}
