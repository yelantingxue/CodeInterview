package chap6.interview54;

public class Interview54 {

	public static Interv54TreeNode kthNode(Interv54TreeNode head, int k) {
		
		if(head == null || k <= 0) {
			return null;
		}
		
		int[] a = new int[1];
		a[0] = k;
		return inOrder(head, a);
	}
	
	private static Interv54TreeNode inOrder(Interv54TreeNode head, int[] k) {
		
		Interv54TreeNode target = null;
		
		if(head.left != null) {
			target = inOrder(head.left, k);
		}
		
		if(target == null) {
			
			if(k[0] == 1) {
				target = head;
			}
			
			--k[0];
		}
		
		if(target == null && head.right != null) {
			target = inOrder(head.right, k);
		}
		
		return target;
	}
}
