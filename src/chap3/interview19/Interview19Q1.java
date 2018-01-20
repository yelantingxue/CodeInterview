package chap3.interview19;

public class Interview19Q1 {

	public static boolean isMatch(String str, String pattern) {

		if (str.isEmpty() && pattern.isEmpty()) {
			return true;
		}

		if (pattern.length() > 1 && pattern.charAt(1) == '*') {

			if (!str.isEmpty() && (pattern.charAt(0) == '.' || str.charAt(0) == pattern.charAt(0))) {
				
				return isMatch(str.substring(1), pattern.substring(2)) || isMatch(str.substring(1), pattern)
						|| isMatch(str, pattern.substring(2));
			} else {
				return isMatch(str, pattern.substring(2));
			}
		}

		if (pattern.length() <= 1 || pattern.charAt(1) != '*') {

			if ((str.isEmpty() || pattern.isEmpty()) 
					|| (str.charAt(0) != pattern.charAt(0) && pattern.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(str.substring(1), pattern.substring(1));
			}
		}

		return false;
	}
	
	public static boolean isMatchDP(String str, String pattern) {
		
		int m = str.length();
		int n = pattern.length();
		
		if(pattern == null) {
			return str.isEmpty();
		}
		
		boolean[][] match = new boolean[m+1][n+1];
		
		match[0][0] = true;
		for(int i = 1; i <= m; i++) {
			match[i][0] = false;
		}
		
		for(int j = 1; j <= n; j++) {
			match[0][j] = (j > 1) && (pattern.charAt(j-1) == '*') && (match[0][j-2]);
		}
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				
				if(pattern.charAt(j-1) != '*') {
					match[i][j] = match[i-1][j-1] 
							&& (pattern.charAt(j-1) == str.charAt(i-1) || pattern.charAt(j-1) == '.');
				}else {
					
					match[i][j] = match[i][j-2] 
							|| (pattern.charAt(j-2) == str.charAt(i-1) || pattern.charAt(j-2) == '.') 
							&& match[i-1][j];
				}
			}
		}
		
		return match[m][n];
	}
}
