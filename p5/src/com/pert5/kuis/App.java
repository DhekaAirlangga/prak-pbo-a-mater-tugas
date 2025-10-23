package com.pert5.kuis;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();

        animal.setNama("Kucing");
        animal.setUmur(3);

        System.out.println("Kucing " + animal.getUmur() + " tahun " + "sedang bermain");
    }
}
