package chap3.interview26;

import org.junit.Test;

public class Interv26Q1Test {

	@Test
	public void test1() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(7);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode6 = new Interv26TreeNode(4);
		Interv26TreeNode treeNode7 = new Interv26TreeNode(7);
		
		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;
		treeNode5.left = treeNode6;
		treeNode5.right = treeNode7;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(2);
		
		treeNode8.left = treeNode9;
		treeNode8.right = treeNode10;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test2() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(7);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(3);
		Interv26TreeNode treeNode6 = new Interv26TreeNode(4);
		Interv26TreeNode treeNode7 = new Interv26TreeNode(7);
		
		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;
		treeNode5.left = treeNode6;
		treeNode5.right = treeNode7;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(2);
		
		treeNode8.left = treeNode9;
		treeNode8.right = treeNode10;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test3() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(5);
		
		treeNode1.left = treeNode2;
		treeNode2.left = treeNode3;
		treeNode3.left = treeNode4;
		treeNode4.left = treeNode5;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(2);
		
		treeNode8.left = treeNode9;
		treeNode9.left = treeNode10;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test4() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(5);
		
		treeNode1.left = treeNode2;
		treeNode2.left = treeNode3;
		treeNode3.left = treeNode4;
		treeNode4.left = treeNode5;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(3);
		
		treeNode8.left = treeNode9;
		treeNode9.left = treeNode10;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test5() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(5);
		
		treeNode1.right = treeNode2;
		treeNode2.right = treeNode3;
		treeNode3.right = treeNode4;
		treeNode4.right = treeNode5;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(2);
		
		treeNode8.right = treeNode9;
		treeNode9.right = treeNode10;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test6() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(5);
		
		treeNode1.right = treeNode2;
		treeNode2.right = treeNode3;
		treeNode3.right = treeNode4;
		treeNode4.right = treeNode5;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode11 = new Interv26TreeNode(3);
		
		treeNode8.right = treeNode9;
		treeNode9.right = treeNode10;
		treeNode9.left = treeNode11;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test7() {
		
		Interv26TreeNode treeNode1 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode2 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode3 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode4 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode5 = new Interv26TreeNode(5);
		
		treeNode1.right = treeNode2;
		treeNode2.right = treeNode3;
		treeNode3.right = treeNode4;
		treeNode4.right = treeNode5;
		
		Interv26TreeNode treeNode8 = null;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test8() {
		
		Interv26TreeNode treeNode1 = null;
		
		Interv26TreeNode treeNode8 = new Interv26TreeNode(8);
		Interv26TreeNode treeNode9 = new Interv26TreeNode(9);
		Interv26TreeNode treeNode10 = new Interv26TreeNode(2);
		Interv26TreeNode treeNode11 = new Interv26TreeNode(3);
		
		treeNode8.right = treeNode9;
		treeNode9.right = treeNode10;
		treeNode9.left = treeNode11;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
	
	@Test
	public void test9() {
		
		Interv26TreeNode treeNode1 = null;
		
		Interv26TreeNode treeNode8 = null;
		
		System.out.println(Interview26Q1.hasSubTree(treeNode1, treeNode8));
	}
}
