package chap5.interview39;

public class Interview39Q1S2 {

	public static int moreThanHalfNum(int[] number) {
		
		if(number == null || number.length == 0) {
			return 0;
		}
		
		int count = 1;
		int num = number[0];
		
		for(int i = 1; i < number.length; i++) {
			
			if(count == 0) {
				num = number[i-1];
				count++;
			}
			
			if(number[i] == num) {
				count++;
			}else {
				count--;	
			}
		}
		
		if(count == 0) {
			return 0;
		}else {
			return num;
		}
	}
}
