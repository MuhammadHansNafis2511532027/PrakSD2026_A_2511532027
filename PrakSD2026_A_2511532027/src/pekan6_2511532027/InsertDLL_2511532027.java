package pekan6_2511532027;

public class InsertDLL_2511532027 {
	// menambahkan node di awal DLL
	static NodeDLL_2511532027 insertBegin_2027(NodeDLL_2511532027 head_2027, int data_2027) {
		// buat node baru
		NodeDLL_2511532027 new_node_2027 = new NodeDLL_2511532027(data_2027);
		// jadikan pointer nextnya head
		new_node_2027.next_2027 = head_2027;
		// jadikan pointer prev head ke new_node
		if (head_2027 != null) {
			head_2027.prev_2027 = new_node_2027;
		}
		return new_node_2027;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511532027 insertEnd_2027(NodeDLL_2511532027 head_2027, int newData_2027) {
		// buat node baru
		NodeDLL_2511532027 newNode_2027 = new NodeDLL_2511532027(newData_2027);
		// jika dll null jadikan head
		if (head_2027 == null) {
			head_2027 = newNode_2027;
		}
		else {
			NodeDLL_2511532027 curr_2027 = head_2027;
			while (curr_2027.next_2027 != null) {
				curr_2027 = curr_2027.next_2027;
			}
			curr_2027.next_2027 = newNode_2027;
			newNode_2027.prev_2027 = curr_2027;
		}
		return head_2027;
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532027 insertAtPosition_2027(NodeDLL_2511532027 head_2027, int pos_2027, int new_data_2027) {
		// buat node baru
		NodeDLL_2511532027 new_node_2027 = new NodeDLL_2511532027(new_data_2027);
		if (pos_2027 == 1) {
			new_node_2027.next_2027 = head_2027;
			if (head_2027 != null) {
				head_2027.prev_2027 = new_node_2027; }
			head_2027 = new_node_2027;
			return head_2027; }
		NodeDLL_2511532027 curr_2027 = head_2027;
		for (int i_2027 = 1; i_2027 < pos_2027 - 1 && curr_2027 != null; ++i_2027) {
			curr_2027 = curr_2027.next_2027; }
		if (curr_2027 == null) {
			System.out.println("Posisi tidak ada");
			return head_2027; }
		new_node_2027.prev_2027 = curr_2027;
		new_node_2027.next_2027 = curr_2027.next_2027;
		curr_2027.next_2027 = new_node_2027;
		if (new_node_2027.next_2027 != null) {
			new_node_2027.next_2027.prev_2027 = new_node_2027; }
		return head_2027;
	}
	public static void printList_2027(NodeDLL_2511532027 head_2027) {
		NodeDLL_2511532027 curr_2027 = head_2027;
		while (curr_2027 != null) {
			System.out.print(curr_2027.data_2027 + " <-> ");
			curr_2027 = curr_2027.next_2027;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532027 head_2027 = new NodeDLL_2511532027(2);
		head_2027.next_2027 = new NodeDLL_2511532027(3);
		head_2027.next_2027.prev_2027 = head_2027;
		head_2027.next_2027.next_2027 = new NodeDLL_2511532027(5);
		head_2027.next_2027.next_2027.prev_2027 = head_2027.next_2027;
		// cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_2027(head_2027);
		// tambah 1 di awal
		head_2027 = insertBegin_2027(head_2027, 1);
		System.out.print(
				"simpul 1 ditambahkan di awal: ");
		printList_2027(head_2027);
		// tambah 6 di akhir
		System.out.print(
				"simpul 6 ditambah di akhir: ");
		int data_2027 = 6;
		head_2027 = insertEnd_2027(head_2027, data_2027);
		printList_2027(head_2027);
		// menambahkan node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4 ");
		int data2_2027 = 4;
		int pos_2027 = 4;
		head_2027 = insertAtPosition_2027(head_2027, pos_2027, data2_2027);
		printList_2027(head_2027);
	}
}
