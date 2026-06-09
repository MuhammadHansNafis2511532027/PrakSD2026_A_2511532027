package pekan9_2511532027;

public class BTreeDriver_2511532027 {
	public static void main (String[] args) {
		// Membuat Pohon
		BTree_2511532027 tree_2027 = new BTree_2511532027();
		System.out.print("Jumlah simpul awal pohon: ");
		System.out.println(tree_2027.countNodes_2027());
		// Menambahkan simpul data 1
		Node_2511532027 root_2027 = new Node_2511532027(1);
		// Menjadikan simpul 1 sebagai root
		tree_2027.setRoot_2027(root_2027);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_2027.countNodes_2027());
		Node_2511532027 node2_2027 = new Node_2511532027(2);
		Node_2511532027 node3_2027 = new Node_2511532027(3);
		Node_2511532027 node4_2027 = new Node_2511532027(4);
		Node_2511532027 node5_2027 = new Node_2511532027(5);
		Node_2511532027 node6_2027 = new Node_2511532027(6);
		Node_2511532027 node7_2027 = new Node_2511532027(7);
		Node_2511532027 node8_2027 = new Node_2511532027(8);
		Node_2511532027 node9_2027 = new Node_2511532027(9);
		root_2027.setLeft_2027(node2_2027);
		node2_2027.setLeft_2027(node4_2027);
		node2_2027.setRight_2027(node5_2027);
		node4_2027.setRight_2027(node8_2027);
		root_2027.setRight_2027(node3_2027);
		node3_2027.setLeft_2027(node6_2027);
		node3_2027.setRight_2027(node7_2027);
		node6_2027.setLeft_2027(node9_2027);
		
		// Set root
		tree_2027.setCurrent_2027(tree_2027.getRoot_2027());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree_2027.getCurrent_2027().getData_2027());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_2027.countNodes_2027());
		System.out.println("InOrder: ");
		tree_2027.printPreorder_2027();
		System.out.println("\nPostorder : ");
		tree_2027.printPostorder_2027();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_2027.print_2027();
	}
}
