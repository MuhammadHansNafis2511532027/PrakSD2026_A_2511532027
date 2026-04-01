package pekan1_2511532027;

import java.util.ArrayList;

public class DriverMobil_2511532027 {
    static String nim = "2511532027";

    public static void main(String[] args) {

        ArrayList<Mobil_2511532027> daftarMobil = new ArrayList<>();

        Mobil_2511532027 m1 = new Mobil_2511532027("Mercedes Benz C-Class", 2021, 1991, 779000000, "Mercedes");
        Mobil_2511532027 m2 = new Mobil_2511532027("MX-5 Miata", 2025, 1998, 849000000, "Mazda");
        Mobil_2511532027 m3 = new Mobil_2511532027("86", 2022, 1988, 830000000, "Toyota");
        Mobil_2511532027 m4 = new Mobil_2511532027("WRX", 2026, 2387, 909500000, "Subaru");

        tambahMobil(daftarMobil, m1);
        tambahMobil(daftarMobil, m2);
        tambahMobil(daftarMobil, m3);
        tambahMobil(daftarMobil, m4);

        System.out.println("Daftar Mobil:");
        for (Mobil_2511532027 m : daftarMobil) {
            m.tampilkanMobil();
        }

        hapusMobil(daftarMobil, 0);

        System.out.println("Setelah dihapus:");
        for (Mobil_2511532027 m : daftarMobil) {
            m.tampilkanMobil();
        }
    }

    public static void tambahMobil(ArrayList<Mobil_2511532027> list, Mobil_2511532027 mobil) {
        list.add(mobil);
        System.out.println("Mobil berhasil ditambahkan!");
    }

    public static void hapusMobil(ArrayList<Mobil_2511532027> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Mobil berhasil dihapus!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
}