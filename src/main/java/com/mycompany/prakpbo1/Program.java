/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prakpbo1;

/**
 *
 * @author
 */

//untuk membaca input dari pengguna
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //membuat objek scanner yang akan digunakan untuk membaca input dari pengguna
        boolean inputValid = false; //variabel untuk menandai apakah input yang dimasukkan oleh pengguna valid atau tidak
        
        while (!inputValid) { //loop yang akan terus berjalan jika input pengguna tidak valid
            
            //block try-catch (exception)
            try {
                System.out.print("Masukkan merk mobil: ");
                String merkMobil = scan.nextLine(); //input merk mobil
                if (merkMobil.isEmpty()) {
                    throw new Error("Merk mobil tidak boleh kosong"); //objek Error yang berisi pesan error. jika input kosong, maka kode akan melempar Error dengan pesan yang sesuai
                }

                System.out.print("Masukkan jenis mobil: ");
                String jenisMobil = scan.nextLine(); //input jenis mobil
                if (jenisMobil.isEmpty()) {
                    throw new Error("Jenis mobil tidak boleh kosong"); //objek Error yang berisi pesan error. jika input kosong, maka kode akan melempar Error dengan pesan yang sesuai
                }

                System.out.print("Masukkan merk sepeda motor: ");
                String merkMotor = scan.nextLine(); //input merk motor
                if (merkMotor.isEmpty()) {
                    throw new Error("Merk sepeda motor tidak boleh kosong"); //objek Error yang berisi pesan error. jika input kosong, maka kode akan melempar Error dengan pesan yang sesuai
                }

                System.out.print("Masukkan nama pesawat: ");
                String namaPesawat = scan.nextLine(); //input nama pesawat
                if (namaPesawat.isEmpty()) {
                    throw new Error("Nama pesawat tidak boleh kosong"); //objek Error yang berisi pesan error. jika input kosong, maka kode akan melempar Error dengan pesan yang sesuai
                }

                System.out.print("Masukkan nama kapal laut: ");
                String namaKapal = scan.nextLine(); //input nama kapal
                if (namaKapal.isEmpty()) {
                    throw new Error("Nama kapal laut tidak boleh kosong"); //objek Error yang berisi pesan error. jika input kosong, maka kode akan melempar Error dengan pesan yang sesuai
                }

                System.out.print("Masukkan jenis kapal laut: ");
                String jenisKapal = scan.nextLine(); //input jenis kapal
                if (jenisKapal.isEmpty()) {
                    throw new Error("Jenis kapal laut tidak boleh kosong"); //objek Error yang berisi pesan error. jika input kosong, maka kode akan melempar Error dengan pesan yang sesuai
                }

                //jika semua field telah diisi, keluar dari loop
                inputValid = true;
                
                //membuat objek setelah semua input valid
                Mobil mobil = new Mobil(merkMobil, jenisMobil);
                Motor motor = new Motor(merkMotor);
                Pesawat pesawat = new Pesawat(namaPesawat);
                Kapal kapal = new Kapal(namaKapal, jenisKapal);
                
                //menampilkan output setelah objek dibuat
                mobil.info();
                mobil.bergerak();
                mobil.belok();
                mobil.rem();

                motor.info();
                motor.bergerak();
                motor.belok();
                motor.rem();

                pesawat.bergerak();

                kapal.info();
                kapal.belok();
            } catch (Error e) { //blok catch yang menangkap error yang dihasilkan dengan e sebagai pesan error
                
                //mencetak pesan error
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                
                //mengatur inputValid ke false untuk menjalankan loop lagi
                inputValid = false;
            }
        }
        
        scan.close(); //menutup scanner untuk mencegah memory leak
        System.out.println("Program selesai.");
    }
}
