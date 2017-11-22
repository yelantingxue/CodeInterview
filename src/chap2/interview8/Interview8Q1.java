package chap2.interview8;

public class Interview8Q1 {
	
	public static Interview8BinaryTree getNext(Interview8BinaryTree node) {
		
		Interview8BinaryTree result;
		
		if(node == null) {
			return null;
		}
		
		/**
		 * 1. If node has right subtree, we are supposed to
		 * find the lestmost node in its right subtree and return.
		 */
		if(node.right != null) {
			result = node.right;
			while(result.left != null) {
				result = result.left;
			}
		}else {
			
			/**
			 * 2. node doesn't have right subtree.
			 * (1) node is the left node of its parent, return its parent.
			 * (2) node is the right node of its parent.
			 */
			Interview8BinaryTree currentNode = node;
			while(currentNode.parent != null && currentNode.parent.left != currentNode) {
				currentNode = currentNode.parent;
			}
			
			if(currentNode.parent == null) {
				result = null;
			}
			result = currentNode.parent;
		}
		
		return result;
	}
}
