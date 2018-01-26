package chap5.interview43;

public class Interview43Q1 {

	public static int numOfOne(int number) {
		
		if(number <= 0) {
			return 0;
		}
		
		String numStr = number + "";
		return numOfOneCore(numStr);
	}
	
	private static int numOfOneCore(String numStr) {
		
		int len = numStr.length();
		
		if(numStr == null || numStr.length() == 0) {
			return 0;
		}
		
		int first = numStr.charAt(0) - '0';
		
		if(len == 1 && first != 0) {
			return 1;
		}
		
		if(len == 1 && first == 0) {
			return 0;
		}
		
		//From 1346 to 21345, times that top digit is one.
		int numOfFirstDigit = 0;
		if(first > 1) {
			numOfFirstDigit = tenPowerk(len - 1);
		}else if(first == 1){
			numOfFirstDigit = Integer.parseInt(numStr.substring(1)) + 1;
		}
		
		//From 1346 to 21345, times that other digit is one.
		int numOfRest = first * (len-1) * tenPowerk(len-2);
		
		//From 1 to 1345, number of one.
		int numOfRecursive = numOfOneCore(numStr.substring(1));
		
		return numOfFirstDigit + numOfRest + numOfRecursive;
	}
	
	private static int tenPowerk(int k) {
		
		int result = 1;
		for(int i = 0; i < k; i++) {
			result *= 10;
		}
		
		return result;
	}
}
