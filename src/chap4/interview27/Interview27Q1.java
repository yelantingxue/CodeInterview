package chap4.interview27;

public class Interview27Q1 {

	public static void mirrorBinaryTree(Interv27TreeNode root) {
		
		if(root == null || root.left == null && root.right == null) {
			return;
		}
		
		Interv27TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;
		
		if(root.left != null) {
			mirrorBinaryTree(root.left);
		}
		
		if(root.right != null) {
			mirrorBinaryTree(root.right);
		}
	}
}
