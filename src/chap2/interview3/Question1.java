package chap2.interview3;

import java.util.Arrays;

public class Question1 {
	
	public static boolean repeatedNumber1(int [] a) {
		
		if(a.length == 0) {
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]<0 || a[i] >= a.length) {
				return false;
			}
		}
		
		int i = 0;
		while(i < a.length) {
			if(a[i] == i) {
				i++;
				continue;
			}else {
				int m = a[i];
				if(a[m] == m) {
					return true;
				}else {
					a[i] = a[m];
					a[m] = m;
				}
			}
		}
		
		return false;
	}

	public static boolean repeatedNumber2(int[] a) {
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++) {
			if(a[i] != i) {
				return true;
			}
		}
		return false;
	}

}
