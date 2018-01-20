package chap4.interview32;

import java.util.Stack;

public class Interview32Q3 {

	public static void printBinaryTreeZigzag(Interv32TreeNode root){
		
		if(root == null) {
			return;
		}
		
		Stack<Interv32TreeNode> stack1 = new Stack<>();
		Stack<Interv32TreeNode> stack2 = new Stack<>();
		
		stack1.add(root);
		
		Interv32TreeNode tmp;
		
		while(!(stack1.empty() && stack2.empty())) {
			
			while(!stack1.empty()) {
				
				tmp = stack1.pop();
				System.out.print(tmp.value + " ");
				
				//In stack1, always first left then right.
				if(tmp.left != null) {
					stack2.push(tmp.left);
				}
				
				if(tmp.right != null) {
					stack2.push(tmp.right);
				}
			}
			
			System.out.println();
			
			while(!stack2.empty()) {
				
				tmp = stack2.pop();
				System.out.print(tmp.value + " ");
				
				//In stack2, always first right then left;
				if(tmp.right != null) {
					stack1.push(tmp.right);
				}
				
				if(tmp.left != null) {
					stack1.push(tmp.left);
				}
			}
			
			System.out.println();
		}
	}
}
