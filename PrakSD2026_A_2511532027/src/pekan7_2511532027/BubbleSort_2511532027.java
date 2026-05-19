package pekan7_2511532027;

public class BubbleSort_2511532027 {
	public static void bubbleSort_2027 (int[] arr_2027) {
		int n_2027 = arr_2027.length;
		for (int i_2027 = 0; i_2027 < n_2027; i_2027++) {
			for (int j_2027 = 0; j_2027 < n_2027 - i_2027 - 1; j_2027++) {
				if (arr_2027[j_2027] > arr_2027[j_2027 + 1]) {
					int temp_2027 = arr_2027[j_2027];
					arr_2027[j_2027] = arr_2027[j_2027 + 1];
					arr_2027 [j_2027 + 1] = temp_2027;
					// System.out.println("data:"+arr_2027[j_2027]+" "+arr_2027[j_2027+1]);
				}
			}
		}
	}
	public static void main (String[] args) {
		int arr_2027[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2027 = arr_2027.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_2027 = 0; i_2027 < n_2027; i_2027++)
			System.out.print(arr_2027[i_2027] + " ");
		System.out.println("");
		bubbleSort_2027(arr_2027);
		System.out.printf("array yang terurut:\n");
		for (int i_2027 = 0; i_2027 < n_2027; i_2027++)
			System.out.print(arr_2027[i_2027] + " ");
		System.out.println("");
	}
}
