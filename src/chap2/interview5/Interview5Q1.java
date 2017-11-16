package chap2.interview5;

public class Interview5Q1 {
	
	public static String replaceBlank(String str) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String[] strArr = str.split(" ");
		if(strArr.length == 1) {
			return str;
		}
		
		String replaceStr = "";
		for(int i = 0; i < strArr.length; i++) {
			if(i != strArr.length - 1) {
				replaceStr = replaceStr + strArr[i] + "%20";
			}else {
				replaceStr += strArr[i];
			}
			
		}
		return replaceStr;
	}
	
	public static void replaceBlank(char[] charArr, int len) {
		
		if(charArr.length == 0) {
			return;
		}
		
		int spaceNum = 0;
		int originalNum = 0;
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == ' ') {
				spaceNum++;
			}
			
			if(charArr[i] != '\u0000') {
				originalNum++;
			}
		}
		
		int newLen = originalNum + spaceNum * 2;
		if(newLen > len) {
			return;
		}
		
		int p1 = originalNum - 1;
		int p2 = newLen-1;
		
		while(p1 < p2) {
			if(charArr[p1] != ' ') {
				charArr[p2] = charArr[p1];
				p1--;
				p2--;
			}else {
				charArr[p2--] = '0';
				charArr[p2--] = '2';
				charArr[p2--] = '%';
				p1--;
			}
		}
	}
}
