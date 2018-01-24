package chap5.interview40;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Interview40Q1S2 {

	public static void getLeastNumbers(int[] number, int k) {
		
		if(number == null || k < 1 || number.length < k) {
			return;
		}
		
		//Use a TreeMap to store the k least numbers.
		//Keys are the numbers in the array, values are times repeated in the treeMap.
		//Because there may be repeated numbers in array number, so there also may be 
		//repeated keys in treeMap.
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		
		for(int i = 0; i < number.length; i++) {
			
			int sum = 0;
			Iterator iter = treeMap.entrySet().iterator();
			
			//Traverse treeMap and find how many numbers in the treeMap, 
			//including repeated numbers. 
			//sum is the number of elements in treeMap.
			while(iter.hasNext()) {
				Map.Entry entry = (Map.Entry) iter.next();
				sum += (int)entry.getValue();
			}
			
			if(sum < k) {
				//The number of keys in the treeMap is less than k.
				
				Integer value = treeMap.get(number[i]);
				int times;
				if(value != null) {
					
					//treeMap has already included number[i].
					times = value;
				}else {
					//treeMap doesn't include number[i].
					times = 0;
				}
				treeMap.put(number[i], times+1);
				
			}else {
				
				int largestKey = treeMap.lastKey();
				if(largestKey > number[i]) {
					//The largest key in the treeMap is larger than number[i].
					//So we should reduce the value of the largest key by one.
					
					if(treeMap.get(largestKey) > 1) {
						
						//reduce the value of the largest key by one.
						treeMap.put(largestKey, treeMap.get(largestKey)-1);
						
						//Whether number[i] is already included in the treeMap.
						if(treeMap.get(number[i]) != null) {
							treeMap.put(number[i], treeMap.get(number[i])+1);
						}else {
							treeMap.put(number[i], 1);
						}
					}else {
						
						treeMap.remove(largestKey);
						if(treeMap.get(number[i]) != null) {
							treeMap.put(number[i], treeMap.get(number[i])+1);
						}else {
							treeMap.put(number[i], 1);
						}
					}
				}
			}
		}
		
		//Traverse the whole treeMap and print every keys.
		Iterator iter = treeMap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			
			for(int i = 0; i < (int)entry.getValue(); i++) {
				System.out.println(entry.getKey());
			}
		}
	}
}
