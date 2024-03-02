/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

//"Pesawat" mewarisi method dari interface "Kendaraan"
public class Pesawat implements Kendaraan { //hanya mengimplementasikan method dari interface "Kendaraan" karena dianggap bukan merupakan bagian (subclass) dari kendaraan darat (kelas "Darat")
    
    //variabel instance
    private String nama;
    
    //konstruktor -> namakonstruktor(datatype1 parameter1, ...){...}
    Pesawat(String n) {
        this.nama = n;
    } //nilai-nilai yang diterima oleh parameter konstruktor (m) disalin ke variabel instance (merk)
      //'this' merujuk pada variabel instance dari objek yang sedang dibuat (merk)

    @Override
    public void bergerak() {
        System.out.println("Pesawat " + nama + " terbang di angkasa."); //method yang diimplementasikan dari interface "Kendaraan"
    }
}

/*
NOTE:
    @Override :
        - konsep di mana sebuah method yang didefinisikan dalam superclass atau interface dapat didefinisikan ulang (override) di dalam subclass atau kelas yang mengimplementasikannya
        - ketika sebuah method dioverride di dalam subclass, artinya subclass tersebut memberikan implementasi khusus untuk method tersebut, yang mungkin berbeda dari implementasi yang diberikan oleh superclass atau interface
        - override mencetak pesan/melakukan method yang spesifik di setiap kelas turunan
    Konstruktor :
        - memiliki nama yang sama dengan nama kelasnya
        - terdapat parameter yang bertindak sebagai input yang diterima oleh konstruktor saat objek dibuat (objek disini ada dalam kelas "Pesawat")
        - dengan adanya parameter ini, konstruktor dapat menerima nilai-nilai tertentu yang akan digunakan untuk menginisialisasi objek
*/