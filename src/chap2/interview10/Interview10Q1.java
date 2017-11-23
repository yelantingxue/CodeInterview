package chap2.interview10;

/**
 * Find the nth item of Fibonacci sequence.
 *
 */
public class Interview10Q1 {
	
	public static long Fibonacci1(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return Fibonacci1(n-1) + Fibonacci1(n-2);
	}
	
	public static long Fibonacci2(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		long FiboLastOne = 0;
		long FiboLastTwo = 1;
		long FiboCur = 0;
		
		for(int i = 2; i <= n; i++) {
			
			FiboCur = FiboLastOne + FiboLastTwo;
			FiboLastOne = FiboLastTwo;
			FiboLastTwo = FiboCur;
		}
		return FiboCur;
	}
	
}
