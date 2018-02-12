package chap6.interview60;

public class Interview60S1 {

	public static void printProbility(int n) {
		
		if(n <= 0) {
			return;
		}
		
		double allNums = Math.pow(6, n);
		
		for(int i = n; i <= 6 * n; i++) {
			
			int count = sumProbility(i, n);
			double prob = count / allNums;
			
			System.out.println("Possible value: "+ i + ", count: " + count + ", probility " + prob);
		}
	}
	
	private static int sumProbility(int sum, int n) {
		
		if(sum > 6 * n || sum <= 0 || n <= 0) {
			return 0;
		}
		
		if(sum == n || sum == 6 * n || (n == 1 && sum <= 6)) {
			return 1;
		}
		
		int count = 0;
		if(sum < 6) {
			for(int i = 1; i < sum; i++) {
				count += sumProbility(sum - i, n-1);
			}
		}else {
			for(int i = 1; i <= 6; i++) {
				count += sumProbility(sum-i, n-1);
			}
		}
		
		return count;
	}
}
