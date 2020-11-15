/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan47_NilaiMahasiswa;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data nilai mahasiswa
 */

public class NilaiMahasiswa {
    private double nilaiAkhir;
    private char index;
    
    public double hitungNilaiAkhir(double quiz, double uts, double uas) {
        nilaiAkhir = (0.20 * quiz) + (0.30 * uts) + (0.50 * uas);
        return nilaiAkhir;
    }
    
    public char hitungNilaiIndex(double ni) {
        if(80 <= ni && ni <= 100) {
            index = 'A';
            return index;
        } else if(68 <= ni && ni < 80) {
            index = 'B';
            return index;
        } else if(56 <= ni && ni < 68) {
            index = 'C';
            return index;
        } else if(45 <= ni && ni < 56) {
            index = 'D';
            return index;
        } else {
            index = 'E';
            return index;
        }
    }
    
    public String keterangan(char indeks) {
        String ket;
        switch(indeks) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            default:
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    }
}
