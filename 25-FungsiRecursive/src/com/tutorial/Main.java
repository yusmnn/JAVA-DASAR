//  https://youtu.be/wdrSmK18nj4?t=73

package com.tutorial;

import java.util.Scanner;


public class Main{

    public static void main(String[] args) {

        int nilai,jumlah,kali;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("\n++++ FUNGSI RECURSIVE ++++\n\n");

        System.out.print("Masukkan Nilai : ");
        nilai = inputUser.nextInt();

        // penjumlahan
        jumlah = jumlahNilai(nilai);
        System.out.println("\nRecursive +  : " + jumlah);

        // perkalian
        kali = kaliNilai(nilai);
        System.out.println("\nRecursive *  : " + kali);



    inputUser.close();
    }

    // Recursive penjumlahan
    private static int jumlahNilai(int i){

        System.out.print(i);

        if (i == 0){
            return i;
        }
        else if( i != 0){
            System.out.print(" + ");
        }

        return i + jumlahNilai(i - 1);
    }

    // Recursive perkalian
    private static int kaliNilai(int i){

        System.out.print(i);

        if (i == 1){
            return i;
        } else if(i != 0){
            System.out.print(" * ");
        }

        return (i * kaliNilai(i - 1));
    }

} 