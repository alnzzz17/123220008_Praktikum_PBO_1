/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

//"Kapal" sebagai subclass (kelas turunan) dari abstract class "Laut" 
public class Kapal extends Laut { //hanya mengextend method dari abstract class "Laut"
    
    //variabel instance
    private String nama;
    private String jenis;

    //konstruktor -> namakonstruktor(datatype1 parameter1, ...){...}
    Kapal(String n, String j) {
        this.nama = n;
        this.jenis = j;
    } //nilai-nilai yang diterima oleh parameter konstruktor (m dan j) disalin ke variabel instance (merk dan jenis)
      //'this' merujuk pada variabel instance dari objek yang sedang dibuat (merk dan jenis)

    @Override
    void belok() {
        System.out.println("Kapal laut " + nama + " berbelok."); //method spesifik untuk kelas "Kapal" yang diwariskan dari kelas abstrak"Laut"
    }

    @Override
    void info() {
        System.out.println("Kapal laut " + nama + " adalah kapal " + jenis + "."); //method spesifik untuk kelas "Kapal" yang diwariskan dari kelas abstrak "Laut"
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
        - terdapat parameter yang bertindak sebagai input yang diterima oleh konstruktor saat objek dibuat (objek disini ada dalam kelas "Motor")
        - dengan adanya parameter ini, konstruktor dapat menerima nilai-nilai tertentu yang akan digunakan untuk menginisialisasi objek
*/