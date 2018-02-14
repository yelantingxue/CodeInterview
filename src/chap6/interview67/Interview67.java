package chap6.interview67;

public class Interview67 {

	public static int strToInt(String str) throws Exception{
		
		String expMessage = "Invalid Input.";
		if(str == null || str.length() == 0) {
			throw new Exception(expMessage);
		}
		
		int len = str.length();
		if(len == 1 && (str == "+" || str == "-")) {
			throw new Exception(expMessage);
		}
		
		long result = 0;
		int flag = 1;
		
		char ch = str.charAt(0);
		if(ch == '+') {
			flag = 1;
		}else if(ch == '-') {
			flag = -1;
		}else if(ch >= '0' && ch <= '9') {
			result += ch - '0';
		}else {
			throw new Exception(expMessage);
		}
		
		for(int i = 1; i < len; i++) {
			
			char c = str.charAt(i);
			
			if(c >= '0' && c <= '9') {
				result = result * 10 + (c - '0');
				
				if(flag == -1 && result * flag < 0x80000000 
						|| flag == 1 && result > 0x7fffffff) {
					
					throw new StackOverflowError(expMessage);
				}
			}else {
				throw new Exception(expMessage);
			}
		}
		
		return (int)result * flag;
	}
}
