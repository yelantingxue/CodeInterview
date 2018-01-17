package chap2.interview25;

public class Interview25Q1 {

	/**
	 * Solution 1: Recursion by myself, not good.
	 * @param headNode1
	 * @param headNode2
	 * @return
	 */
	public static Interv25Node mergeS1(Interv25Node headNode1, Interv25Node headNode2) {

		if (headNode1 == null) {
			return headNode2;
		}

		if (headNode2 == null) {
			return headNode1;
		}

		Interv25Node newHead;
		Interv25Node pNewNode;

		if (headNode1.value <= headNode2.value) {
			
			newHead = headNode1;
			
			pNewNode = headNode1;
			headNode1 = headNode1.next;
			
		}else {
			
			newHead = headNode2;
			
			pNewNode = headNode2;
			headNode2 = headNode2.next;
		}
		
		if(headNode1 == null && headNode2 == null) {
			return newHead;
		}
		
		mergeCore(headNode1, headNode2, newHead, pNewNode);

		return newHead;
	}

	private static void mergeCore(Interv25Node headNode1, Interv25Node headNode2,
			Interv25Node newHead, Interv25Node pNewNode) {
		
		if(headNode1 == null) {
			
			pNewNode.next = headNode2;
			return;
		}
		
		if(headNode2 == null) {
			
			pNewNode.next = headNode1;
			return;
		}
		
		if(headNode1.value <= headNode2.value) {
			
			pNewNode.next = headNode1;
			pNewNode = pNewNode.next;
			
			headNode1 = headNode1.next;
			
			mergeCore(headNode1, headNode2, newHead, pNewNode);
			
		}else {
			
			pNewNode.next = headNode2;
			pNewNode = pNewNode.next;
			
			headNode2 = headNode2.next;
			
			mergeCore(headNode1, headNode2, newHead, pNewNode);
		}
	}
	
	/**
	 * Solution2: Recursion solution provided by the book, more succinct.
	 * @param headNode1
	 * @param headNode2
	 * @return
	 */
	public static Interv25Node mergeS2(Interv25Node headNode1, Interv25Node headNode2) {
		
		if (headNode1 == null) {
			return headNode2;
		}

		if (headNode2 == null) {
			return headNode1;
		}
		
		Interv25Node newHead = null;
		
		if(headNode1.value <= headNode2.value) {
			
			newHead = headNode1;
			newHead.next = mergeS2(headNode1.next, headNode2);
			
		}else {
			
			newHead = headNode2;
			newHead.next = mergeS2(headNode1, headNode2.next);
			
		}
		
		return newHead;
	}
}
