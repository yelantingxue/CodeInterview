package chap6.interview61;

import java.util.Arrays;

public class Interview61 {

	public static boolean isConsecutive(int[] numbers) {
		
		if(numbers == null || numbers.length != 5) {
			return false;
		}
		
		Arrays.sort(numbers);
		
		int countOfZero = 0;
		int countOfBlank = 0;
		
		for(int i = 0; i < 5; i++) {
			
			if(numbers[i] == 0) {
				++countOfZero;
				continue;
			}
			
			if(i > 0) {
				
				if(numbers[i] - numbers[i - 1] == 0) {
					
					return false;
					
				}else if(numbers[i] - numbers[i - 1] > 1 && numbers[i - 1] != 0) {
					
					countOfBlank += numbers[i] - numbers[i-1] - 1;
				}
			}
		}
		
//		if(countOfZero > 2) {
//			return false;
//		}
		
		if(countOfZero >= countOfBlank) {
			return true;
		}else {
			return false;
		}
	}
}
