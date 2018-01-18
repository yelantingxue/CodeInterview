package chap2.interview28;

public class Interview28Q1 {

	public static boolean isSymmetrical(Interv28TreeNode root) {
		
		if(root == null) {
			return true;
		}
		
		if(root.left == null && root.right == null) {
			return true;
		}
		
		if(root.left == null || root.right == null) {
			return false;
		}
		
		return isSymmetricalCore(root.left, root.right);
	}
	
	private static boolean isSymmetricalCore(Interv28TreeNode root1, Interv28TreeNode root2) {
		
		if(root1 == null && root2 == null) {
			return true;
		}
		
		if(root1 == null || root2 == null) {
			return false;
		}
		
		if(root1.value == root2.value) {
			return isSymmetricalCore(root1.left, root2.right) && isSymmetricalCore(root1.right, root2.left);
		}else {
			return false;
		}
	}
}
