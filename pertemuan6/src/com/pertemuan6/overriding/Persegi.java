package com.pertemuan6.overriding;

public class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        System.out.println("Menghitung luas persegi");
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        System.out.println("Menghitung keliling persegi");
        return 4 * sisi;
    }
}
