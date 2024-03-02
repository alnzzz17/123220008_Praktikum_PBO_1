/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

//"Motor" sebagai subclass (kelas turunan) dari abstract class "Darat" 
public class Motor extends Darat implements Kendaraan { //mengextend method dari abstract class "Darat" dan mengimplementasikan method dari interface "Kendaraan"
    
    //variabel instance
    private String merk;

    //konstruktor -> namakonstruktor(datatype1 parameter1, ...){...}
    Motor(String m) {
        this.merk = m;
    } //nilai-nilai yang diterima oleh parameter konstruktor (m) disalin ke variabel instance (merk)
      //'this' merujuk pada variabel instance dari objek yang sedang dibuat (merk)

    @Override
    void belok() {
        System.out.println("Sepeda motor " + merk + " belok."); //method spesifik untuk kelas "Motor"
    }

    @Override
    void rem() {
        System.out.println("Sepeda motor " + merk + " melakukan pengereman."); //method spesifik untuk kelas "Motor"
    }

    @Override
    void info() {
        System.out.println("Sepeda motor " + merk + " adalah sepeda motor."); //method spesifik untuk kelas "Motor"
    }

    @Override
    public void bergerak() {
        System.out.println("Sepeda motor " + merk + " bergerak."); //method yang diimplementasikan dari interface "Kendaraan"
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