package pekan4_2511532027;

public class QueueArrayDriver_2511532027 {
	public static void main (String[] args) {
		QueueArray_2511532027 queue_2027 = new QueueArray_2511532027(1000);
		queue_2027.enqueue_2027(10);
		queue_2027.enqueue_2027(20);
		queue_2027.enqueue_2027(30);
		queue_2027.enqueue_2027(40);
		System.out.println("Item di depan " + queue_2027.front_2027());
		System.out.println("Item paling belakang " + queue_2027.rear_2027());
		System.out.println("tampilan queue");
		queue_2027.display_2027();
		System.out.println();
		System.out.println(queue_2027.dequeue_2027() + " dihapus dari queue");
		System.out.println("Item di depan : " + queue_2027.front_2027());
		System.out.println("Item paling belakang: " + queue_2027.rear_2027());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_2027.display_2027();
	}
}
