package chap5.interview39;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Interview39Q1S1 {

	public static int moreThanHalfNum(int[] number) {
		
		if(number == null || number.length == 0) {
			return 0;
		}
		
		if(number.length == 1) {
			return number[0];
		}
		
		int len = number.length;
		int start = 0;
		int end = len - 1;
		int middle = len/2;
		
		int index = partition(number, start, end);
		
		while(index != middle) {
			
			if(index < middle) {
				start = index + 1;
				index = partition(number, start, end);
			}else {
				end = index-1;
				index = partition(number, start, end);
			}
		}
		
		if(!ifMoreThanHalf(number, index)) {
			return 0;
		}
		
		return number[index];
	}
	
	private static int partition(int[] number, int start, int end) {
		
		if(start == end) {
			return start;
		}
		
		Random random = new Random();
		int a = random.nextInt(end - start) + start;
		
		swap(number, start, a);
		
		int i = start;
		int j = end+1;
		
		int val = number[start];
		
		while(true) {
			
			while(number[++i] < val) {
				if(i >= end) {
					break;
				}
			}
			
			while(number[--j] > val) {
				if(j <= start) {
					break;
				}
			}
			
			if(i >= j) {
				break;
			}
			
			swap(number, i, j);
		}
		
		swap(number, start, j);
		
		return j;
	}
	
	private static void swap(int[] number, int i, int j) {
		
		int tmp = number[i];
		number[i] = number[j];
		number[j] = tmp;
	}
	
	private static boolean ifMoreThanHalf(int[] number, int index) {
		
		int num = number[index];
		int count = 0;
		for(int i = 0; i < number.length; i++) {
			if(number[i] == num) {
				count++;
			}
		}
		
		if(count > number.length/2) {
			return true;
		}else {
			return false;
		}
	}
}
