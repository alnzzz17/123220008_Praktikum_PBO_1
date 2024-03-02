/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

/* interface: semua kendaran memiliki kemampuan untuk bergerak
  -> setiap kelas yang mengimplementasikan interface "Kendaraan" menggunakaan method "bergerak" */
public interface Kendaraan {
    void bergerak(); //polymorphism: memperlakukan objek dari kelas-kelas yang berbeda dengan cara yang sama ("bergerak")
}