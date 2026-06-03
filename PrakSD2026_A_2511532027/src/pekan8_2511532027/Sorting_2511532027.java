package pekan8_2511532027;

import java.util.Scanner;

public class Sorting_2511532027 {

    Lagu_2511532027[] dataLagu_2027 = new Lagu_2511532027[20];
    int jumlahData_2027;

    public void inputData_2027() {
        Scanner input_2027 = new Scanner(System.in);
        do {
            System.out.print("Masukkan jumlah lagu (7-20): ");
            jumlahData_2027 = input_2027.nextInt();
            input_2027.nextLine();
            if (jumlahData_2027 < 7 || jumlahData_2027 > 20) {
                System.out.println("Jumlah lagu harus antara 7 sampai 20!");
            }
        } while (jumlahData_2027 < 7 || jumlahData_2027 > 20);
        for (int i_2027 = 0; i_2027 < jumlahData_2027; i_2027++) {
            System.out.println("\nData Lagu ke-" + (i_2027 + 1));
            System.out.print("Judul    : ");
            String judul_2027 = input_2027.nextLine();
            System.out.print("Penyanyi : ");
            String penyanyi_2027 = input_2027.nextLine();
            System.out.print("Durasi   : ");
            int durasi_2027 = input_2027.nextInt();
            input_2027.nextLine();
            dataLagu_2027[i_2027] = new Lagu_2511532027(judul_2027, penyanyi_2027, durasi_2027);
        }
    }

    public void tampilData_2027() {
        for (int i_2027 = 0; i_2027 < jumlahData_2027; i_2027++) {
            System.out.println((i_2027 + 1) + ". " + dataLagu_2027[i_2027]
                            .getJudul_2027() + " - " + dataLagu_2027[i_2027]
                            .getPenyanyi_2027() + " - " + dataLagu_2027[i_2027]
                            .getDurasi_2027() + " detik");
        }
    }

    private void tukar_2027(int i_2027, int j_2027) {
        Lagu_2511532027 sementara_2027 = dataLagu_2027[i_2027];
        dataLagu_2027[i_2027] = dataLagu_2027[j_2027];
        dataLagu_2027[j_2027] = sementara_2027;
    }

    public void shellSort_2027() {
        for (int gap_2027 = jumlahData_2027 / 2; gap_2027 > 0; gap_2027 /= 2) {
            for (int i_2027 = gap_2027; i_2027 < jumlahData_2027; i_2027++) {
                Lagu_2511532027 temp_2027 = dataLagu_2027[i_2027];
                int j_2027 = i_2027;
                while (j_2027 >= gap_2027 && dataLagu_2027[j_2027 - gap_2027].getJudul_2027()
                                .compareToIgnoreCase(temp_2027.getJudul_2027()) > 0) {
                    dataLagu_2027[j_2027] = dataLagu_2027[j_2027 - gap_2027];
                    j_2027 -= gap_2027;
                }
                dataLagu_2027[j_2027] = temp_2027;
            }
        }
    }

    public void quickSort_2027(int kiri_2027, int kanan_2027) {
        int i_2027 = kiri_2027;
        int j_2027 = kanan_2027;
        int pivot_2027 = dataLagu_2027[(kiri_2027 + kanan_2027) / 2].getDurasi_2027();
        while (i_2027 <= j_2027) {
            while (dataLagu_2027[i_2027].getDurasi_2027() < pivot_2027) {
                i_2027++;
            }
            while (dataLagu_2027[j_2027].getDurasi_2027() > pivot_2027) {
                j_2027--;
            }
            if (i_2027 <= j_2027) {
                tukar_2027(i_2027, j_2027);
                i_2027++;
                j_2027--;
            }
        }
        if (kiri_2027 < j_2027) {
            quickSort_2027(kiri_2027, j_2027);
        }
        if (i_2027 < kanan_2027) {
            quickSort_2027(i_2027, kanan_2027);
        }
    }

    public void mergeSort_2027(int kiri_2027, int kanan_2027) {
        if (kiri_2027 < kanan_2027) {
            int tengah_2027 = (kiri_2027 + kanan_2027) / 2;
            mergeSort_2027(kiri_2027, tengah_2027);
            mergeSort_2027(tengah_2027 + 1, kanan_2027);
            gabung_2027(kiri_2027, tengah_2027, kanan_2027);
        }
    }

    public void gabung_2027(int kiri_2027, int tengah_2027, int kanan_2027) {
        Lagu_2511532027[] bantu_2027 = new Lagu_2511532027[20];
        int i_2027 = kiri_2027;
        int j_2027 = tengah_2027 + 1;
        int k_2027 = kiri_2027;
        while (i_2027 <= tengah_2027 && j_2027 <= kanan_2027) {
            if (dataLagu_2027[i_2027].getJudul_2027()
                    .compareToIgnoreCase(dataLagu_2027[j_2027].getJudul_2027()) <= 0) {
                bantu_2027[k_2027++] = dataLagu_2027[i_2027++];
            } else {
                bantu_2027[k_2027++] = dataLagu_2027[j_2027++];
            }
        }
        while (i_2027 <= tengah_2027) {
            bantu_2027[k_2027++] = dataLagu_2027[i_2027++];
        }
        while (j_2027 <= kanan_2027) {
            bantu_2027[k_2027++] = dataLagu_2027[j_2027++];
        }
        for (int indeks_2027 = kiri_2027; indeks_2027 <= kanan_2027; indeks_2027++) {
            dataLagu_2027[indeks_2027] = bantu_2027[indeks_2027];
        }
    }

    public static void main(String[] args) {
        Scanner input_2027 = new Scanner(System.in);
        Sorting_2511532027 playlist_2027 = new Sorting_2511532027();
        playlist_2027.inputData_2027();
        System.out.println("\n=== Sorting Playlist NIM: 2511532027 ===");
        System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilihan_2027 = input_2027.nextInt();
        System.out.println("\nData Sebelum Sorting:");
        playlist_2027.tampilData_2027();
        switch (pilihan_2027) {
            case 1:
                playlist_2027.shellSort_2027();
                System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
                break;
            case 2:
                playlist_2027.quickSort_2027(0, playlist_2027.jumlahData_2027 - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                break;
            case 3:
                playlist_2027.mergeSort_2027(0, playlist_2027.jumlahData_2027 - 1);
                System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        playlist_2027.tampilData_2027();
    }
}