package com.tutorial;

class Mahasiswa{
    String a;
    String b;

}

public class Main{

    int x = 6; // instance variable

    public static void main(String[] args){

        // Variable -> untuk menyimpan data dan dapat merubah data
        int i = 10; // assignment
        System.out.println("Nilai i = " + i);

        i = 9; // local variable
        System.out.println("Nilai i kedua = " + i + "\n");

        // Deklarasi -> membuat variable tanpa isi data
        int j;
        j = 8;

        System.out.println(j);

        Mahasiswa mahasiswa = new Mahasiswa(); // pembuatan objek
        mahasiswa.a = "belajar java";
        mahasiswa.b = "FIKOM UMI";
        System.out.println(mahasiswa.a);
        System.out.println(mahasiswa.b);

        void f1(){
            System.out.println(x);
        }
    
    }

}