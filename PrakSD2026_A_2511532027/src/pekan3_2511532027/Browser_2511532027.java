package pekan3_2511532027;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532027 {
    public static void main(String[] args) {
        Stack<Website_2511532027> history_2027 = new Stack<>();
        Scanner input_2027 = new Scanner(System.in);
        int pilihan_2027;

        do {
            System.out.println("\n=== Browser History NIM: 2511532027 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2027 = input_2027.nextInt();
            input_2027.nextLine(); // buang newline

            switch (pilihan_2027) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_2027 = input_2027.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url_2027 = input_2027.nextLine();

                    Website_2511532027 web_2027 = new Website_2511532027(judul_2027, url_2027);
                    history_2027.push(web_2027);
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_2027.isEmpty()) {
                        Website_2511532027 hapus_2027 = history_2027.pop();
                        System.out.println("Halaman dihapus:");
                        System.out.println(hapus_2027.getJudul_2027());
                    } else {
                        System.out.println("History kosong! Tidak bisa back.");
                    }
                    break;

                case 3:
                    if (!history_2027.isEmpty()) {
                        System.out.println("Halaman aktif:");
                        System.out.println(history_2027.peek());
                    } else {
                        System.out.println("Tidak ada halaman yang dibuka.");
                    }
                    break;

                case 4:
                    if (history_2027.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history_2027.size());
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2027 != 5);

        input_2027.close();
    }
}