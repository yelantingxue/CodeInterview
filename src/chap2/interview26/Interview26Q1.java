package chap2.interview26;

public class Interview26Q1 {

	public static boolean hasSubTree(Interv26TreeNode tree1, Interv26TreeNode tree2) {
		
		boolean result = false;
		
		if(tree1 != null && tree2 != null) {
			
			if(equals(tree1.value, tree2.value)) {
				result = doTwoTreeSame(tree1, tree2);
			}
			
			if(!result) {
				result = hasSubTree(tree1.left, tree2);
			}
			
			if(!result) {
				result = hasSubTree(tree1.right, tree2);
			}
		}
		
		return result;
	}
	
	private static boolean doTwoTreeSame(Interv26TreeNode tree1, Interv26TreeNode tree2) {
		
		if(tree2 == null) {
			return true;
		}
		
		if(tree1 == null) {
			return false;
		}
		
		if(!equals(tree1.value, tree2.value)) {
			return false;
		}
		
		return doTwoTreeSame(tree1.left, tree2.left) && doTwoTreeSame(tree1.right, tree2.right);
	}
	
	private static boolean equals(double num1, double num2) {
		
		if(Math.abs(num1 - num2) < 0.000001) {
			return true;
		}else {
			return false;
		}
	}
}
