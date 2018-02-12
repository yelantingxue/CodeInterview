package chap6.interview59;

import java.util.ArrayDeque;
import java.util.Deque;

public class Interview59Q1 {

	public static int[] maxNumsInWindow(int[] numbers, int sizeOfWindow){
		
		if(numbers == null || numbers.length == 0 
				|| sizeOfWindow <= 0 || numbers.length < sizeOfWindow) {
			return null;
		}
		
		int len = numbers.length;
		
		int[] result = new int[len - sizeOfWindow + 1];
		
		Deque<Integer> numIndex = new ArrayDeque<>();
		
		for(int i = 0; i < len; i++) {
			
			while(!numIndex.isEmpty() && numbers[i] > numbers[numIndex.getLast()]) {
				numIndex.removeLast();
			}
			
			if(!numIndex.isEmpty() && numIndex.getFirst() <= i - sizeOfWindow) {
				numIndex.removeFirst();
			}
			
			numIndex.add(i);
			
			if(i - sizeOfWindow + 1 >= 0) {
				result[i - sizeOfWindow + 1] = numbers[numIndex.getFirst()];
			}
		}
		
		return result;
	}
}
