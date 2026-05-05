package pekan5_2511532027;

public class HapusSLL_2511532027 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511532027 deleteHead_2027(NodeSLL_2511532027 head_2027) {
		// jika SLL kosong
		if (head_2027 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_2027 = head_2027.next_2027;
		// Return head baru
		return head_2027; }
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532027 removeLastNode_2027(NodeSLL_2511532027 head_2027) {
		// jika list kosong, return null
		if (head_2027 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_2027.next_2027 == null) {
			return null;
		}
		// tentukan node terakhir ke dua
		NodeSLL_2511532027 secondLast_2027 = head_2027;
		while (secondLast_2027.next_2027.next_2027 != null) {
			secondLast_2027 = secondLast_2027.next_2027;
		}
		// hapus node terakhir
		secondLast_2027.next_2027 = null;
		return head_2027; }
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532027 deleteNode_2027(NodeSLL_2511532027 head_2027, int position_2027) {
		NodeSLL_2511532027 temp_2027 = head_2027;
		NodeSLL_2511532027 prev_2027 = null;
		// jika linked list full
		if (temp_2027 == null)
			return head_2027;
		// kasus 1: head dihapus
		if (position_2027 == 1) {
			head_2027 = temp_2027.next_2027;
			return head_2027; }
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang dihapus
		for (int i_2027 = 1; temp_2027 != null && i_2027 < position_2027; i_2027++) {
			prev_2027 = temp_2027;
			temp_2027 = temp_2027.next_2027; }
		// jika ditemukan, hapus node
		if (temp_2027 != null) {
			prev_2027.next_2027 = temp_2027.next_2027;
		}else {
			System.out.println("Data tidak ada"); }
		return head_2027; }
	// fungsi mencetak SLL
	public static void printList_2027(NodeSLL_2511532027 head_2027) {
		NodeSLL_2511532027 curr_2027 = head_2027;
		while (curr_2027.next_2027 != null) {
			System.out.print(curr_2027.data_2027+"-->");
			curr_2027 = curr_2027.next_2027; }
		if (curr_2027.next_2027==null) {
			System.out.print(curr_2027.data_2027); }
		System.out.println(); }
	// kelas main
	public static void main (String[] args) {
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511532027 head_2027 = new NodeSLL_2511532027(1);
		head_2027.next_2027 = new NodeSLL_2511532027(2);
		head_2027.next_2027.next_2027 = new NodeSLL_2511532027(3);
		head_2027.next_2027.next_2027.next_2027 = new NodeSLL_2511532027(4);
		head_2027.next_2027.next_2027.next_2027.next_2027 = new NodeSLL_2511532027(5);
		head_2027.next_2027.next_2027.next_2027.next_2027.next_2027 = new NodeSLL_2511532027(6);
		//cetak list awal
		System.out.println("list awal: ");
		printList_2027(head_2027);
		// hapus head
		head_2027 = deleteHead_2027(head_2027);
		System.out.println("List setelah head di hapus: ");
		printList_2027(head_2027);
		// hapus node terakhir
		head_2027 = removeLastNode_2027(head_2027);
		System.out.println("List setelah simpul terakhir di hapus: ");
		printList_2027(head_2027);
		// Deleting node at position 2
		int position_2027 = 2;
		head_2027 = deleteNode_2027(head_2027, position_2027);
		// Print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2027(head_2027);
	}
}
