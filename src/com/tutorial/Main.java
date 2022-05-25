package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nilai awal =");
        Integer nilaiAwal = scanner.nextInt();
        System.out.println("masukkan nilai akhir =");
        Integer nilaiAkhir = scanner.nextInt();

        int total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        

        System.out.println("ini adalah akhir program");
    }
}
