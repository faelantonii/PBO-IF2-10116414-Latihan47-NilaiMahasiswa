/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan47_NilaiMahasiswa;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data nilai mahasiswa
 */
public class PBO_IF2_10116414_NilaiMahasiswa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        NilaiMahasiswa nilaimahasiswa = new NilaiMahasiswa();
        
        System.out.print("Masukkan nilai Quiz : ");
        double quiz = scan.nextDouble();
        
        System.out.print("Masukkan nilai UTS : ");
        double uts = scan.nextDouble();
        
        System.out.print("Masukkan nilai UAS : ");
        double uas = scan.nextDouble();
        
        double nilai = nilaimahasiswa.hitungNilaiAkhir(quiz, uts, uas);
        char indeks = nilaimahasiswa.hitungNilaiIndex(nilai);
        String keterangan = nilaimahasiswa.keterangan(indeks);
        
        System.out.println("\nNilai Akhir = " + nilai);
        
        System.out.println("\nIndex = " + indeks);
        System.out.println("Keterangan = " + keterangan);
    }
}
