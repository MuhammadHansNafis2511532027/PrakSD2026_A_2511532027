package pekan4_2511532027;

import java.util.Scanner;

public class QueueAntrianLoketDriver_2511532027 {
    public static void main(String[] args) {
        Scanner input_2027 = new Scanner(System.in);
        QueueAntrianLoket_2511532027 antrian_2027 = new QueueAntrianLoket_2511532027(1000);

        int pilihan_2027;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2027 = input_2027.nextInt();
            input_2027.nextLine();

            switch (pilihan_2027) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_2027 = input_2027.nextLine();
                    antrian_2027.enqueue_2027(nama_2027);
                    break;

                case 2:
                    antrian_2027.dequeue_2027();
                    break;

                case 3:
                    antrian_2027.display_2027();
                    break;

                case 4:
                    antrian_2027.reverse_2027();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2027 != 5);

        input_2027.close();
    }
}