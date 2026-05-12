package pekan6_2511532027;

public class PenelusuranDLL_2511532027 {
	// fungsi penelusuran maju
	static void forwardTraversal_2027(NodeDLL_2511532027 head_2027) {
		// memulai penelusuran dari head
		NodeDLL_2511532027 curr_2027 = head_2027;
		// lanjutkan sampai akhir
		while (curr_2027 != null) {
			// print data
			System.out.print(curr_2027.data_2027 + " <-> ");
			// pindah ke node berikutnya
			curr_2027 = curr_2027.next_2027;
		}
		// print spasi
		System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversal_2027(NodeDLL_2511532027 tail_2027) {
		// mulai dari akhir
		NodeDLL_2511532027 curr_2027 = tail_2027;
		// lanjut sampai head
		while (curr_2027 != null) {
			// cetak data
			System.out.print(curr_2027.data_2027 + " <-> ");
			// pindah ke node sebelumnya
			curr_2027 = curr_2027.prev_2027;
		}
		// cetak spasi
		System.out.println();
	}
	public static void main (String[] args) {
		// cetak DLL
		NodeDLL_2511532027 head_2027 = new NodeDLL_2511532027(1);
		NodeDLL_2511532027 second_2027 = new NodeDLL_2511532027(2);
		NodeDLL_2511532027 third_2027 = new NodeDLL_2511532027(3);
		
		head_2027.next_2027 = second_2027;
		second_2027.prev_2027 = head_2027;
		second_2027.next_2027 = third_2027;
		third_2027.prev_2027 = second_2027;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2027(head_2027);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_2027(third_2027);
	}
}
