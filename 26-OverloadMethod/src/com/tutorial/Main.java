//  https://youtu.be/e63lu5nL9Ak?t=36

package com.tutorial;


public class Main{

    public static void main(String[] args) {
        
        // overlaod method -> mencari pola  yang sesuai dengan yang dipanggil
        System.out.println("++++ OVERLOAD METHOD ++++");

        printAngka(10);
        printAngka(12.3D);
        printAngka(3.14f);
    }

    // overload method mengambil method sesuai argumennya
    private static void printAngka(int i){
        System.out.println("Tipe data angka " + i);
    }

    private static void printAngka(double i){
        System.out.println("Tipe dengan angka " + i);
    }

    private static void printAngka(float i){
        System.out.println("Tipe data angka " + i);
    }
}