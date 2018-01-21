package chap4.interview37;

import java.util.ArrayList;
import java.util.List;

public class Interview37Q1 {

	public static String serializeBinaryTree(Interv37TreeNode node){
		
		if(node == null) {
			return null;
		}
		
		StringBuilder binaryTreeSerial = new StringBuilder("");
		
		serializaCore(node, binaryTreeSerial);
		return binaryTreeSerial.toString();
	}
	
	private static void serializaCore(Interv37TreeNode node, StringBuilder serial) {
		
		if(node == null) {
			serial.append("$,");
			return;
		}else {
			serial.append(node.value + ",");
		}
		
		serializaCore(node.left, serial);
		serializaCore(node.right, serial);
	}
	
	public static Interv37TreeNode deserializeBinaryTree(String serial) {
		
		if(serial == null || serial.length() == 0) {
			return null;
		}
		
		StringBuilder serialBuilder = new StringBuilder(serial);
		
		Interv37TreeNode root = deserialCore(serialBuilder);
		
		return root;
	}
	
	private static Interv37TreeNode deserialCore(StringBuilder serial) {
		
		int i = 0;
		while(serial.charAt(i) != ',') {
			i++;
		}
		
		String valueStr = serial.substring(0, i);
		int nodeValue;
		
		if(valueStr.equals("$")) {
			
			serial.delete(0, i+1);
			return null;
			
		}else {
			nodeValue = Integer.parseInt(valueStr);
		}
		
		Interv37TreeNode root = new Interv37TreeNode(nodeValue);
		
		serial.delete(0, i+1);
		root.left = deserialCore(serial);
		root.right = deserialCore(serial);
		
		return root;
	}
}
