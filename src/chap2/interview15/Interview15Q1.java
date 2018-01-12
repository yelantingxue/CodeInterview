package chap2.interview15;

public class Interview15Q1 {

	/**
	 * Conventional solution.
	 * @param a
	 * @return
	 */
	public static int numberOf1InBinary(int a) {
		
		int flag = 1;
		int count = 0;
		while(flag != 0) {
			
			if((a & flag) == flag) {
				count++;
			}
			
			flag = flag << 1;
		}
		return count;
	}
	
	/**
	 * Another solution may be suprising.
	 * @param a
	 * @return
	 */
	public static int numberOf1InBinaryS2(int a) {
		
		int count = 0;
		while(a != 0) {
			
			count++;
			a = a & (a-1);
		}
		return count;
	}
}
