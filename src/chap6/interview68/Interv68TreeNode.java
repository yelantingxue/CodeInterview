package chap6.interview68;

import java.util.ArrayList;
import java.util.List;

public class Interv68TreeNode {

	public int numOfSubNode;
	
	public int value;
	public List<Interv68TreeNode> subNodes;
	
	public Interv68TreeNode(int value) {
		this.value = value;
		this.numOfSubNode = 0;
		subNodes = new ArrayList<>();
	}
	
	public void addSubNode(Interv68TreeNode subNode) {
		
		numOfSubNode++;
		subNodes.add(subNode);
	}
}
