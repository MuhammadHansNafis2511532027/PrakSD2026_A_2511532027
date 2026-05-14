package pekan6_2511532027;

import java.util.Scanner;

public class Musik_2511532027 {

    // head dan tail
    Lagu_2511532027 head_2027 = null;
    Lagu_2511532027 tail_2027 = null;

    // tambah lagu di akhir
    public void tambahLagu_2027(String judul_2027, String penyanyi_2027) {

    Lagu_2511532027 laguBaru_2027 = new Lagu_2511532027(judul_2027, penyanyi_2027);

    // jika playlist kosong
    if (head_2027 == null) {
    	head_2027 = laguBaru_2027;
    	tail_2027 = laguBaru_2027;
        } else {
        	tail_2027.next_2027 = laguBaru_2027;
            laguBaru_2027.prev_2027 = tail_2027;
            tail_2027 = laguBaru_2027;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // hapus lagu awal
    public void hapusLaguAwal_2027() {

        // jika kosong
        if (head_2027 == null) {
        	System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Lagu \"" + head_2027.judul_2027 + "\" berhasil dihapus.");

        // jika hanya 1 lagu
        if (head_2027 == tail_2027) {
            head_2027 = null;
            tail_2027 = null;
        } else {
            head_2027 = head_2027.next_2027;
            head_2027.prev_2027 = null;
        }
    }

    // tampil maju
    public void tampilMaju_2027() {

        if (head_2027 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532027 bantu_2027 = head_2027;
        System.out.println("=== Playlist Maju ===");
        while (bantu_2027 != null) {
            System.out.println(bantu_2027.judul_2027 + " - " + bantu_2027.penyanyi_2027);
            bantu_2027 = bantu_2027.next_2027;
        }
    }

    // tampil mundur
    public void tampilMundur_2027() {
        if (tail_2027 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532027 bantu_2027 = tail_2027;
        System.out.println("=== Playlist Mundur ===");
        while (bantu_2027 != null) {
            System.out.println(bantu_2027.judul_2027 + " - " + bantu_2027.penyanyi_2027);
            bantu_2027 = bantu_2027.prev_2027;
        }
    }

    // cari lagu
    public void cariLagu_2027(String judul_2027) {
        if (head_2027 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532027 bantu_2027 = head_2027;
        boolean ketemu_2027 = false;
        while (bantu_2027 != null) {
            if (bantu_2027.judul_2027.equalsIgnoreCase(judul_2027)) {
                System.out.println("Lagu ditemukan!");
                System.out.println("Judul : " + bantu_2027.judul_2027);
                System.out.println("Penyanyi : " + bantu_2027.penyanyi_2027);
                ketemu_2027 = true;
                break;
            }
            bantu_2027 = bantu_2027.next_2027;
        }
        if (!ketemu_2027) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    // main program
    public static void main(String[] args) {
        Scanner input_2027 = new Scanner(System.in);
        Musik_2511532027 musik_2027 = new Musik_2511532027();
        int pilihan_2027;
        do {
            System.out.println("\n=== Playlist Musik NIM: 2511532027 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");

            System.out.print("Pilihan: ");
            pilihan_2027 = input_2027.nextInt();
            input_2027.nextLine();

            switch (pilihan_2027) {
                case 1:
                    System.out.print("Judul Lagu: ");
                    String judul_2027 = input_2027.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_2027 = input_2027.nextLine();
                    musik_2027.tambahLagu_2027( judul_2027, penyanyi_2027);
                    break;

                case 2:
                    musik_2027.hapusLaguAwal_2027();
                    break;

                case 3:
                    musik_2027.tampilMaju_2027();
                    break;

                case 4:
                    musik_2027.tampilMundur_2027();
                    break;

                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari_2027 = input_2027.nextLine();
                    musik_2027.cariLagu_2027(cari_2027);
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_2027 != 6);
        input_2027.close();
    }
}