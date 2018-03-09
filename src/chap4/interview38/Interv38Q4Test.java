package chap4.interview38;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Interv38Q4Test {

	@Test
	public void test1() {
		List<List<String>> result = Interview38Q4.solveNQueens(4);
		for(int i = 0; i < result.size(); i++) {
			
			List<String> list = result.get(i);
			for(int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
			
			System.out.println();
		}
	}
}
