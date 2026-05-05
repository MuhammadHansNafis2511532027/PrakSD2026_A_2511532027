package pekan5_2511532027;

public class PencarianSLL_2511532027 {
	static boolean searchKey_2027(NodeSLL_2511532027 head_2027, int key_2027) {
		NodeSLL_2511532027 curr_2027 = head_2027;
		while (curr_2027 != null) {
			if (curr_2027.data_2027 == key_2027) 
				return true;
				curr_2027 = curr_2027.next_2027; }
			return false; }
		public static void traversal_2027(NodeSLL_2511532027 head_2027) {
			// mulai dari head
			NodeSLL_2511532027 curr_2027 = head_2027;
			// telusuri sampai pointer full
			while (curr_2027 != null) {
				System.out.print(" " + curr_2027.data_2027);
				curr_2027 = curr_2027.next_2027; }
			System.out.println(); }
		public static void main(String[] args) {
			NodeSLL_2511532027 head_2027 = new NodeSLL_2511532027(14);
			head_2027.next_2027 = new NodeSLL_2511532027(21);
			head_2027.next_2027.next_2027 = new NodeSLL_2511532027(13);
			head_2027.next_2027.next_2027.next_2027 = new NodeSLL_2511532027(30);
			head_2027.next_2027.next_2027.next_2027.next_2027 = new NodeSLL_2511532027(10);
			System.out.print("Penelusuran SLL : ");
			traversal_2027(head_2027);
			// data yang akan dicari
			int key_2027 = 30;
			System.out.print("cari data " +key_2027+ " = ");
			if (searchKey_2027(head_2027, key_2027)) {
				System.out.println("ketemu");
			}else {
				System.out.println("tidak ada");
			}
	}
}
