package chap5.interview51;

public class Interview51Q1 {

	public static int numOfInversePairs(int[] nums) {
		
		if(nums == null || nums.length == 1) {
			return 0;
		}
		
		int len = nums.length;
		int[] aux = new int[len];
		
		int inverseCount = 0;
		
		inverseCount = sort(nums, aux, inverseCount, 0, len-1);
		return inverseCount;
	}
	
	private static int sort(int[] nums, int[] aux, int inverseCount, int lo, int hi) {
		
		if(hi <= lo) {
			return inverseCount;
		}
		
		int mid = (lo + hi)/2;
		inverseCount = sort(nums, aux, inverseCount, lo, mid);
		inverseCount = sort(nums, aux, inverseCount, mid+1, hi);
		
		inverseCount = merge(nums, aux, inverseCount, lo, mid, hi);
		return inverseCount;
	}
	
	private static int merge(int[] nums, int[] aux, int inversCount, int lo, int mid, int hi) {
		
		for(int i = lo; i <= hi; i++) {
			aux[i] = nums[i];
		}
		
		int i = mid;
		int j = hi;
		for(int k = hi; k >= lo; k--) {
			
			if(i < lo) {
				
				nums[k] = aux[j--];
				
			}else if(j <= mid) {
				
				nums[k] = aux[i--];
				
			}else if(aux[i] > aux[j]) {
				
				inversCount += (j - mid);
				nums[k] = aux[i];
				i--;
				
			}else {
				
				nums[k] = aux[j--];
			}
		}
		
		return inversCount;
	}
}
