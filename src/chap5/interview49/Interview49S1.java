package chap5.interview49;

public class Interview49S1 {

	public static long getNthUglyNumber(int n) {
		
		if(n <= 0) {
			return 0;
		}
		
		long number = 0;
		int count = 0;
		
		while(count < n) {
			
			++number;
			if(isUglyNumber(number)) {
				++count;
			}
		}
		
		return number;
	}
	
	private static boolean isUglyNumber(long number) {
		
		if(number <= 0) {
			return false;
		}
		
		while(number % 2 == 0) {
			number = number/2;
		}
		
		while(number % 3 == 0) {
			number = number/3;
		}
		
		while(number % 5 == 0) {
			number = number/5;
		}
		
		if(number == 1) {
			return true;
		}else {
			return false;
		}
	}
}
