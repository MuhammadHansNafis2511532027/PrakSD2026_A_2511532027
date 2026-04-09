package pekan3_2511532027;

import java.util.Stack;

public class NilaiMaksimum_2511532027 {
	public static int max(Stack<Integer> s_2027) {
		Stack<Integer> backup_2027 = new Stack<Integer>();
		int maxValue_2027 = s_2027.pop();
		backup_2027.push(maxValue_2027);
		while (!s_2027.isEmpty()) {
			int next = s_2027.pop();
			backup_2027.push(next);
			maxValue_2027 = Math.max(maxValue_2027, next);
		}
		while (!backup_2027.isEmpty()) {
			s_2027.push(backup_2027.pop());
		}
		return maxValue_2027;
	}
	public static void main (String[] args) {
		Stack<Integer> s_2027 = new Stack<Integer>();
		s_2027.push(70);
		s_2027.push(12);
		s_2027.push(20);
		System.out.println("Isi Stack " + s_2027);
		System.out.println("Stack Teratas " + s_2027.peek());
		System.out.println("Nilai Maksimum " + max(s_2027));
	}
}
