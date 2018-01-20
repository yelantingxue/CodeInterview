package chap4.interview36;

public class Interview36Q1 {

	public static Interv36TreeNode convertTreeToList(Interv36TreeNode root) {
		
		if(root == null) {
			return null;
		}
		
		Interv36TreeNode lastNode = null;
		
		lastNode = convertCore(root, lastNode);
		
		while(lastNode.left != null) {
			lastNode = lastNode.left;
		}
		return lastNode;
	}
	
	private static Interv36TreeNode convertCore(Interv36TreeNode root, Interv36TreeNode lastNode) {
		
		if(root.left != null) {
			 lastNode = convertCore(root.left, lastNode);
		}
		
		Interv36TreeNode curNode = lastNode;
		lastNode = root;
		lastNode.left = curNode;
		if(curNode != null) {
			curNode.right = lastNode;
		}
		
		if(root.right != null) {
			lastNode = convertCore(root.right, lastNode);
		}
		
		return lastNode;
	}
}
