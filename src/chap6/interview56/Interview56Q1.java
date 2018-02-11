package chap6.interview56;

public class Interview56Q1 {

	public static int[] singleNumber(int[] numbers) {
		
		if(numbers == null || numbers.length == 0) {
			return null;
		}
		
		int[] result = new int[2];
		
		int len = numbers.length;
		
		int xorResult = 0;
		
		for(int i = 0; i < len; i++) {
			xorResult ^= numbers[i];
		}
		
		int groupFlag = getLowestOne(xorResult);
		for(int i = 0; i < len; i++) {
			
			if((numbers[i] & groupFlag) == 0) {
				result[0] ^= numbers[i];
			}else {
				result[1] ^= numbers[i];
			}
		}
		
		return result;
	}
	
	private static int getLowestOne(int number) {
		
		int bitIndex = 1;
		while((number & bitIndex) == 0) {
			bitIndex = bitIndex << 1;
		}
		
		return bitIndex;
	}
}
