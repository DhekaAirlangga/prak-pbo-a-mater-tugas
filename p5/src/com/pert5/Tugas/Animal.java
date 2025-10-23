package com.pert5.Tugas;

public class Animal {
    private String name;
    private int age;
    private String type;

    // Setter
    public void setName(String name) {
        this.name = name;
    };

    public void setAge(int age) {
        this.age = age;
    };

    public void setType(String type) {
        this.type = type;
    };

    // Getter
    public String getName() {
        return this.name;
    };

    public int getAge() {
        return this.age;
    };

    public String getType() {
        return this.type;
    };

    public void inputData(String name, int age, String type) {
        setName(name);
        setAge(age);
        setType(type);
    }

    public void showData() {
        System.out.println("\n=== Data Hewan ===");
        System.out.println("Nama: " + this.getName());
        System.out.println("Tipe: " + this.getType());
        System.out.println("Umur: " + this.getAge() + " tahun");
        System.out.println("===================\n");
    }

    public void playing() {
        System.out.println(this.getName() + " yang berumur " + this.getAge() + " tahun" + " sedang bermain-main!");
    }

    public void sleeping() {
        System.out.println(this.getName() + " yang berumur " + this.getAge() + " tahun" + " sedang tidur!");
    }
}
