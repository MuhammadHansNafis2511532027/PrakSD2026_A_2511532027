package pekan5_2511532027;

public class TambahSLL_2511532027 {
	public static NodeSLL_2511532027 insertAtFront_2027(NodeSLL_2511532027 head_2027, int value_2027) {
		NodeSLL_2511532027 new_node_2027 = new NodeSLL_2511532027(value_2027);
		new_node_2027.next_2027 = head_2027;
		return new_node_2027;
	}
	// fungsi menambahkan node di akhir SSL
	public static NodeSLL_2511532027 insertAtEnd_2027(NodeSLL_2511532027 head_2027, int value_2027) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511532027 newNode_2027 = new NodeSLL_2511532027(value_2027);
		// jika list kosong maka node jadi head
		if (head_2027 == null) {
			return newNode_2027;
		}
		// simpan head ke variabel sementara
		NodeSLL_2511532027 last_2027 = head_2027;
		// telusuri ke node akhir
		while (last_2027.next_2027 != null) {
			last_2027 = last_2027.next_2027;
		}
		// ubah pointer
		last_2027.next_2027 = newNode_2027;
		return head_2027;
	}
	static NodeSLL_2511532027 GetNode_2027(int data_2027) {
		return new NodeSLL_2511532027(data_2027);
	}
	static NodeSLL_2511532027 insertPos_2027(NodeSLL_2511532027 headNode_2027, int position_2027, int value_2027) {
		NodeSLL_2511532027 head_2027 = headNode_2027;
		if (position_2027 < 1) 
			System.out.print("Invalid position");
			if (position_2027 == 1) {
				NodeSLL_2511532027 new_node_2027 = new NodeSLL_2511532027(value_2027);
				new_node_2027.next_2027 = head_2027;
				return new_node_2027;
			} else {
				while (position_2027-- != 0) {
					if (position_2027 == 1) {
						NodeSLL_2511532027 newNode_2027 = GetNode_2027(value_2027);
						newNode_2027.next_2027 = headNode_2027.next_2027;
						headNode_2027.next_2027 = newNode_2027;
						break;
					}
					headNode_2027 = headNode_2027.next_2027;
				}
				if (position_2027 != 1) 
					System.out.print("Posisi di luar jangkauan"); }
					return head_2027;  }
					public static void printList_2027(NodeSLL_2511532027 head_2027) {
						NodeSLL_2511532027 curr_2027 = head_2027;
						while (curr_2027.next_2027 != null) {
							System.out.print(curr_2027.data_2027+"-->");
							curr_2027 = curr_2027.next_2027;
						}
						if (curr_2027.next_2027==null) {
							System.out.print(curr_2027.data_2027); }
						System.out.println();
					}
					public static void main (String[] args) {
						// buat linked list 2->3->5->6
						NodeSLL_2511532027 head_2027 = new NodeSLL_2511532027(2);
						head_2027.next_2027 = new NodeSLL_2511532027(3);
						head_2027.next_2027.next_2027 = new NodeSLL_2511532027(5);
						head_2027.next_2027.next_2027.next_2027 = new NodeSLL_2511532027(6);
						// cetak list asli
						System.out.print("Senarai berantai awal: ");
						printList_2027(head_2027);
						// tambahkan node baru di depan
						System.out.print("tambah 1 simpul di depan: ");
						int data_2027 = 1;
						head_2027 = insertAtFront_2027(head_2027, data_2027);
						// cetak update list
						printList_2027(head_2027);
						// tambahkan node baru di belakang
						System.out.print("tambah 1 simpul di belakang: ");
						int data2_2027 = 7;
						head_2027 = insertAtEnd_2027(head_2027, data2_2027);
						// cetak update list
						printList_2027(head_2027);
						System.out.print("tambah 1 simpul ke data 4: ");
						int data3_2027 = 4;
						int pos_2027 = 4;
						head_2027 = insertPos_2027(head_2027, pos_2027, data3_2027);
						// cetak update list
						printList_2027(head_2027);
					}
		}

