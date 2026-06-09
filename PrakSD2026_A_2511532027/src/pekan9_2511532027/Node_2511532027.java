package pekan9_2511532027;

public class Node_2511532027 {
	int data_2027;
	Node_2511532027 left_2027;
	Node_2511532027 right_2027;
	public Node_2511532027(int data_2027) {
		this.data_2027 = data_2027;
		left_2027 = null;
		right_2027 = null;
	}
	public void setLeft_2027(Node_2511532027 node_2027) {
		if (left_2027 == null)
			left_2027 = node_2027;
	}
	public void setRight_2027(Node_2511532027 node_2027) {
		if (right_2027 == null)
			right_2027 = node_2027;
	}
	public Node_2511532027 getLeft_2027() {
		return left_2027;
	}
	public Node_2511532027 getRight_2027() {
		return right_2027;
	}
	public int getData_2027() {
		return data_2027;
	}
	public void setData_2027(int data_2027) {
		this.data_2027 = data_2027;
	}
	void printPreorder_2027(Node_2511532027 node_2027) {
		if (node_2027 == null)
			return;
		System.out.print(node_2027.data_2027 + " ");
		printPreorder_2027(node_2027.left_2027);
		printPreorder_2027(node_2027.right_2027);
	}
	void printPostorder_2027(Node_2511532027 node_2027) {
		if (node_2027 == null)
			return;
		printPostorder_2027(node_2027.left_2027);
		printPostorder_2027(node_2027.right_2027);
		System.out.print(node_2027.data_2027 + "");
	}
	void printInorder_2027(Node_2511532027 node_2027) {
		if (node_2027 == null)
			return;
		printInorder_2027(node_2027.left_2027);
		System.out.print(node_2027.data_2027 + "");
		printInorder_2027(node_2027.right_2027);
	}
	public String print_2027() {
		return this.print_2027("",true,"");
	}
	public String print_2027(String prefix_2027, boolean isTail_2027, String sb_2027) {
		if (right_2027 != null) {
			right_2027.print_2027(prefix_2027 + (isTail_2027 ? "| " : " "), false, sb_2027);
		}
		System.out.println(prefix_2027 + (isTail_2027 ? "\\-- " : "/-- ") + data_2027);
		if (left_2027 != null) {
			left_2027.print_2027(prefix_2027 + (isTail_2027 ? " " : "| "), true, sb_2027);
		}
		return sb_2027;
	}
}
