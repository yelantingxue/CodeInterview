package chap5.interview45;

import java.util.Arrays;
import java.util.Comparator;

public class Interview45Q1 {

	public static void minNumCombineArrayElements(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return;
		}
		
		int len = nums.length;
		String[] strNums = new String[len];
		
		for(int i = 0; i < len; i++) {
			strNums[i] = nums[i] + "";
		}
		
		Arrays.sort(strNums, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				
				int i = 0;
				int len1 = str1.length();
				int len2 = str2.length();
				while(i < len1 && i < len2) {
					
					if(str1.charAt(i) < str2.charAt(i)) {
						return -1;
					}else if(str1.charAt(i) > str2.charAt(i)) {
						return 1;
					}else {
						i++;
					}
				}
				
				if(i == len1) {
					return 1;
				}
				
				if(i == len2) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(int i = 0; i < len; i++) {
			System.out.print(strNums[i]);
		}
	}
}
