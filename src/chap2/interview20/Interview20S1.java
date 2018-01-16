package chap2.interview20;

public class Interview20S1 {

	/**
	 * Solution 1: Complicated solutions.
	 * @param str
	 * @return
	 */
	public static boolean isNumetric(String str) {

		if (str == null || str.isEmpty() || str == "." || str == "e" || str == "E") {
			return false;
		}
		
		//Pay attention to "\\.", should be regular expression.
		String[] pointSplitArray = str.split("\\.");
		
		//More than two "." in the input string.
		if (pointSplitArray.length > 2 
				|| (pointSplitArray.length == 2 && str.charAt(str.length()-1) == '.')) {
			return false;
		}
		
		String[] eSplitArray = str.split("[Ee]");
		
		//More than two "e" or "E" in the input string.
		if(eSplitArray.length > 2 
				|| (eSplitArray.length == 2 
						&& (str.charAt(str.length()-1) == 'e' || str.charAt(str.length()-1) == 'E'))) {
			return false;
		}

		boolean numetric = false;
		
		String[] pointESplitArray;
		
		boolean hasPoint = false;
		
		//String that 'e' or 'E' may locate.
		String eStr;

		if(pointSplitArray.length > 1) {
			//There is a "." in the input string and "." is not at the end.
			
			hasPoint = true;
			
			numetric = scanInteger(pointSplitArray[0], true);
			pointESplitArray = pointSplitArray[1].split("[Ee]");
			eStr = pointSplitArray[1];
		
		}else {
			//Input string don't have ".", or "." is at the end of the input string.
			
			//"." is the last char in the input string.
			if(str.charAt(str.length()-1) == '.') {
				return scanInteger(pointSplitArray[0], false);
			}
			
			//There is no "." in the input string, 
			//judge if it is a pure number(doesn't contain 'e' or other character).
			boolean isPureNumber = scanInteger(str, true);
			if(isPureNumber) {
				return isPureNumber;
			}
			
			//Input string doesn't contain ".", but contains other character.
			pointESplitArray = pointSplitArray[0].split("[Ee]");
			eStr = pointSplitArray[0];
		}
		
		
		if(pointESplitArray.length > 1) {
			//Input string contains a "e" or "E", and they are not the last char.
			
			//Whether we should consider "numetric", according to if we judge the number before ".".
			if(hasPoint) {
				numetric = numetric && scanInteger(pointESplitArray[0], false) 
									&& scanInteger(pointESplitArray[1], false);
			}else {
				numetric = scanInteger(pointESplitArray[0], false) && scanInteger(pointESplitArray[1], false);
			}
			
		}else {
			//Input string doesn't contain "e" or "E", or they are the last char.
			
			if(str.charAt(eStr.length()-1) == 'e' 
					|| str.charAt(eStr.length()-1) == 'E') {
				return false;
			}
			numetric = numetric && scanInteger(pointESplitArray[0], false);
		}
		
		return numetric;
	}
	
	/**
	 * 
	 * @param str
	 * @param isPoint: For ".", can be empty before "." and after "."; but for "e" or "E", neither.
	 * @return
	 */
	private static boolean scanInteger(String str, boolean isPoint) {
		
		int index = 0;

		if (index >= str.length()) {
			
			if(isPoint) {
				return true;
			}
			return false;
		}

		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			index++;
		}
		return scanUnsignedInteger(str.substring(index), isPoint);
	}
	
	private static boolean scanUnsignedInteger(String str, boolean isPoint) {
		
		int index = 0;

		if (index >= str.length()) {
			
			if(isPoint) {
				return true;
			}
			return false;
		}

		while (index <= str.length() - 1 && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
			index++;
		}
		return index >= str.length();
	}


	/**
	 * Solution 2: Regular Expression match.
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumetricRegExpMatch(String str) {
		return str.matches("[+-]?[0-9]{0,}(\\\\.?[0-9]{1,})?([Ee][+-]?[0-9]{1,})?");
	}
}
