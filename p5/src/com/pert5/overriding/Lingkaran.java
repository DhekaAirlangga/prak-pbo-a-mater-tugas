package com.pert5.overriding;

public class Lingkaran extends Bangundatar {
    private int r;
    public Lingkaran(int r) {
        this.r = r;
    }
    @Override
    public float luas() {
        System.out.println("Menghitung luas lingkaran");
        return 3.14f * r * r;
    }

    @Override
    public float keliling() {
        System.out.println("Menghitung keliling lingkaran");
        return (float) (2 * Math.PI) * r;
    }

    
}
