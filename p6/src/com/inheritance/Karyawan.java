package com.inheritance;

public class Karyawan {
    protected String KodeKaryawan;
    protected String nama;


public Karyawan(String KodeKaryawan, String nama) {
    this.KodeKaryawan = KodeKaryawan;
    this.nama = nama;
}

public void absenpagi() {
    System.out.println(this.nama +"  :  absen pagi.");
}

public void kerja() {
    System.out.println(this.nama +"  :  sedang kerja.");
}

public void absenpulang() {
    System.out.println(this.nama +"  :  absen pulang.");
}

public void getInfo() {
    System.out.println("nama Karyawan : " + this.nama);
    System.out.println("Kode Karyawan : " + this.KodeKaryawan);
}

}
