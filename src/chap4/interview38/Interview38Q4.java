package chap4.interview38;

import java.util.ArrayList;
import java.util.List;

/**
 * N-Queens question.
 * Corresponsing to question 51 in LeetCode.
 * This code is not accepted because exceed time limit. 
 * But can output correct solution and may be accepted after modifying. 
 * @author dell
 *
 */
public class Interview38Q4 {

	public static List<List<String>> solveNQueens(int n) {

		List<List<Integer>> tempResult = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i;
		}

		permute(nums, 0, tempResult, list);

		List<List<String>> result = new ArrayList<>();

		for (List<Integer> elList : tempResult) {

			result.add(convert(elList, n));
		}

		return result;
	}

	private static void permute(int[] nums, int index, List<List<Integer>> result, List<Integer> list) {

		if (index == nums.length - 1) {
			list.add(nums[index]);

			if (isRequired(list)) {
				result.add(new ArrayList<>(list));
			}

			list.remove(list.size() - 1);
			return;
		}

		for (int i = index; i < nums.length; i++) {

			int tmp = nums[i];
			nums[i] = nums[index];
			nums[index] = tmp;

			list.add(nums[index]);
			permute(nums, index + 1, result, list);
			list.remove(list.size() - 1);

			tmp = nums[i];
			nums[i] = nums[index];
			nums[index] = tmp;
		}
	}

	private static boolean isRequired(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if ((i - j == list.get(i) - list.get(j)) || (j - i == list.get(i) - list.get(j))) {
					return false;
				}
			}
		}

		return true;
	}

	private static List<String> convert(List<Integer> list, int n) {

		List<String> strResult = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			StringBuilder str = new StringBuilder("");

			for (int j = 0; j < n; j++) {

				if (j == list.get(i)) {
					str.append("Q");
				} else {
					str.append(".");
				}
			}

			strResult.add(str.toString());

		}

		return strResult;
	}
}
