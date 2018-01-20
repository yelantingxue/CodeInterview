package chap4.interview35;

public class Interview35Q1 {

	public static Interv35ComplexListNode cloneComplexList(Interv35ComplexListNode headNode) {
		
		if(headNode == null) {
			return null;
		}
		
		cloneAndLink(headNode);
		cloneRandomLink(headNode);
		
		return seperateClone(headNode);
	}
	
	private static void cloneAndLink(Interv35ComplexListNode headNode) {
		
		Interv35ComplexListNode node;
		Interv35ComplexListNode tmp = headNode;
		Interv35ComplexListNode nextNode = headNode.next;
		
		while(tmp != null) {
			
			node = new Interv35ComplexListNode(tmp.value);
			tmp.next = node;
			node.next = nextNode;
			tmp = nextNode;
			
			if(nextNode != null) {
				nextNode = nextNode.next;
			}
		}
	}
	
	private static void cloneRandomLink(Interv35ComplexListNode headNode) {
		
		Interv35ComplexListNode tmpNode = headNode;
		
		while(tmpNode != null) {
			
			if(tmpNode.randomNode != null) {
				tmpNode.next.randomNode = tmpNode.randomNode.next;
			}
			
			tmpNode = tmpNode.next.next;
		}
		
	}
	
	private static Interv35ComplexListNode seperateClone(Interv35ComplexListNode headNode) {
		
		Interv35ComplexListNode tmpOdd = headNode;
		Interv35ComplexListNode newHead = headNode.next;
		Interv35ComplexListNode tmpEven = newHead;
		Interv35ComplexListNode curNode = newHead.next;
		
		int count = 3;
		
		while(curNode != null) {
			
			if(count % 2 == 1) {
				tmpOdd.next = curNode;
				tmpOdd = tmpOdd.next;
			}else {
				tmpEven.next = curNode;
				tmpEven = tmpEven.next;
			}
			curNode = curNode.next;
			count++;
		}
		
		return newHead;
	}
}
