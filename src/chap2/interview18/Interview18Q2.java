package chap2.interview18;

public class Interview18Q2 {

	public static Interview18Node deleteDuplicatedNodes(Interview18Node headNode) {

		if (headNode == null) {
			return null;
		}

		if (headNode.next == null) {
			return headNode;
		}

		Interview18Node preNode = headNode;
		Interview18Node trvNode = headNode;

		while (trvNode != null && trvNode.next != null) {

			// Head node is duplicated.
			if (trvNode.next.value == trvNode.value && preNode == trvNode) {

				while (trvNode != null && trvNode.next != null && trvNode.next.value == trvNode.value) {
					trvNode = trvNode.next;
				}
				trvNode = trvNode.next;
				preNode = trvNode;
				headNode = preNode;

			} else if (trvNode.next.value != trvNode.value) {

				// Not duplicated.

				preNode = trvNode;
				trvNode = trvNode.next;

			} else {

				// Duplicated nodes are not head node.

				while (trvNode != null && trvNode.next != null && trvNode.next.value == trvNode.value) {
					trvNode = trvNode.next;
				}
				trvNode = trvNode.next;
				preNode.next = trvNode;
			}
		}

		return headNode;

	}
}
