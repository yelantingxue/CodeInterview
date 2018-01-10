package chap2.interview7;

import java.util.List;

import org.junit.Test;

public class Interview7Q1Test {

	/**
	 * General binary tree.
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		
		int[] preOrder = { 1, 2, 4, 7, 3, 5, 6, 8 };

		int[] inOrder = { 4, 7, 2, 1, 5, 3, 8, 6 };

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
	
	/**
	 * All nodes don't have right sub-tree in a binary tree.
	 * @throws Exception 
	 */
	@Test
	public void test2() throws Exception {
		
		int[] preOrder = { 1, 2, 3, 4, 5 };

		int[] inOrder = { 5, 4, 3, 2, 1 };

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
	
	/**
	 * All nodes don't have left sub-tree in a binary tree.
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception {
		
		int[] preOrder = { 1, 2, 3, 4, 5 };

		int[] inOrder = { 1, 2, 3, 4, 5 };

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
	
	/**
	 * The binary tree contains only one node.
	 * @throws Exception 
	 */
	@Test
	public void test4() throws Exception {
		
		int[] preOrder = { 1 };

		int[] inOrder = { 1 };

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
	
	/**
	 * Complete binary tree.
	 * @throws Exception 
	 */
	@Test
	public void test5() throws Exception {
		
		int[] preOrder = {1, 2, 4, 5, 3, 6, 7};

		int[] inOrder = {4, 2, 5, 1, 6, 3, 7};

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
	
	/**
	 * The binary tree is empty.
	 * @throws Exception 
	 */
	@Test
	public void test6() throws Exception {
		
		int[] preOrder = {};

		int[] inOrder = {};

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
	
	/**
	 * The pre-order list and the in-order list don't match.
	 * @throws Exception 
	 */
	@Test
	public void test7() throws Exception {
		
		int[] preOrder = {1, 2, 4, 5, 3, 6, 7};

		int[] inOrder = {4, 2, 8, 1, 6, 3, 7};

		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);

		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);

		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);

		for (int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}

		System.out.println();

		for (int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}
}
