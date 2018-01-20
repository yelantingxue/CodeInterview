package chap3.interview17;

public class Interview17Q1 {

	/**
	 * Solution1: Use an int[] array to represent the number and simulate addition using the array.
	 * Invoke method "incrementAndOverflow" and "printStringBuilderNumber".
	 * @param n
	 */
	public static void printOneToMaxOfNDigitsS1(int n) {
		
		if(n <= 0) {
			System.out.println("");
			return;
		}
		
		int[] number = new int[n];
		
		while(!incrementAndOverflow(number)) {
			printArrayNumber(number);
		}
		
	}
	
	private static boolean incrementAndOverflow(int[] num) {
		
		boolean isOverFlow = false;
		int carryOver = 0;
		
		for(int i = num.length - 1; i >= 0; i--) {
			
			int nSum = 0;
			
			if(i == num.length -1) {
				nSum = num[i] + 1 + carryOver;
			}else {
				nSum = num[i] + carryOver;
			}
			
			if(nSum >= 10) {
				
				if(i <= 0) {
					isOverFlow = true;
				}
				
				carryOver = nSum / 10;
				num[i] = nSum - 10 * carryOver;
				
			}else {
				num[i] = nSum;
				break;
			}
			
		}
		return isOverFlow;
	}
	
	private static void printArrayNumber(int[] num) {
		
		boolean flag = false;
		
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] != 0 || flag) {
				System.out.print(num[i]);
				flag = true;
			}
		}
		System.out.println();
	}
	
	/**
	 * Solution 2: Also use a int[] to represent the number but use recursion to solve the problem.
	 * Invoke method "incrementAndPrint" and "printStringBuilderNumber".
	 * @param n
	 */
	public static void printOneToMaxOfNDigitsS2(int n) {
		
		if(n <= 0) {
			System.out.println("");
			return;
		}
		
		int[] number = new int[n];
		
		for(int i = 0; i < 10; i++) {
			number[0] = i;
			incrementAndPrint(number, 0);
		}
		
	}
	
	private static void incrementAndPrint(int[] number, int position) {
		
		if(position == number.length - 1) {
			printArrayNumber(number);
			return;
		}
		
		for(int i = 0; i < 10; i++) {
			number[position + 1] = i;
			incrementAndPrint(number, position+1);
		}
		
	}
}
