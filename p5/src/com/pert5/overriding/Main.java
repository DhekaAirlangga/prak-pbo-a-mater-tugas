package com.pert5.overriding;

public class Main {
    public static void main(String[] args) {
        Bangundatar Bangundatar = new Bangundatar();
        Lingkaran el = new Lingkaran(7);

        Bangundatar.luas();
        Bangundatar.keliling();

        System.out.println("Luas Lingkaran:" + el.luas());
        System.out.println("Keliling Lingkaran:" + el.keliling());
    }
    
}
