package com.pertemuan6;

import java.util.ArrayList;

import com.pertemuan6.overriding.BangunDatar;
import com.pertemuan6.overriding.Lingkaran;
import com.pertemuan6.overriding.Persegi;
import com.pertemuan6.overriding.PersegiPanjang;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            * Overriding
                * Parent class: BangunDatar
                    * Child class: Lingkaran
                    * Child class: Persegi
                    * Child class: Persegi Panjang
         */

        String[] names = { "Lingkaran", "Persegi", "Persegi Panjang" };
        ArrayList<BangunDatar> listBangunDatar = new ArrayList<BangunDatar>();

        listBangunDatar.add(new Lingkaran(5));
        listBangunDatar.add(new Persegi(5));
        listBangunDatar.add(new PersegiPanjang(5, 10));

        for (int i = 0; i < names.length; i++) {
            System.out.println("\n=======================");
            System.out.println("   " + names[i] + "   ");
            System.out.println("=======================");
            
            System.out.println("Luas: " + listBangunDatar.get(i).luas());
            System.out.println("Keliling: " + listBangunDatar.get(i).keliling());
            System.out.println("=======================");
        }
    }
}