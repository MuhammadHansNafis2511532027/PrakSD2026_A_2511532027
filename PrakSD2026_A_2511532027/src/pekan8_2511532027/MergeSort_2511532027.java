package pekan8_2511532027;

public class MergeSort_2511532027 {
	void merge_2027(int arr_2027[], int l_2027, int m_2027, int r_2027) {
		// Find sizes of two subarrays to be merged
		int n1_2027 = m_2027 - l_2027 + 1;
		int n2_2027 = r_2027 - m_2027;
		/* Create temp arrays */
		int L_2027[] = new int[n1_2027];
		int R_2027[] = new int[n2_2027];
		/* Copy data to temp arrays */
		for (int i_2027 = 0; i_2027 < n1_2027; ++i_2027)
			L_2027[i_2027] = arr_2027[l_2027 + i_2027];
		for (int j_2027 = 0; j_2027 < n2_2027; ++j_2027)
			R_2027[j_2027] = arr_2027[m_2027 + 1 + j_2027];
		int i_2027 = 0, j_2027 = 0;
		// Initial index of merged subarray array
		int k_2027 = l_2027;
		while (i_2027 < n1_2027 && j_2027 < n2_2027) {
			if (L_2027[i_2027] <= R_2027[j_2027]) {
				arr_2027[k_2027] = L_2027[i_2027];
				i_2027++;
			} else {
				arr_2027[k_2027] = R_2027[j_2027];
				j_2027++;
			}
			k_2027++;
		}
		/* Copy remaining elements of L_2027[] if any */
		while (i_2027 < n1_2027) {
			arr_2027[k_2027] = L_2027[i_2027];
			i_2027++;
			k_2027++;
		}
		/* Copy remaining elements of R_2027[] if any */
		while (j_2027 <n2_2027) {
			arr_2027[k_2027] = R_2027[j_2027];
			j_2027++;
			k_2027++;
		}
	}
	void sort_2027(int arr_2027[], int l_2027, int r_2027) {
		if (l_2027 < r_2027) {
			// Find the middle point
			int m_2027 = (l_2027 + r_2027) / 2;
			// Sort first and second halves
			sort_2027(arr_2027, l_2027, m_2027);
			sort_2027(arr_2027, m_2027 + 1, r_2027);
			// Merge the sorted halves
			merge_2027(arr_2027, l_2027, m_2027, r_2027);
		}
	}
	/* A utility function to point array of size n */
	static void printArray_2027(int arr_2027[]) {
		int n_2027 = arr_2027.length;
		for (int i_2027 = 0; i_2027 < n_2027; ++i_2027)
			System.out.print(arr_2027[i_2027] + " ");
		System.out.println();
	}
	public static void main (String[] args) {
		int arr_2027[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum terurut");
		printArray_2027(arr_2027);
		MergeSort_2511532027 ob_2027 = new MergeSort_2511532027();
		ob_2027.sort_2027(arr_2027, 0, arr_2027.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge Sort");
		printArray_2027(arr_2027);
	}
}
