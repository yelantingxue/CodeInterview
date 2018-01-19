package chap2.interview32;

import java.util.LinkedList;
import java.util.Queue;

public class Interview32Q2 {

	public static void printBinaryTree(Interv32TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Queue<Interv32TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		int nodeNumsOfNextLevel = 1;
		int nodeToBePrinted = 1;
		Interv32TreeNode tmp;
		
		while(!queue.isEmpty()) {
			
			nodeNumsOfNextLevel = 0;
			
			while(nodeToBePrinted > 0) {
				
				tmp = queue.poll();
				System.out.print(tmp.value + " ");
				nodeToBePrinted--;
				
				if(tmp.left != null) {
					queue.add(tmp.left);
					nodeNumsOfNextLevel++;
				}
				
				if(tmp.right != null) {
					queue.add(tmp.right);
					nodeNumsOfNextLevel++;
				}
			}
			
			System.out.println();
			
			nodeToBePrinted = nodeNumsOfNextLevel;
		}
	}
}
