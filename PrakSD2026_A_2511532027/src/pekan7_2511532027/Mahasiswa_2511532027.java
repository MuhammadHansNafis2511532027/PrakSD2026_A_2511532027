package pekan7_2511532027;

public class Mahasiswa_2511532027 {

    private String nama_2027;
    private String nim_2027;
    private String prodi_2027;

    // Constructor
    public Mahasiswa_2511532027(
            String nama_2027,
            String nim_2027,
            String prodi_2027) {

        this.nama_2027 = nama_2027;
        this.nim_2027 = nim_2027;
        this.prodi_2027 = prodi_2027;
    }

    // Getter dan Setter
    public String getNama_2027() {
        return nama_2027;
    }

    public void setNama_2027(String nama_2027) {
        this.nama_2027 = nama_2027;
    }

    public String getNim_2027() {
        return nim_2027;
    }

    public void setNim_2027(String nim_2027) {
        this.nim_2027 = nim_2027;
    }

    public String getProdi_2027() {
        return prodi_2027;
    }

    public void setProdi_2027(String prodi_2027) {
        this.prodi_2027 = prodi_2027;
    }

    @Override
    public String toString() {
        return nama_2027;
    }
}
