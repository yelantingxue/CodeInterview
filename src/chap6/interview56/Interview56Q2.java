package chap6.interview56;

import java.io.IOException;

public class Interview56Q2 {

	public static int findNumberAppearingOnce(int[] numbers) throws IOException{
		
		if(numbers == null || numbers.length == 0) {
			throw new IOException("Invalid Input");
		}
		
		int[] onePosition = new int[32];
		for(int i = 0; i < numbers.length; i++) {
			
			int bitIndex = 1;
			for(int j = 0; j < 32; j++) {
				if((bitIndex & numbers[i]) != 0) {
					++onePosition[j];
				}
				bitIndex <<= 1;
			}
		}
		
		int result = 0;
		for(int i = 31; i >= 0; i--) {
			
			result = result << 1;
			result += onePosition[i]%3;
		}
		
		return result;
	}
}
