package com.pert5.overloading;
public class Mobilsport {
    private String nama;

    public Mobilsport(String nama) {
        this.nama = nama;
    }
    public void gigi (int g) {
        System.out.println(nama + " masuk ke gigi " + g);
    }
     public void gigi (int g, int t) {
        System.out.println(nama + " masuk ke gigi " + g + " dengan turbo " + t);
     }
}
