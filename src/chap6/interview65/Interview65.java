package chap6.interview65;

public class Interview65 {

	public static int add(int m, int n) {
		
		int result = m ^ n;
		int carryOver = (m & n)<<1;
		
		while(carryOver != 0) {
			
			int tmpResult = result ^ carryOver;
			int tmpCarry = (result & carryOver) << 1;
			
			result = tmpResult;
			carryOver = tmpCarry;
		}
		
		return result;
	}
}
