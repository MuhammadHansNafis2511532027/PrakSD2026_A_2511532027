package pekan5_2511532027;

public class Pasien_2511532027 {
    private String namaPasien_2027;
    private String penyakit_2027;
    private int nomorAntrian_2027;
    private Pasien_2511532027 next_2027;

    public Pasien_2511532027(String nama_2027, String penyakit_2027, int nomor_2027) {
        this.namaPasien_2027 = nama_2027;
        this.penyakit_2027 = penyakit_2027;
        this.nomorAntrian_2027 = nomor_2027;
        this.next_2027 = null;
    }

    public String getNamaPasien_2027() {
        return namaPasien_2027;
    }

    public String getPenyakit_2027() {
        return penyakit_2027;
    }

    public int getNomorAntrian_2027() {
        return nomorAntrian_2027;
    }

    public Pasien_2511532027 getNext_2027() {
        return next_2027;
    }

    public void setNamaPasien_2027(String nama_2027) {
        this.namaPasien_2027 = nama_2027;
    }

    public void setPenyakit_2027(String penyakit_2027) {
        this.penyakit_2027 = penyakit_2027;
    }

    public void setNomorAntrian_2027(int nomor_2027) {
        this.nomorAntrian_2027 = nomor_2027;
    }

    public void setNext_2027(Pasien_2511532027 next_2027) {
        this.next_2027 = next_2027;
    }
}
