package chap2.interview7;

import java.util.ArrayList;
import java.util.List;

public class Interview7BinaryTree {
	
	public int value;
	
	public Interview7BinaryTree left;
	
	public Interview7BinaryTree right;

	public Interview7BinaryTree(int value) {
		super();
		this.value = value;
	}
	
	public static List<Interview7BinaryTree> preTraverse(Interview7BinaryTree root) {
		
		List<Interview7BinaryTree> list = new ArrayList<>();
		
		preTraverse(root, list);
		
		return list;
		
	}
	
	public static void preTraverse(Interview7BinaryTree root, List<Interview7BinaryTree> list) {
		
		if(root == null) {
			return;
		}
		
		list.add(root);
		
		preTraverse(root.left, list);
		
		preTraverse(root.right, list);
	}
	
	public static List<Interview7BinaryTree> inTraverse(Interview7BinaryTree root){
		
		List<Interview7BinaryTree> list = new ArrayList<>();
		
		inTraverse(root, list);
		
		return list;
	}
	
	public static void inTraverse(Interview7BinaryTree root, List<Interview7BinaryTree> list) {
		
		if(root == null) {
			return;
		}
		
		inTraverse(root.left, list);
		list.add(root);
		inTraverse(root.right, list);
	}

}
