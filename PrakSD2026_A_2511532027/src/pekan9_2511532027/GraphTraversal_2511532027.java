package pekan9_2511532027;

import java.util.*;

public class GraphTraversal_2511532027 {
	private Map<String, List<String>> graph_2027 = new HashMap<>();
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge_2027(String node1_2027, String node2_2027) {
		graph_2027.putIfAbsent(node1_2027, new ArrayList<>());
		graph_2027.putIfAbsent(node2_2027, new ArrayList<>());
		graph_2027.get(node1_2027).add(node2_2027);
		graph_2027.get(node2_2027).add(node1_2027);
		}
		
		// Menampilkan graf awal
		public void printGraph_2027() {
			System.out.println("Graf Awal (Adjacency List):");
			for (String node_2027 : graph_2027.keySet()) {
				System.out.print(node_2027 + " -> ");
				List<String> neighbors_2027 = graph_2027.get(node_2027);
				System.out.println(String.join(", ", neighbors_2027));
			}
			System.out.println();
		}
		// DFS rekursif
		public void dfs_2027(String start_2027) {
			Set<String> visited_2027 = new HashSet<>();
			System.out.println("Penelusuran DFS:");
			dfsHelper_2027(start_2027, visited_2027);
			System.out.println();
		}
		private void dfsHelper_2027(String current_2027, Set<String> visited_2027) {
			if (visited_2027.contains(current_2027)) return;
			visited_2027.add(current_2027);
			System.out.print(current_2027 + " ");
			for (String neighbor_2027 : graph_2027.getOrDefault(current_2027, new ArrayList<>())) {
				dfsHelper_2027(neighbor_2027, visited_2027);
			}
		}
		// BFS iteratif
		public void bfs_2027(String start_2027) {
			Set<String> visited_2027 = new HashSet<>();
			Queue<String> queue_2027 = new LinkedList<>();
			queue_2027.add(start_2027);
			visited_2027.add(start_2027);
			System.out.println("Penelusuran BFS:");
			while (!queue_2027.isEmpty()) {
				String current_2027 = queue_2027.poll();
				System.out.print(current_2027 + " ");
				for (String neighbor_2027 : graph_2027.getOrDefault(current_2027, new ArrayList<>())) {
					if (!visited_2027.contains(neighbor_2027)) {
						queue_2027.add(neighbor_2027);
						visited_2027.add(neighbor_2027);
					}
				}
			}
			System.out.println();
		}
		// Main
		public static void main (String[] args) {
			GraphTraversal_2511532027 graph_2027 = new GraphTraversal_2511532027();
			
			// Contoh graf : A-B, A-C, B-D, B-E
			graph_2027.addEdge_2027("A", "B");
			graph_2027.addEdge_2027("A", "C");
			graph_2027.addEdge_2027("B", "D");
			graph_2027.addEdge_2027("B", "E");
			// Cetak graf awal
			System.out.println("Graf Awal adalah: ");
			graph_2027.printGraph_2027();
			// Lakukan penelusuran
			graph_2027.dfs_2027("A");
			graph_2027.bfs_2027("A");
		
	}
}
