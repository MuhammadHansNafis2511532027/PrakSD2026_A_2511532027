package pekan2_2511532027;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Musik_2511532027> playlist = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2311532027 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();

                    playlist.add(new Musik_2511532027(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        System.out.println("\nDaftar Lagu:");
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511532027 lagu = playlist.get(i);
                            System.out.println((i + 1) + ". " +
                                lagu.getJudul_2027() + " - " +
                                lagu.getPenyanyi_2027() + " (" +
                                lagu.getDurasi_2027() + " detik)");
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong!");
                    } else {
                        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                        int index = input.nextInt();

                        if (index > 0 && index <= playlist.size()) {
                            playlist.remove(index - 1);
                            System.out.println("Lagu berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu dalam playlist: " + playlist.size());
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}