package chap3.interview18;

public class Interview18Q1 {

	public static void deleteNode(Interview18Node headNode, 
			Interview18Node nodeToBeDelete) {
		
		if(headNode == null || nodeToBeDelete == null) {
			return;
		}
		
		if(nodeToBeDelete.next != null) {
			//nodeToBeDelete is not the last node.
			
			nodeToBeDelete.value = nodeToBeDelete.next.value;
			Interview18Node temp = nodeToBeDelete.next.next;
			nodeToBeDelete.next.next = null;
			nodeToBeDelete.next = temp;
			
		}else if(nodeToBeDelete.next == null && nodeToBeDelete == headNode) {
			
			//there is only one node in the list.
			
			headNode = null;
			nodeToBeDelete = null;
			
		}else {
			
			//nodeToBeDelete is the last node.
			
			Interview18Node preNode = headNode;
			
			while(preNode.next != nodeToBeDelete) {
				preNode = preNode.next;
			}
			
			preNode.next = null;
		}
	}
}
