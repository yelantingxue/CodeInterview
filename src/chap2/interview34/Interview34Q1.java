package chap2.interview34;

import java.util.Stack;

public class Interview34Q1 {

	public static void findPath(Interv34TreeNode root, int sum) {
		
		if(root == null) {
			return;
		}
		
		Stack<Interv34TreeNode> path = new Stack<>();
		
		findPathCore(root, sum, path, 0);
	}
	
	private static void findPathCore(Interv34TreeNode root, int sum, 
			Stack<Interv34TreeNode> path, int sumOfCurrentPath) {
		
		path.push(root);
		sumOfCurrentPath += root.value;
		
		boolean isLeaf = (root.left == null) && (root.right == null);
		if(isLeaf && sumOfCurrentPath == sum) {
			
			for(Interv34TreeNode node : path) {
				System.out.print(node.value + " ");
			}
			System.out.println();
		}
		
		if(root.left != null) {
			findPathCore(root.left, sum, path, sumOfCurrentPath);
		}
		
		if(root.right != null) {
			findPathCore(root.right, sum, path, sumOfCurrentPath);
		}
		
		path.pop();
		
	}
}
