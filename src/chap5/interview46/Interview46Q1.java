package chap5.interview46;

public class Interview46Q1 {

	public static int numOfString(int a) {
		
		if(a < 0) {
			return 0;
		}
		
		String aStr = a + "";
		int len = aStr.length();
		
		if(len == 1) {
			return 1;
		}
		
		int[] numFromEachDigit = new int[len];
		
		//The last digit can only have one method of translate.
		numFromEachDigit[len-1] = 1;
		
		numFromEachDigit[len-2] = numFromEachDigit[len-1] + ifInRange(aStr, len-2);
		
		for(int i = len-3; i >= 0; i--) {
			numFromEachDigit[i] = numFromEachDigit[i+1] + ifInRange(aStr, i) * numFromEachDigit[i+2];
		}
		
		return numFromEachDigit[0];
	}
	
	/**
	 * To judge the number at index i and index i+1 if can be translated into a string.
	 * @param str
	 * @param index
	 * @return
	 */
	private static int ifInRange(String str, int index) {
		
		int flag = Integer.parseInt(str.substring(index, index+2));
		
		if(flag >= 10 && flag <= 25) {
			return 1;
		}else {
			return 0;
		}
	}
}
