package pekan6_2511532027;

public class Lagu_2511532027 {
	
    // atribut lagu
    String judul_2027;
    String penyanyi_2027;

    // pointer DLL
    Lagu_2511532027 next_2027;
    Lagu_2511532027 prev_2027;

    // konstruktor
    public Lagu_2511532027(String judul_2027, String penyanyi_2027) {
        this.judul_2027 = judul_2027;
        this.penyanyi_2027 = penyanyi_2027;
        this.next_2027 = null;
        this.prev_2027 = null;
    }

    // getter judul
    public String getJudul_2027() {
        return judul_2027;
    }

    // getter penyanyi
    public String getPenyanyi_2027() {
        return penyanyi_2027;
    }

    // setter judul
    public void setJudul_2027(String judul_2027) {
        this.judul_2027 = judul_2027;
    }

    // setter penyanyi
    public void setPenyanyi_2027(String penyanyi_2027) {
        this.penyanyi_2027 = penyanyi_2027;
    }
}
