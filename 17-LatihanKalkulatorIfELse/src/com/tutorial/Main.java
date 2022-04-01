//  https://youtu.be/kisN2fiu_0s?t=45

package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner inputUSer = new Scanner(System.in);

        float angkaSatu, angkaDua, hasil;
        char operator;
        
        System.out.println("\n++++ * KALKULATOR SEDERHANA * ++++\n");

        System.out.println("Ket*");
        System.out.println("Gunakan Operator + - * /\n");

        System.out.print("Masukkan angka a : ");
        angkaSatu = inputUSer.nextFloat();

        System.out.print("Operator : ");
        operator = inputUSer.next().charAt(0);

        System.out.print("Masukkan angka b : ");
        angkaDua = inputUSer.nextFloat();

        if(operator == '+'){
            hasil = angkaSatu + angkaDua;
            System.out.println("Hasil : " + hasil);
        }
        else if(operator == '-'){
            hasil = angkaSatu - angkaDua;
            System.out.println("Hasil : " + hasil);
        }
        else if(operator == '*'){
            hasil = angkaSatu * angkaDua;
            System.out.println("Hasil : " + hasil);
        }
        else if(operator == '/'){
            hasil = angkaSatu / angkaDua;
            System.out.println("Hasil : " + hasil);
        }
        else{
            System.out.println("Operator yang digunakan salah");
        }
        
        inputUSer.close();
    }

}