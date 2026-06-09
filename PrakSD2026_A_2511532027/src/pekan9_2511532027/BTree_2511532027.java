package pekan9_2511532027;

public class BTree_2511532027 {
	private Node_2511532027 root_2027;
	private Node_2511532027 currentNode_2027;
	public BTree_2511532027() {
		root_2027 = null;
	}
	public boolean search_2027(int data_2027) {
		return search_2027(root_2027, data_2027);
	}
	private boolean search_2027(Node_2511532027 node_2027, int data_2027) {
		if (node_2027.getData_2027() == data_2027)
			return true;
		if (node_2027.getLeft_2027() != null)
			if (search_2027(node_2027.getLeft_2027(), data_2027))
				return true;
		if (node_2027.getRight_2027() != null)
			if (search_2027(node_2027.getRight_2027(), data_2027))
				return true;
		return false;
	}
	public void printInorder_2027() {
		root_2027.printInorder_2027(root_2027);
	}
	public void printPreorder_2027() {
		root_2027.printPreorder_2027(root_2027);
	}
	public void printPostorder_2027() {
		root_2027.printPostorder_2027(root_2027);
	}
	public Node_2511532027 getRoot_2027() {
		return root_2027;
	}
	public boolean isEmpty_2027() {
		return root_2027 == null;
	}
	public int countNodes_2027() {
		return countNodes_2027(root_2027);
	}
	private int countNodes_2027(Node_2511532027 node_2027) {
		int count_2027 = 1;
		if (node_2027 == null) {
			return 0;
		} else {
			count_2027 += countNodes_2027(node_2027.getLeft_2027());
			count_2027 += countNodes_2027(node_2027.getRight_2027());
			return count_2027;
		}
	}
	public void print_2027() {
		root_2027.print_2027();
	}
	public Node_2511532027 getCurrent_2027() {
		return currentNode_2027;
	}
	public void setCurrent_2027(Node_2511532027 node_2027) {
		this.currentNode_2027 = node_2027;
	}
	public void setRoot_2027(Node_2511532027 node_2027) {
		this.root_2027 = node_2027;
	}
}
