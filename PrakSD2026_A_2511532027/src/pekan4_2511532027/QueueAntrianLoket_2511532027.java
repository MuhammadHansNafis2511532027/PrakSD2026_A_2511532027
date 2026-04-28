package pekan4_2511532027;

public class QueueAntrianLoket_2511532027 {
    int front_2027, rear_2027, max_2027;
    String queue_2027[];

    public QueueAntrianLoket_2511532027(int max_2027) {
        this.max_2027 = max_2027;
        queue_2027 = new String[max_2027];
        front_2027 = -1;
        rear_2027 = -1;
    }

    public boolean isEmpty_2027() {
        return front_2027 == -1;
    }

    public boolean isFull_2027() {
        return rear_2027 == max_2027 - 1;
    }

    public void enqueue_2027(String data_2027) {
        if (isFull_2027()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_2027()) {
                front_2027 = 0;
            }
            rear_2027++;
            queue_2027[rear_2027] = data_2027;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    public void dequeue_2027() {
        if (isEmpty_2027()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_2027[front_2027] + " telah dilayani");
            if (front_2027 == rear_2027) {
                front_2027 = rear_2027 = -1;
            } else {
                front_2027++;
            }
        }
    }

    public void display_2027() {
        if (isEmpty_2027()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no_2027 = 1;
            for (int i_2027 = front_2027; i_2027 <= rear_2027; i_2027++) {
                System.out.println(no_2027 + ". " + queue_2027[i_2027]);
                no_2027++;
            }
        }
    }

    public void reverse_2027() {
        if (isEmpty_2027()) {
            System.out.println("Antrian kosong!");
        } else {
            int i_2027 = front_2027;
            int j_2027 = rear_2027;

            while (i_2027 < j_2027) {
                String temp_2027 = queue_2027[i_2027];
                queue_2027[i_2027] = queue_2027[j_2027];
                queue_2027[j_2027] = temp_2027;
                i_2027++;
                j_2027--;
            }

            System.out.println("Isi antrian:");
            int no_2027 = 1;
            for (int k_2027 = front_2027; k_2027 <= rear_2027; k_2027++) {
                System.out.println(no_2027 + ". " + queue_2027[k_2027]);
                no_2027++;
            }
        }
    }
}
