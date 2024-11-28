/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkasirsederhana;

import java.util.Scanner;

public class ProgramKasirSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Makanan
        String[] makanan = {"Nasi Goreng", "Ayam Geprek", "Ikan Bakar", "Nasi Bakar", "Cumi Bakar", "Gulai kambing"};
        int[] hargaMakanan = {12000, 10000, 20000, 8000, 17000, 25000};

        System.out.println("|    PROGRAM KASIR SEDERHANA    |");
        System.out.println("|===============================|");
        System.out.println("|       PILIH MENU MAKANAN      |");
        System.out.println("|===============================|");

        for (int i = 0; i < makanan.length; i++) {
            System.out.println(" | " + (i + 1) + ". " + makanan[i] + " Rp. " + hargaMakanan[i] + "   | ");
        }

        int pilihanMakanan;
        while (true) {
            System.out.print("Pilih makanan 1/2/3/4/5/6 : ");
            pilihanMakanan = input.nextInt();
            if (pilihanMakanan >= 1 && pilihanMakanan <= 6) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, silakan pilih sesuai daftar.");
            }
        }

        System.out.print("Berapa porsi : ");
        int porsi = input.nextInt();
        int totalHargaMakanan = hargaMakanan[pilihanMakanan - 1] * porsi;
        System.out.println(makanan[pilihanMakanan - 1] + " " + porsi + " Porsi Rp. " + totalHargaMakanan);

        // Minuman
        String[] minuman = {"Es Teh Susu", "Es Durian", "Es Coklat", "Es Cappucino", "Jus Apel", "Jus Alpukat"};
        int[] hargaMinuman = {5000, 15000, 10000, 5000, 10000, 15000};

        System.out.println("|===============================|");
        System.out.println("|    PROGRAM KASIR SEDERHANA    |");
        System.out.println("|===============================|");
        System.out.println("|       PILIH MENU MINUMAN      |");
        System.out.println("|===============================|");

        for (int i = 0; i < minuman.length; i++) {
            System.out.println(" | " + (i + 1) + ". " + minuman[i] + " Rp. " + hargaMinuman[i] + "   | ");
        }

        int pilihanMinuman;
        while (true) {
            System.out.print("Pilih minuman 1/2/3/4/5/6 : ");
            pilihanMinuman = input.nextInt();
            if (pilihanMinuman >= 1 && pilihanMinuman <= 6) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, silakan pilih sesuai daftar.");
            }
        }

        System.out.print("Berapa gelas : ");
        int gelas = input.nextInt();
        int totalHargaMinuman = hargaMinuman[pilihanMinuman - 1] * gelas;
        System.out.println(minuman[pilihanMinuman - 1] + " " + gelas + " Gelas Rp." + totalHargaMinuman);

        // Total Harga
        int totalHarga = totalHargaMakanan + totalHargaMinuman;

        System.out.println("|===============================|");
        System.out.println("|        DAFTAR PEMBELIAN       |");
        System.out.println("|===============================|");
        System.out.println(" Makanan      : " + makanan[pilihanMakanan - 1]);
        System.out.println(" Jumlah Porsi : " + porsi);
        System.out.println(" Minuman      : " + minuman[pilihanMinuman - 1]);
        System.out.println(" Jumlah Gelas : " + gelas);
        System.out.println("|===============================|");
        System.out.println(" Total harga  : Rp." + totalHarga);
        System.out.println("|===============================|");

        input.close();
    }
    
}
