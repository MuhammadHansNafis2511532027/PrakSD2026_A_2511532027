package pekan3_2511532027;

public class Website_2511532027 {
    private String judul_2027;
    private String url_2027;

    // Constructor
    public Website_2511532027(String judul_2027, String url_2027) {
        this.judul_2027 = judul_2027;
        this.url_2027 = url_2027;
    }

    // Getter
    public String getJudul_2027() {
        return judul_2027;
    }

    public String getUrl_2027() {
        return url_2027;
    }

    // Setter
    public void setJudul_2027(String judul_2027) {
        this.judul_2027 = judul_2027;
    }

    public void setUrl_2027(String url_2027) {
        this.url_2027 = url_2027;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_2027 + "\nURL: " + url_2027;
    }
}
