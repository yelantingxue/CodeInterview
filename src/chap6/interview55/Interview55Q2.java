package chap6.interview55;

public class Interview55Q2 {

	public static boolean isBalanced(Interv55TreeNode root) {
		
		if(root == null) {
			return true;
		}
		
		int[] depth = new int[1];
		
		return isBalancedCore(root, depth);
	}
	
	private static boolean isBalancedCore(Interv55TreeNode root, int[] depth) {
		
		if(root == null) {
			depth[0] = 0;
			return true;
		}
		
		int[] left = new int[1];
		int[] right = new int[1];
		
		if(isBalancedCore(root.left, left) 
				&& isBalancedCore(root.right, right)) {
			
			depth[0] = Math.max(left[0], right[0])+1;
			
			if(Math.abs(left[0] - right[0]) <= 1) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
