//https://youtu.be/3BpGUsTyu0Y?t=33

package com.tutorial;

public class Main{

    public static void main(String[] args){

        // Unary = operasi yang dilakukan pada satu variable

        System.out.println("\n++++ * UNARY, INCREMENT, DECREMENT * ++++\n\n");

        // Unary + & -
        int angka = 1;
        System.out.printf("Unary '+'  1 menjadi %d \n",+angka); // plus
        System.out.printf("Unary '-' 1 menjadi %d \n",-angka); // menjadi min

        // Unary increment =  (+1)
        int a = 1;
        a++; //post-increment -> tampilkan nilai a, lalu tambah 1
        System.out.println("Nilai dengan 'a++' menjadi = " + a);

        int b = 1;
        ++b; //pre-increment -> tambah nilai b denganyak 1, lalu tampilkan
        System.out.println("Nilai dengan '++b' menjadi = " + b);

        // Unary Decrement =  (-1)
        int c = 1;
        c--; //post-decrement -> tampilkan nilai c, lalu kurang 1
        System.out.println("Nilai dengan 'c--' c menjadi = " + c);

        int d = 1;
        --d; //pre-increment -> kurangi nilai d sebanyak 1, lalu tampilkan
        System.out.println("Nilai dengan '--d' menjadi = " + d);
        
        //unary boolean dengan ! untk negasi
        boolean e = true;
        System.out.println("Nilai boolean = " + e);
        System.out.println("Nilai boolean = " + !e);

    }

}