package com.pert5.enkapulasi;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        person.setNama("Mamat Petir");
        person.setUmur(30);
        person.setAlamat("Jl. Mangga No. 101, Bandung");

        System.out.println(
                "Nama: "
                        + person.getNama()
                        + "\nUmur: "
                        + person.getUmur()
                        + "\nAlamat: "
                        + person.getAlamat());

        person.setNama("Mamat Huajn");
        person.setUmur(20);
        person.setAlamat("Jl. Mangga No. 99, Bandung");

        System.out.println(
                "\nNama: "
                        + person.getNama()
                        + "\nUmur: "
                        + person.getUmur()
                        + "\nAlamat: "
                        + person.getAlamat());
    }
}
