package pekan4_2511532027;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532027 {
	public static void main (String[] args) {
		Queue<Integer> q_2027 = new LinkedList<Integer>();
		q_2027.add(1);
		q_2027.add(2);
		q_2027.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse" + q_2027);
		Stack<Integer> s_2027 = new Stack<Integer>();
		while (!q_2027.isEmpty()) { // Q -> S
			s_2027.push(q_2027.remove());
		}
		while (!s_2027.isEmpty()) { // S -> Q
			q_2027.add(s_2027.pop());
		}
		System.out.println("sesudah reverse = " + q_2027); // [3, 2, 1]
	}
}
