package Praktikum.p3.src.com.pert3;

public class Mahasiswa {
    String npm;
    String nama;
    String jurusan;
    double ipk;

    public Mahasiswa(String paramNama, String paramJurusan, String paramNpm, double paramIpk) {
        this.npm = paramNpm;
        this.nama = paramNama;
        this.jurusan = paramJurusan;
        this.ipk = paramIpk;
    }

    public void tampilData() {
        System.out.println("NPM: " + this.npm);
        System.out.println("Nama: " + this.nama);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("IPK: " + this.ipk);
    }
}
