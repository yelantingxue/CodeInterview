package chap5.interview40;

import java.util.Random;

public class Interview40Q1S1 {

	public static void getLeastNumbers(int[] number, int k) {
		
		if(number == null || number.length == 0 
				|| k == 0 || number.length < k) {
			return;
		}
		
		int len = number.length;
		
		if(len == k) {
			for(int i = 0; i < len; i++) {
				System.out.println(number[i]);
			}
		}
		
		int start = 0;
		int end = len-1;
		int index = partition(number, start, end);
		
		while(index != k) {
			
			if(index < k) {
				
				start = index+1;
				index = partition(number, start, end);
			}else {
				end = index-1;
				index = partition(number, start, end);
			}
		}
		
		for(int i = 0; i < k; i++) {
			System.out.println(number[i]);
		}
		
	}
	
	private static int partition(int[] number, int start, int end) {
		
		Random random = new Random();
		int a = random.nextInt(end+1-start) + start;
		
		int val = number[a];
		
		swap(number, start, a);
		
		int i = start;
		int j = end+1;
		
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
	
	private static void swap(int[] number, int start, int end) {
		
		if(start == end) {
			return;
		}
		
		int tmp = number[start];
		number[start] = number[end];
		number[end] = tmp;
	}
}
