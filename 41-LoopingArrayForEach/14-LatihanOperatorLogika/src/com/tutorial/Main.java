// https://youtu.be/ubVGfEdnjQw?t=107

package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        
        Scanner inputUser = new Scanner(System.in);

        int nilaiBenar = 11;
        int nilaiInput;
        boolean hasiltebakan;

        // input
        System.out.print("Masukkan Nilai : ");
        nilaiInput = inputUser.nextInt();

        // operasi logika
        hasiltebakan = (nilaiBenar == nilaiInput);

        // output
        System.out.println("Nilai tebakan anda " + hasiltebakan);

        // input
        System.out.print("Masukkan Nilai : ");
        nilaiInput = inputUser.nextInt();

        // operasi logika
        hasiltebakan = (nilaiInput < 66) && (nilaiInput > 50);

        // output
        System.out.println("Nilai tebakan anda " + hasiltebakan);

        // input
        System.out.print("Masukkan Nilai : ");
        nilaiInput = inputUser.nextInt();

        // operasi logika
        hasiltebakan = (nilaiBenar - 10 == nilaiInput);

        System.out.print("Nilai tebakan anda " + hasiltebakan);


        
    }

}