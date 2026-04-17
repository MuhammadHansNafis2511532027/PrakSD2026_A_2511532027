package pekan2_2511532027;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532027 {
    public static void main(String[] args) {
        Scanner input_2027 = new Scanner(System.in);
        ArrayList<Musik_2511532027> playlist_2027 = new ArrayList<>();

        int pilihan_2027;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2311532027 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2027 = input_2027.nextInt();
            input_2027.nextLine(); // buang enter

            switch (pilihan_2027) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_2027 = input_2027.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi_2027 = input_2027.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi_2027 = input_2027.nextInt();

                    playlist_2027.add(new Musik_2511532027(judul_2027, penyanyi_2027, durasi_2027));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist_2027.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        System.out.println("\nDaftar Lagu:");
                        for (int i = 0; i < playlist_2027.size(); i++) {
                            Musik_2511532027 lagu_2027 = playlist_2027.get(i);
                            System.out.println((i + 1) + ". " +
                                lagu_2027.getJudul_2027() + " - " +
                                lagu_2027.getPenyanyi_2027() + " (" +
                                lagu_2027.getDurasi_2027() + " detik)");
                        }
                    }
                    break;

                case 3:
                    if (playlist_2027.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                        int index = input_2027.nextInt();

                        if (index > 0 && index <= playlist_2027.size()) {
                            playlist_2027.remove(index - 1);
                            System.out.println("Lagu berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu dalam playlist: " + playlist_2027.size());
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2027 != 5);

        input_2027.close();
    }
}