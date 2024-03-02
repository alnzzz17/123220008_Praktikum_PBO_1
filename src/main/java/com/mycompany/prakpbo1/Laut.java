/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

//abstract class "Laut"
public abstract class Laut {
    abstract void belok();
    abstract void info();
    //kelas turunan dari "Laut" harus memberikan implementasi untuk ketiga method tersebut
    /* merupakan method abstract agar kelas-kelas turunannya dapat mengimplementasikan
      dengan caranya sendiri (sesuai kebutuhan setiap kelas) */
}

/*
NOTE:
    Abstract Class :
        - sebagai struktur dasar/kerangka untuk kelas turunannya ("Kapal")
        - dapat memiliki method yang sudah diimplementasikan (non-abstract) atau method yang harus diimplementasikan oleh kelas-kelas turunannya (abstract)
        - ketika sebuah kelas turunan mengextend abstract class, kelas tersebut harus memberikan implementasi untuk semua method abstract yang dideklarasikan dalam abstract class tersebut
        - abstract class memberikan kerangka kerja yang konsisten untuk kelas-kelas turunannya, memastikan bahwa semua kelas tersebut memiliki perilaku yang konsisten
*/