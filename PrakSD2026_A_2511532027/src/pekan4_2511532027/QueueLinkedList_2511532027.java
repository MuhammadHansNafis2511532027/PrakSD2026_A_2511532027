package pekan4_2511532027;

import java.util.*;

public class QueueLinkedList_2511532027 {
	public static void main (String[] args) {
		Queue<Integer> q_2027 = new LinkedList<>();
		// tambah elemen (0, 1, 2, 3, 4, 5) ke antrian
		for (int i_2027 = 0; i_2027 < 6; i_2027++)
			q_2027.add(i_2027);
		// Menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_2027);
		// Untuk menghapus kepala antrian
		int hapus_2027 = q_2027.remove();
		System.out.println("Hapus elemen = " + hapus_2027);
		System.out.println(q_2027);
		// Untuk melihat antrian terdepan
		int depan_2027 = q_2027.peek();
		System.out.println("Kepala Antrian = " + depan_2027);
		
		int banyak_2027 = q_2027.size();
		System.out.println("Size Antrian = " + banyak_2027);
	}
}
