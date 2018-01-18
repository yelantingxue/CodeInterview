package chap2.interview27;

import java.util.ArrayList;
import java.util.List;

public class Interv27TreeNode {

	public int value;
	
	public Interv27TreeNode left;
	
	public Interv27TreeNode right;
	
	List<Interv27TreeNode> preList = new ArrayList<>();

	public Interv27TreeNode(int value) {
		super();
		this.value = value;
	}
	
	public static void preOrder(Interv27TreeNode root, List<Interv27TreeNode> preList){
		
		if(root == null) {
			return;
		}else {
			preList.add(root);
		}
		
		preOrder(root.left, preList);
		preOrder(root.right, preList);
	}
	
	public static void inOrder(Interv27TreeNode root, List<Interv27TreeNode> inList) {
		
		if(root == null) {
			return;
		}
		
		inOrder(root.left, inList);
		inList.add(root);
		inOrder(root.right, inList);
	}
}
