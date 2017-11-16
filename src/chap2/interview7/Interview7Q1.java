package chap2.interview7;

public class Interview7Q1 {
	
	/**
	 * 
	 * @param preOrder: preOrder traversal array.
	 * @param inOrder: inOrder traversal array.
	 * @return
	 */
	public static Interview7BinaryTree reconstructBT(int[] preOrder, int[] inOrder) 
			throws Exception{
		
		if(preOrder.length == 0 || inOrder.length == 0 
				|| preOrder.length != inOrder.length) {
			return null;
		}
		
		return reconstructBinTree(preOrder, inOrder, preOrder.length, 0, 0);
		
	}
	
	/**
	 * 
	 * @param preOrder: preOrder traversal array.
	 * @param inOrder: inOrder traversal array.
	 * @param len: node numbers of this subtree, 
	 * 				also corresponding length in preOrder traversal array and inOrder traversal array.
	 * @param preStart: the start position of this subtree in preOrder traversal array.
	 * @param inStart: the start position of this subtree in inOrder traversal array.
	 * @return
	 */
	public static Interview7BinaryTree reconstructBinTree(int[] preOrder, int[] inOrder, 
			int len, int preStart, int inStart) throws Exception{
		
		if(len <= 0) {
			return null;
		}
		
		//new a root node according to preOrder array
		Interview7BinaryTree root = new Interview7BinaryTree(preOrder[preStart]);
		
		//Find the position of root node in inOrder array.
		//Finding starts from inStart.
		//i: the offset relative to preStart
		int i = 0;
		while(i<len && inOrder[inStart + i] != root.value) {
			i++;
		}
		
		//Cannot find root node in inOrder array in specified length,
		//which means that the preOrder array doesn't match inOrder array.
		if(i >= len) {
			//return null;
			throw new Exception("Invalid input.");
		}
		
		//get the length of left and right subtree
		int leftLen = i;
		int rightLen = len-leftLen-1;
		
		//construct left and right subtree recursively
		root.left = reconstructBinTree(preOrder, inOrder, leftLen, preStart+1, inStart+i-leftLen);
		root.right = reconstructBinTree(preOrder, inOrder, rightLen, preStart+leftLen+1, inStart+i+1);
		
		return root;
	}

}
