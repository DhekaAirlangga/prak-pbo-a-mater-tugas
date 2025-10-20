package Praktikum.p3.src.com.pert3;

public class Pegawai {
    
    public String nama;
    private String npwp;
    protected String mataKuliah;

    public Pegawai(
        String paramNama, 
        String paramNpwp, 
        String paramMataKuliah
    ) {
        this.nama = paramNama;
        this.npwp = paramNpwp;
        this.mataKuliah = paramMataKuliah;        
    }

    public void tampilData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NPWP: " + this.npwp);
        System.out.println("Mata Kuliah: " + this.mataKuliah);

        this.mengajar();
    }


    private void mengajar() {
        System.out.println("Dosen " + this.nama + " mengajar mata kuliah " + this.mataKuliah);
    }

    protected void istirahat() {
        System.out.println("Dosen " + this.nama + " sedang istirahat.");
    }
}
