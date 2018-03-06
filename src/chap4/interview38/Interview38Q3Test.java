package chap4.interview38;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Interview38Q3Test {

	@Test
	public void test1() {
		
		int[] nums = {1,2,3,4,5,6,7,8};
		List<List<Integer>> result = Interview38Q3.pointsOfSquare(nums);
		
		if(result != null && !result.isEmpty()) {
			for(List<Integer> list : result) {
				for(Integer i : list) {
					System.out.print(i + " ");
				}
				
				System.out.println();
			}
			System.out.println(result.size());
		}else {
			System.out.println("No satisfactory permutation.");
		}
		
	}
}
