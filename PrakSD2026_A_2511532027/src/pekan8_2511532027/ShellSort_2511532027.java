package pekan8_2511532027;

public class ShellSort_2511532027 {
	public static void shellSort_2027(int[] A_2027) {
		int n_2027 = A_2027.length;
		int gap_2027 = n_2027 / 2;
		while (gap_2027 > 0) {
			for (int i_2027 = gap_2027; i_2027 < n_2027; i_2027++) {
				int temp_2027 = A_2027[i_2027];
				int j_2027 = i_2027;
				while (j_2027 >= gap_2027 && A_2027[j_2027 - gap_2027] > temp_2027) {
					A_2027[j_2027] = A_2027[j_2027 - gap_2027];
					j_2027 = j_2027 - gap_2027;
				}
				A_2027[j_2027] = temp_2027;
			}
			gap_2027 = gap_2027 / 2;
		}
	}
	public static void main (String[] args) {
		int[] data_2027 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray_2027(data_2027);
		shellSort_2027(data_2027);
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2027(data_2027);
	}
	public static void printArray_2027(int[] arr_2027) {
		for (int i_2027 : arr_2027) System.out.print(i_2027 + " ");
		System.out.println();
	}
}
