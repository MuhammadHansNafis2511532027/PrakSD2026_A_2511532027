package pekan6_2511532027;

public class HapusDLL_2511532027 {
	// fungsi menghapus node awal
	public static NodeDLL_2511532027 delHead_2027(NodeDLL_2511532027 head_2027) {
		if (head_2027 == null) {
			return null; }
		NodeDLL_2511532027 temp_2027 = head_2027;
		head_2027 = head_2027.next_2027;
		if (head_2027 != null) {
			head_2027.prev_2027 = null; }
		return head_2027;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511532027 delLast_2027(NodeDLL_2511532027 head_2027) {
		if (head_2027 == null) {
			return null; }
		if (head_2027.next_2027 == null) {
			return null; }
		NodeDLL_2511532027 curr_2027 = head_2027;
		while (curr_2027.next_2027 != null) {
			curr_2027 = curr_2027.next_2027;
		}
		// update pointer previous node
		if (curr_2027.prev_2027 != null) {
			curr_2027.prev_2027.next_2027 = null; }
		return head_2027;
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeDLL_2511532027 delPos_2027(NodeDLL_2511532027 head_2027, int pos_2027) {
		// jika DLL kosong
		if (head_2027 == null) {
			return head_2027; }
		NodeDLL_2511532027 curr_2027 = head_2027;
		// telusuri sampai ke node yang akan dihapus
		for (int i_2027 = 1; curr_2027 != null && i_2027 < pos_2027; ++i_2027) {
			curr_2027 = curr_2027.next_2027; }
		// jika posisi tidak ditemukan
		if (curr_2027 == null) {
			return head_2027; }
		// update pointer
		if (curr_2027.prev_2027 != null) {
			curr_2027.prev_2027.next_2027 = curr_2027.next_2027; }
		if (curr_2027.next_2027 != null) {
			curr_2027.next_2027.prev_2027 = curr_2027.prev_2027; }
		// jika yang dihapus head
		if (head_2027 == curr_2027) {
			head_2027 = curr_2027.next_2027; }
		return head_2027;
	}
	// fungsi mencetak DLL
	public static void printList_2027 (NodeDLL_2511532027 head_2027) {
		NodeDLL_2511532027 curr_2027 = head_2027;
		while (curr_2027 != null) {
			System.out.print(curr_2027.data_2027 + " <-> ");
			curr_2027 = curr_2027.next_2027;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		// buat sebuah DLL
		NodeDLL_2511532027 head_2027 = new NodeDLL_2511532027(1);
		head_2027.next_2027 = new NodeDLL_2511532027(2);
		head_2027.next_2027.prev_2027 = head_2027;
		head_2027.next_2027.next_2027 = new NodeDLL_2511532027(3);
		head_2027.next_2027.next_2027.prev_2027 = head_2027.next_2027;
		head_2027.next_2027.next_2027.next_2027 = new NodeDLL_2511532027(4);
		head_2027.next_2027.next_2027.next_2027.prev_2027 = head_2027.next_2027.next_2027;
		head_2027.next_2027.next_2027.next_2027.next_2027 = new NodeDLL_2511532027(5);
		head_2027.next_2027.next_2027.next_2027.next_2027.prev_2027 = head_2027.next_2027.next_2027.next_2027;
		
		System.out.print("DLL Awal: ");
		printList_2027(head_2027);
		
		System.out.print("Setelah head doihapus: ");
		head_2027 = delHead_2027(head_2027);
		printList_2027(head_2027);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_2027 = delLast_2027(head_2027);
		printList_2027(head_2027);
		
		System.out.print("Menghapus node ke 2: ");
		head_2027 = delPos_2027(head_2027, 2);
		
		printList_2027(head_2027);
	}
}
