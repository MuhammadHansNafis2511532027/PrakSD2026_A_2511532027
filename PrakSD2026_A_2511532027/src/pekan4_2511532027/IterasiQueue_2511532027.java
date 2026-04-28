package pekan4_2511532027;

import java.util.Iterator;
import java.util.*;

public class IterasiQueue_2511532027 {
	public static void main (String[] args) {
		Queue<String> q_2027 = new LinkedList<>();
		q_2027.add("Praktikum");
		q_2027.add("Struktur");
		q_2027.add("Data");
		q_2027.add("Dan");
		q_2027.add("Algoritma");
		Iterator<String> iterator_2027 = q_2027.iterator();
		while (iterator_2027.hasNext()) {
			System.out.print(iterator_2027.next() + " ");
		}
	}
}
