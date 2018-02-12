package chap6.interview58;

public class Interview58Q1S1 {

	public static void reverseSentence(String sentence) {
		
		if(sentence == null || sentence.length() == 0) {
			return;
		}
		
		if(sentence.length() == 1) {
			System.out.println(sentence);
			return;
		}
		
		String[] words = sentence.split(" ");
		for(int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
