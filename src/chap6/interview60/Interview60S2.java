package chap6.interview60;

public class Interview60S2 {

	public static void printProbility(int n) {
		
		if(n <= 0) {
			return;
		}
		
		int maxOfDice = 6;
		double numsOfAll = Math.pow(maxOfDice, n);
		
		int maxNum = maxOfDice * n;
		
		int[] count1 = new int[maxNum + 1];
		int[] count2 = new int[maxNum + 1];
		
		for(int i = 1; i <= 6; i++) {
			count1[i] = 1;
		}
		
		boolean flag = false;
		
		for(int i = 2; i <= n; i++) {
			
			if(flag) {
				
				count1 = new int[maxNum + 1];
				
				for(int j = i; j <= maxOfDice * i; j++) {
					
					int k = 1;
					while(j - k > 0 && k <= 6) {
						count1[j] += count2[j - k];
						k++;
					}
				}
				
			}else {
				
				count2 = new int[maxNum + 1];
				
				for(int j = i; j <= maxOfDice * i; j++) {
					
					count2[j] = 0;
					int k = 1;
					while(j - k > 0 && k <= 6) {
						count2[j] += count1[j - k];
						k++;
					}
				}
			}
			
			flag = !flag;
		}
		
		if (n % 2 == 1) {

			for (int i = n; i <= maxNum; i++) {

				int count = count1[i];
				double prob = count / numsOfAll;
				System.out.println("Possible sum: " + i 
						+ ", count: " + count 
						+ ", probility: " + prob);
			}
		} else {

			for (int i = n; i <= maxNum; i++) {

				int count = count2[i];
				double prob = count / numsOfAll;
				System.out.println("Possible sum: " + i 
									+ ", count: " + count 
									+ ", probility: " + prob);
			}
		}
	}
}
