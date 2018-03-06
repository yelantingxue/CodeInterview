package chap4.interview38;

import java.util.ArrayList;
import java.util.List;

public class Interview38Q3 {

	/**
	 * Input an array containing 8 numbers, judge whether it is possible to 
	 * place the 8 numbers to the 8 vertices, so that the sum of 
	 * the four vertices on the opposite sides of the cube is equal.
	 * 
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> pointsOfSquare(int[] nums){
		
		if(nums == null || nums.length != 8) {
			return null;
		}
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		permuteCore(nums, 0, result, list);
		return result;
	}
	
	private static void permuteCore(int[] nums, int index, 
			List<List<Integer>> result, List<Integer> list) {
		
		if(index == nums.length - 1) {
			list.add(nums[index]);
			
			if(isRequired(list)) {
				result.add(new ArrayList<>(list));
			}
			
			list.remove(list.size()-1);
			
			return;
		}
		
		for(int i = index; i < nums.length; i++) {
			
			int tmp = nums[index];
			nums[index] = nums[i];
			nums[i] = tmp;
			
			list.add(nums[index]);
			permuteCore(nums, index+1, result, list);
			list.remove(list.size() - 1);
			
			tmp = nums[index];
			nums[index] = nums[i];
			nums[i] = tmp;
		}
	}
	
	private static boolean isRequired(List<Integer> list) {
		
		if(list.size() != 8) {
			return false;
		}
		
		int l1 = list.get(0) + list.get(1) + list.get(2) + list.get(3);
		int r1 = list.get(4) + list.get(5) + list.get(6) + list.get(7);
		
		int l2 = list.get(0) + list.get(2) + list.get(4) + list.get(6);
		int r2 = list.get(1) + list.get(3) + list.get(5) + list.get(7);
		
		int l3 = list.get(0) + list.get(1) + list.get(4) + list.get(5);
		int r3 = list.get(2) + list.get(3) + list.get(6) + list.get(7);
		
		if(l1 == r1 && l2 == r2 && l3 == r3) {
			return true;
		}else {
			return false;
		}
	}
}
