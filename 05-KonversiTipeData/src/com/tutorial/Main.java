
//https://youtu.be/-dxnFRmWFKk?t=33

package com.tutorial;

public class Main{

    public static void main(String[] args){

        System.out.println("\n++++ * KONVERSI TIPE DATA * ++++ \n");

        // NUMBER

        //cara 1 (diubah ke tipe data yang lebih besar exam: int ke long)
        int variable1 = 260;
        System.out.println("Nilai int variable1 = " + variable1);
        
        long nilaiLong = variable1;

        // memeperluas rentang ke tipe data yang lebih besar
        System.out.println("Nilai int di konversi ke long = " + nilaiLong); // tidak masalah jika konversi tipe data ke yang lebih besar

        // memeperkecil rentang ke tipe data yang kecil
         byte nilaiByte = (byte)nilaiLong;
        System.out.println("Nilai int di konversi ke byte = " + nilaiByte); // bermasalah karena nilai max rentan byte hanya sampai 127
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);

        //cara 2 (casting pembagian)
        float val1 = 11; //merubah salah satu tipe data
        int val2 = 4;
        float hasil = val1 / val2;

        System.out.printf("%f / %d = %f\n",val1,val2,hasil);

        //cara 3 (casting yang aman)
        int val3 = 11;
        int val4 = 4;

        float hasil2 = (float)val3 / val4;

        System.out.printf("%d / %d = %f \n\n",val3,val4,hasil2);

    }

}