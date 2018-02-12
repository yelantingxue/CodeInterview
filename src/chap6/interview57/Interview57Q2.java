package chap6.interview57;

public class Interview57Q2 {

	public static void findContinuousSequence(int sum) {
		
		if(sum <= 2) {
			return;
		}
		
		int small = 1;
		int big = 2;
		
		int bound = (1 + sum)/2;
		
		int sequenceSum = small + big;
		
		while(small < bound) {
			
			if(sequenceSum < sum) {
				
				++big;
				sequenceSum += big;
				
			}else if(sequenceSum > sum) {
				
				sequenceSum -= small++;
				
			}else {
				for(int i = small; i <= big; i++) {
					System.out.print(i + " ");
				}
				
				System.out.println();
				
				sequenceSum -= small++;
			}
		}
	}
}
