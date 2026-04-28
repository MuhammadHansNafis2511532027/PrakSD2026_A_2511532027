package pekan4_2511532027;

public class QueueArray_2511532027 {
	int front_2027, rear_2027, size_2027;
	int capacity_2027;
	int array_2027[];
	
	public QueueArray_2511532027(int capacity_2027) {
		this.capacity_2027 = capacity_2027;
		front_2027 = this.size_2027 = 0;
		rear_2027 = capacity_2027 - 1;
		array_2027 = new int[this.capacity_2027];
	}
	
	boolean isFull_2027(QueueArray_2511532027 queue_2027) {
		return (queue_2027.size_2027 == queue_2027.capacity_2027);
	}
	
	boolean isEmpty_2027(QueueArray_2511532027 queue_2027) {
		return (queue_2027.size_2027 == 0);
	}
	
	void enqueue_2027(int item_2027) {
		if (isFull_2027(this))
			return;
		this.rear_2027 = (this.rear_2027 + 1) % this.capacity_2027;
		this.array_2027[this.rear_2027] = item_2027;
		this.size_2027 = this.size_2027 + 1;
		System.out.println(item_2027 + " enqueued to queue");
	}
	
	int dequeue_2027() {
		if (isEmpty_2027(this))
			return Integer.MIN_VALUE;
		int item_2027 = this.array_2027[this.front_2027];
		this.front_2027 = (this.front_2027 + 1) % this.capacity_2027;
		this.size_2027 = this.size_2027 - 1;
		return item_2027;
	}
	int front_2027() {
		if (isEmpty_2027(this))
			return Integer.MIN_VALUE;
		return this.array_2027[this.front_2027];
	}
	int rear_2027() {
		if (isEmpty_2027(this))
			return Integer.MIN_VALUE;
		return this.array_2027[this.rear_2027];
	}
	// mencetak elemen antrian
	void display_2027() {
		int i_2027;
		if (front_2027 == rear_2027) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i_2027 = front_2027; i_2027 < rear_2027; i_2027++) {
			System.out.printf(" %d <--", array_2027[i_2027]);
		}
			return;
	}
}
