/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Nilai {
    
    private double quiz;
    private double uts;
    private double uas;
    
    public double getQuiz() {
        return quiz;
    }
    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }
    
    public double getUts() {
        return uts;
    }
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double nilaiAkhir(double quiz, double uts, double uas) {
        return (quiz * 0.20) + (uts * 0.30) + (uas * 0.50);
    }
    
    public char index(double nilaiAkhir) {
        char index = 0;
        
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            index = 'E';
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
        } else if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            index = 'A';
        }
        return index;
    }
    
    public String keterangan(char index) {
        String keterangan = null;
        
        switch (index) {
            case 'A': 
                keterangan = "Sangat Baik"; 
                break;
            case 'B': 
                keterangan = "Baik"; 
                break;
            case 'C': 
                keterangan = "Cukup"; 
                break;
            case 'D': 
                keterangan = "Kurang"; 
                break;
            case 'E': 
                keterangan = "Sangat Kurang"; 
                break;
        }
        
        return keterangan;
    }
    
}

public class NilaiMahasiswa {
    
    public static void main(String[] args) {
        
        Nilai n = new Nilai();
        
        double nilaiAkhir;
        
        n.setQuiz(75);
        n.setUts(45);
        n.setUas(34);
        System.out.println("-- 1 --");
        System.out.println("QUIZ \t\t = " + n.getQuiz());
        System.out.println("UTS \t\t = " + n.getUts());
        System.out.println("UAS \t\t = " + n.getUas());
        System.out.println();
        nilaiAkhir = n.nilaiAkhir(n.getQuiz(), n.getUts(), n.getUas());
        System.out.println("Nilai Akhir \t = " + nilaiAkhir);
        System.out.println();
        System.out.println("Index = " + n.index(nilaiAkhir));
        System.out.println("Keterangan = " + n.keterangan(n.index(nilaiAkhir)));
        System.out.println();
        System.out.println();
        
        n.setQuiz(60);
        n.setUts(80);
        n.setUas(75);
        System.out.println("-- 2 --");
        System.out.println("QUIZ \t\t = " + n.getQuiz());
        System.out.println("UTS \t\t = " + n.getUts());
        System.out.println("UAS \t\t = " + n.getUas());
        System.out.println();
        nilaiAkhir = n.nilaiAkhir(n.getQuiz(), n.getUts(), n.getUas());
        System.out.println("Nilai Akhir \t = " + nilaiAkhir);
        System.out.println();
        System.out.println("Index = " + n.index(nilaiAkhir));
        System.out.println("Keterangan = " + n.keterangan(n.index(nilaiAkhir)));
        System.out.println();
        System.out.println();
        
        n.setQuiz(30);
        n.setUts(80);
        n.setUas(40);
        System.out.println("-- 3 --");
        System.out.println("QUIZ \t\t = " + n.getQuiz());
        System.out.println("UTS \t\t = " + n.getUts());
        System.out.println("UAS \t\t = " + n.getUas());
        System.out.println();
        nilaiAkhir = n.nilaiAkhir(n.getQuiz(), n.getUts(), n.getUas());
        System.out.println("Nilai Akhir \t = " + nilaiAkhir);
        System.out.println();
        System.out.println("Index = " + n.index(nilaiAkhir));
        System.out.println("Keterangan = " + n.keterangan(n.index(nilaiAkhir)));
        System.out.println();
    }
}