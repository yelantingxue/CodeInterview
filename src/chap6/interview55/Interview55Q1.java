package chap6.interview55;

public class Interview55Q1 {

	public static int treeDepth(Interv55TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftDepth = treeDepth(root.left);
		int rightDepth = treeDepth(root.right);
		
		return Math.max(leftDepth, rightDepth) + 1;
	}
}
