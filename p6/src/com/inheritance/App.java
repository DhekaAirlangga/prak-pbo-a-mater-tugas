package com.inheritance;

public class App {
    public static void main(String[] args) throws Exception {
        Karyawan Ridho = new Karyawan("12345", "Ridho");
        Karyawan Melan = new Karyawan("12346", "Melan");
        Ridho.getInfo();
        Melan.getInfo();
        Ridho.absenpagi();
        Ridho.kerja();
        Melan.absenpagi();
        Melan.kerja();
        Ridho.absenpulang();
        Melan.absenpulang();

        System.out.println("\n");

        Dosen Andiani = new Dosen("23455", "332211", "Andiani");
        Dosen Ionia = new Dosen("23456", "332212", "Ionia");
        Andiani.getInfo();
        Ionia.getInfo();
        Andiani.absenpagi();
        Andiani.ngajar();
        Ionia.absenpagi();
        Ionia.ngajar();
        Andiani.absenpulang();
        Ionia.absenpulang();

    }
}
