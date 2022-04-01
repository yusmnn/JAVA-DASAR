// https://youtu.be/MinJPloJCzo?t=22

package com.tutorial;

import java.util.Scanner; //mengambil lib scanner

public class Main{
    
    public static void main(String[] args){

        // program menghitung luas persegi panjang

        Scanner userInput = new Scanner(System.in); // membuka lib scanner

        float panjang, lebar, luas, tinggi, volume;

        System.out.println("\n## MENGHITUNG PERSEGI PANJANG\n");

        System.out.print("Panjang = ");
        panjang = userInput.nextInt();

        System.out.print("Lebar  = ");
        lebar = userInput.nextInt();

        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang = " + luas);

        volume = panjang * luas * tinggi;
        System.out.println("Volume persegi panjang = " + volume);

        userInput.close(); // menutup library scanner
    }

}