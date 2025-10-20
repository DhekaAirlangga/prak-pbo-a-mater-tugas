# 🐾 Program Data Hewan - Java OOP

## 📘 Deskripsi
Program ini merupakan implementasi sederhana dari **konsep dasar Pemrograman Berorientasi Objek (OOP)** menggunakan bahasa **Java**.  
Program berfungsi untuk **menginput, menampilkan, dan menampilkan aktivitas hewan**, seperti bermain dan tidur.

Program ini menggunakan **kelas `Animal`** untuk merepresentasikan data hewan dengan atribut **nama**, **umur**, dan **tipe**.  
Selain itu, terdapat **kelas `App`** sebagai kelas utama yang menangani input dari pengguna melalui **class `Scanner`**.

---

## 🚀 Cara Menjalankan Program
1. Tetap di direktori `root`
2. Kompilasi file Java
    ```bash
    javac -d bin .\src\tugas\*.java; 
    ```
3. Jalankan program
    ```bash
    java -cp bin tugas.App
    ```

---

## 💡 Contoh Output Program
```bash
Masukkan nama hewan: Kucing
Masukkan tipe hewan: Mamalia
Masukkan umur hewan: 3

=== Data Hewan ===
Nama: Kucing
Tipe: Mamalia
Umur: 3 tahun
===================

Kucing yang berumur 3 tahun sedang bermain-main!
Kucing yang berumur 3 tahun sedang tidur!
```