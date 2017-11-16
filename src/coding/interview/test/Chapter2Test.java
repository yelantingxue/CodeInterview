package coding.interview.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;

import chap2.interview3.Question1;
import chap2.interview3.Question2;
import chap2.interview5.Interview5Q1;
import chap2.interview6.Interview6Node;
import chap2.interview6.Interview6Q1;
import chap2.interview7.Interview7BinaryTree;
import chap2.interview7.Interview7Q1;
import junit.framework.TestCase;

public class Chapter2Test{
	
	@Test
	public void Question1Test() {
		Random random = new Random();
		
		int[] a = new int[100000000];
		a = random.ints(100000000, 0, 100000000).toArray();
		
		int[] b = new int[100000000];
		
		System.arraycopy(a, 0, b, 0, 100000000);
		
		double repeated1Start = System.currentTimeMillis();
		Question1.repeatedNumber1(a);
		double repeated1End = System.currentTimeMillis();
		double repeated1Time = repeated1End - repeated1Start;
		
		//int[] b = {2,3,1,0,4,5,8};
		double repeated2Start = System.currentTimeMillis();
		Question1.repeatedNumber2(b);
		double repeated2End = System.currentTimeMillis();
		double repeated2Time = repeated2End - repeated2Start;
		
		System.out.println(repeated1Time);
		System.out.println(repeated2Time);
	}

	@Test
	public void Questin2Test() {
		int[] a = {2,2,5,4,3,5,7,6};
		System.out.println(Question2.repeatedNumber(a));
	}
	
	@Test
	public void inter4Ques1Test() {
		int[][] a = {{1,2,8,9},
					{2,4,9,12},
					{4,7,10,13},
					{6,8,11,15}};
		int[][] b = {{}};
		System.out.println(chap2.interview4.Question1.findIn2DMatrix(a, 20));
	}
	
	@Test
	public void inter5Q1Test() {
		String a = " ";
		char[] b = a.toCharArray();
		char[] c = new char[30];
		for(int i = 0; i < b.length; i++) {
			c[i] = b[i];
		}
		Interview5Q1.replaceBlank(c, 30);
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	@Test
	public void inter6Q1Test() {
		
		Interview6Node node1 = new Interview6Node(2);
		Interview6Node node2 = new Interview6Node(0);
		Interview6Node node3 = new Interview6Node(1);
		Interview6Node node4 = new Interview6Node(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		Interview6Q1.printListInReversedOrder(node1);
	}
	
	@Test
	public void inter7Q1Test() throws Exception {
		
		int[] preOrder = {1,2,4,7,3,5,6,8};
		
		int[] inOrder = {4,7,2,1,5,3,8,6};
		
		Interview7BinaryTree tree = Interview7Q1.reconstructBT(preOrder, inOrder);
		
		List<Interview7BinaryTree> preList = Interview7BinaryTree.preTraverse(tree);
		
		List<Interview7BinaryTree> inList = Interview7BinaryTree.inTraverse(tree);
		
		for(int i = 0; i < preList.size(); i++) {
			System.out.print(preList.get(i).value + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < inList.size(); i++) {
			System.out.print(inList.get(i).value + ", ");
		}
		
	}

}
