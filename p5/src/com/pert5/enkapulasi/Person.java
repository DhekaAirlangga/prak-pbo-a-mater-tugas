package Praktikum.p5.src.com.pert5;

public class Person {
    private String nama;
    private int umur;
    private String alamat;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    };
    public void setUmur(int umur) {
        this.umur = umur;
    };
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    };

    // Getter
    public String getNama() {
        return this.nama;
    };
    public int getUmur() {
        return this.umur;
    };
    public String getAlamat() {
        return this.alamat;
    };
}
