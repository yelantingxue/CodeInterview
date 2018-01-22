package chap4.interview38;

import java.util.Stack;

public class Interview38Q2 {

	/**
	 * Print the combination of the characters in the str.
	 * @param str
	 */
	public static void stringCombination(String str) {
		
		if(str == null || str.length() == 0) {
			return;
		}
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 1; i <= str.length(); i++) {
			
			combinationCore(str, 0, i, stack);
		}
	}
	
	private static void combinationCore(String str, int index, int numOfChar, Stack<Character> stack) {
		
		//There are numOfChar characters in the str from the index to the end of str.
		//And we need to select numOfChar characrers in these characters.
		//So only one situation left.
		if(numOfChar == str.length()-index) {
			
			if(!stack.empty()) {
				for(Character ch : stack) {
					System.out.print(ch);
				}
			}
			System.out.print(str.substring(index));
			System.out.println();
			return;
		}
		
		//We need to select 0 characters from the rest of the characters.
		//That is to say, the characters in the stack can fulfill requirement.
		//So just print the characters in the stack.
		if(numOfChar == 0) {
			for(Character ch : stack) {
				System.out.print(ch);
			}
			System.out.println();
			return;
		}
		
		combinationCore(str, index+1, numOfChar, stack);
		
		stack.push(str.charAt(index));
		combinationCore(str, index+1, numOfChar-1, stack);
		stack.pop();
	}
}
