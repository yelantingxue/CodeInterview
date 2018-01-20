package chap2.interview35;

public class Interv35ComplexListNode {

	public int value;
	public Interv35ComplexListNode next;
	public Interv35ComplexListNode randomNode;
	
	public Interv35ComplexListNode(int value) {
		super();
		this.value = value;
	}
	
	public void printComplexList(Interv35ComplexListNode headNode) {
		
		Interv35ComplexListNode tmp = headNode;
		while(tmp != null) {
			
			System.out.print(tmp.value + ",");
			
			if(tmp.randomNode != null) {
				System.out.print("the randomNode of this node is " + tmp.randomNode.value);
			}
			System.out.println();
			tmp = tmp.next;
		}
	}
}
