/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

//"Mobil" sebagai subclass (kelas turunan) dari abstract class "Darat" 
public class Mobil extends Darat implements Kendaraan { //mengextend method dari abstract class "Darat" dan mengimplementasikan method dari interface "Kendaraan"

    //variabel instance
    private String merk;
    private String jenis;

    //konstruktor -> namakonstruktor(datatype1 parameter1, ...){...}
    Mobil(String m, String j) {
        this.merk = m;
        this.jenis = j;
    } //nilai-nilai yang diterima oleh parameter konstruktor (m dan j) disalin ke variabel instance (merk dan jenis)
      //'this' merujuk pada variabel instance dari objek yang sedang dibuat (merk dan jenis)

    @Override
    void belok() {
        System.out.println("Mobil " + merk + " belok."); //method spesifik untuk kelas "Mobil"
    }

    @Override
    void rem() {
        System.out.println("Mobil " + merk + " melakukan pengereman."); //method yang diimplementasikan dari kelas abstrak "Darat"
    }

    @Override
    void info() {
        System.out.println("Mobil " + merk + " adalah mobil " + jenis + "."); //method yang diimplementasikan dari kelas abstrak "Darat"
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil " + merk + " bergerak maju."); //method yang diimplementasikan dari interface "Kendaraan"
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
        - terdapat parameter yang bertindak sebagai input yang diterima oleh konstruktor saat objek dibuat (objek disini ada dalam kelas "Mobil")
        - dengan adanya parameter ini, konstruktor dapat menerima nilai-nilai tertentu yang akan digunakan untuk menginisialisasi objek
*/
