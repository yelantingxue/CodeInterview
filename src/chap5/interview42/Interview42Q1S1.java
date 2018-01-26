package chap5.interview42;

public class Interview42Q1S1 {

	public static int findGreatestSumOfSubArray(int[] number) {
		
		if(number == null || number.length == 0) {
			System.out.println("Invalid Input.");
			return 0;
		}
		
		int len = number.length;
		int currentSubArraySum = 0;
		int greatestSubArraySum = 0;
		
		for(int i = 0; i < len; i++) {
			
			if(i == 0) {
				currentSubArraySum = number[i];
				greatestSubArraySum = number[i];
				continue;
			}
			
			currentSubArraySum += number[i];
			if(currentSubArraySum > greatestSubArraySum) {
				
				greatestSubArraySum = currentSubArraySum;
				
			}else if(currentSubArraySum < 0) {
				
				currentSubArraySum = 0;
			}
		}
		
		return greatestSubArraySum;
	}
}
