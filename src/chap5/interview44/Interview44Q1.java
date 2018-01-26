package chap5.interview44;

public class Interview44Q1 {

	public static int digitAtIndex(int index) {
		
		if(index < 0) {
			return -1;
		}
		
		if(index == 0) {
			return 0;
		}
		
		int i;
		int differ = index;
		
		for(i = 1; ; i++) {
			
			differ = differ - howManyNumbersOfN(i);
			
			if(differ >= 0) {
				index = differ;
			}else {
				break;
			}
		}
		
		//the last (i-1)-digit number's last digit.
		//For example, 99 is the last 2-digit number, and 9 is the last number of 99.
		if(index == 0) {
			return 9;
		}
		
		//how many unbroken i-digit number before.
		int quotient = index / i;
		
		//the reminder-th digit in next number.
		int reminder = index % i;
		
		//the last unbroken number before.
		int x = quotient - 1 + (int)Math.pow(10, i-1);
		
		if(reminder == 0) {
			return x%10;
		}else {
			return nthNumber(x + 1, reminder);
		}
		
	}
	
	/**
	 * How many digits of n-digit number.
	 * @param n
	 * @return
	 */
	private static int howManyNumbersOfN(int n) {
		
		int a = n * 9 * (int)Math.pow(10, (n-1));
		return a;
	}
	
	/**
	 * The nth digit in a number.
	 * @param number
	 * @param n
	 * @return
	 */
	private static int nthNumber(int number, int n) {
		
		String str = number + "";
		return str.charAt(n-1) - '0';
	}
}
