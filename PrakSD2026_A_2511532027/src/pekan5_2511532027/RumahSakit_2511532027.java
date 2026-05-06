package pekan5_2511532027;

import java.util.Scanner;

public class RumahSakit_2511532027 {
    static Pasien_2511532027 head_2027 = null;
    static int counter_2027 = 0;

    public static void daftarPasien_2027(String nama_2027, String penyakit_2027) {
        counter_2027++;
        Pasien_2511532027 baru_2027 = new Pasien_2511532027(nama_2027, penyakit_2027, counter_2027);

        if (head_2027 == null) {
            head_2027 = baru_2027;
        } else {
            Pasien_2511532027 temp_2027 = head_2027;
            while (temp_2027.getNext_2027() != null) {
                temp_2027 = temp_2027.getNext_2027();
            }
            temp_2027.setNext_2027(baru_2027);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_2027);
    }

    public static void panggilPasien_2027() {
        if (head_2027 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil Pasien:");
            System.out.println("Nama     : " + head_2027.getNamaPasien_2027());
            System.out.println("Keluhan  : " + head_2027.getPenyakit_2027());
            System.out.println("No Antri : " + head_2027.getNomorAntrian_2027());

            head_2027 = head_2027.getNext_2027();
        }
    }

    public static void tampilkanAntrian_2027() {
        if (head_2027 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511532027 temp_2027 = head_2027;
        int posisi_2027 = 1;

        while (temp_2027 != null) {
            System.out.println("Posisi " + posisi_2027);
            System.out.println("Nama     : " + temp_2027.getNamaPasien_2027());
            System.out.println("Keluhan  : " + temp_2027.getPenyakit_2027());
            System.out.println("No Antri : " + temp_2027.getNomorAntrian_2027());
            System.out.println("-------------------------");

            temp_2027 = temp_2027.getNext_2027();
            posisi_2027++;
        }
    }

    public static void cariPasien_2027(String namaCari_2027) {
        Pasien_2511532027 temp_2027 = head_2027;
        boolean ditemukan_2027 = false;

        while (temp_2027 != null) {
            if (temp_2027.getNamaPasien_2027().equalsIgnoreCase(namaCari_2027)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("Nama     : " + temp_2027.getNamaPasien_2027());
                System.out.println("Keluhan  : " + temp_2027.getPenyakit_2027());
                System.out.println("No Antri : " + temp_2027.getNomorAntrian_2027());
                ditemukan_2027 = true;
                break;
            }
            temp_2027 = temp_2027.getNext_2027();
        }

        if (!ditemukan_2027) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    public static void cekStatus_2027() {
        if (head_2027 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah_2027 = 0;
        Pasien_2511532027 temp_2027 = head_2027;

        while (temp_2027 != null) {
            jumlah_2027++;
            temp_2027 = temp_2027.getNext_2027();
        }

        System.out.println("Jumlah pasien: " + jumlah_2027);
        System.out.println("Pasien terdepan:");
        System.out.println("Nama     : " + head_2027.getNamaPasien_2027());
        System.out.println("Keluhan  : " + head_2027.getPenyakit_2027());
    }

    public static void main(String[] args) {
        Scanner input_2027 = new Scanner(System.in);
        int pilihan_2027;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532027 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2027 = input_2027.nextInt();
            input_2027.nextLine();

            switch (pilihan_2027) {
                case 1:
                    System.out.print("Nama Pasien : ");
                    String nama_2027 = input_2027.nextLine();
                    System.out.print("Keluhan     : ");
                    String penyakit_2027 = input_2027.nextLine();
                    daftarPasien_2027(nama_2027, penyakit_2027);
                    break;

                case 2:
                    panggilPasien_2027();
                    break;

                case 3:
                    tampilkanAntrian_2027();
                    break;

                case 4:
                    System.out.print("Masukkan nama pasien: ");
                    String cari_2027 = input_2027.nextLine();
                    cariPasien_2027(cari_2027);
                    break;

                case 5:
                    cekStatus_2027();
                    break;

                case 6:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2027 != 6);
        input_2027.close();
    }
}
