package pekan8_2511532027;

public class QuickSort_2511532027 {
	static void swap_2027(int[] arr_2027, int i_2027, int j_2027)
	{
		int temp_2027 = arr_2027[i_2027];
		arr_2027[i_2027] = arr_2027[j_2027];
		arr_2027[j_2027] = temp_2027;
	}
	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_2027(int[] arr_2027, int low_2027, int high_2027)
	{
		int mid_2027 = low_2027 + (high_2027 - low_2027) / 2;
		// Urutkan elemen low, mid, dan high
		if (arr_2027[low_2027] > arr_2027[mid_2027]) {
			swap_2027(arr_2027, low_2027, mid_2027);
		}
		if (arr_2027[low_2027] > arr_2027[high_2027]) {
			swap_2027(arr_2027, low_2027, high_2027);
		}
		if (arr_2027[mid_2027] > arr_2027[high_2027]) {
			swap_2027(arr_2027, mid_2027, high_2027);
		}
		swap_2027(arr_2027, mid_2027, high_2027);
	}
	static int partition_2027(int[] arr_2027, int low_2027, int high_2027)
	{
		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_2027(arr_2027, low_2027, high_2027);
		int pivot_2027 = arr_2027[high_2027]; // Sekarang arr_2027[high_2027] sudah berisi nilai median
		int i_2027 = (low_2027 - 1);
		for (int j_2027 = low_2027; j_2027 <= high_2027 - 1; j_2027++) {
			// Jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_2027[j_2027] < pivot_2027) {
				// Increment indeks elemen yang lebih kecil
				i_2027++;
				swap_2027(arr_2027, i_2027, j_2027);
			}
		}
		swap_2027(arr_2027, i_2027 + 1, high_2027);
		return (i_2027 + 1);
	}
	static void quickSort_2027(int[] arr_2027, int low_2027, int high_2027)
	{
		if (low_2027 < high_2027) {
			int pi_2027 = partition_2027(arr_2027, low_2027, high_2027);
			quickSort_2027(arr_2027, low_2027, pi_2027 - 1);
			quickSort_2027(arr_2027, pi_2027 + 1, high_2027);
		}
	}
	public static void printArr_2027(int[] arr_2027)
	{
		for (int i_2027 = 0; i_2027 < arr_2027.length; i_2027++) {
			System.out.print(arr_2027[i_2027] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] arr_2027 = {10, 7, 8, 9, 1, 5};
		int N_2027 = arr_2027.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2027(arr_2027);
		quickSort_2027(arr_2027, 0, N_2027 - 1);
		System.out.print("Data Terurut quicksort: ");
		printArr_2027(arr_2027);
	}
}
