package chap5.interview48;

public class Interview48Q1 {

	public static int lengthOfLongestSubstring(String str) {
		
		if(str == null || str.length() == 0) {
			return 0;
		}
		
		int len = str.length();
		int[] longestSubstr = new int[len];
		
		int[] charPresents = new int[26];
		for(int i = 0; i < 26; i++) {
			charPresents[i] = -1;
		}
		
		for(int i = 0; i < len; i++) {
			
			char ch = str.charAt(i);
			
			if(charPresents[ch - 'a'] == -1) {
				
				if(i == 0) {
					longestSubstr[i] = 1;
				}else {
					longestSubstr[i] = longestSubstr[i-1]+1;
				}
				
				charPresents[ch - 'a'] = i;
				
			}else {
				
				int d = i - charPresents[ch - 'a'];
				
				if(d <= longestSubstr[i-1]) {
					
					longestSubstr[i] = d;
					charPresents[ch - 'a'] = i;
					
				}else {
					
					longestSubstr[i] = longestSubstr[i-1] + 1;
				}
			}
		}
		
		int maxLength = 0;
		for(int i = 0; i < len; i++) {
			
			if(longestSubstr[i] > maxLength) {
				maxLength = longestSubstr[i];
			}
		}
		return maxLength;
	}
}
