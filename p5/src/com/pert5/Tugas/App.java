package com.pert5.Tugas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama hewan: ");
        String name = input.nextLine();

        System.out.print("Masukkan tipe hewan: ");
        String type = input.nextLine();

        System.out.print("Masukkan umur hewan: ");
        int age = input.nextInt();
        input.nextLine();

        if (age > 0) {
            animal.inputData(name, age, type);
            animal.showData();
            animal.playing();
            animal.sleeping();
        } else {
            System.out.println();
            System.out.println("Umur harus lebih dari 0!");
        }

        input.close();
    }
}
