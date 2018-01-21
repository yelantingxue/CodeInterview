package chap4.interview38;

public class Interview38Q1 {

	public static void stringPermutation(String str) {
		
		if(str == null || str.length() == 0) {
			return;
		}
		
		char[] strCharArray = str.toCharArray();
		permutationCore(strCharArray, 0);
	}
	
	private static void permutationCore(char[] array, int index) {
		
		if(index >= array.length-1) {
			System.out.println(String.valueOf(array));
			return;
		}
		
		for(int i = index; i < array.length; i++) {
			
			exchangeChar(array, index, i);
			permutationCore(array, index+1);
			exchangeChar(array, index, i);
		}
		
	}
	
	private static void exchangeChar(char[] array, int index1, int index2) {
		
		if(index1 >= array.length || index2 >= array.length) {
			return;
		}
		
		char tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
}
