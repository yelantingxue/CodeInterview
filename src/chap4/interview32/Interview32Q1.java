package chap4.interview32;

import java.util.LinkedList;
import java.util.Queue;

public class Interview32Q1 {

	public static void printBinaryFromTopToBottom(Interv32TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Queue<Interv32TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		Interv32TreeNode tmp;
		while(!queue.isEmpty()) {
			tmp = queue.poll();
			
			if(tmp.left != null) {
				queue.add(tmp.left);
			}
			
			if(tmp.right != null) {
				queue.add(tmp.right);
			}
			System.out.print(tmp.value + " ");
		}
	}
}
