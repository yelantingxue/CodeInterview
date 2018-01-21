package chap4.interview37;

public class Interv37TreeNode {

	public int value;
	public Interv37TreeNode left;
	public Interv37TreeNode right;
	
	public Interv37TreeNode(int value) {
		super();
		this.value = value;
	}
	
	public static void preOrder(Interv37TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.value + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
