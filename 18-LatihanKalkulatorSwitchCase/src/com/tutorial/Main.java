//  https://youtu.be/f3-AXEwX4Ck?t=43


package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);

        float a, b, hasil;
        char operator;

        System.out.println("\n++++ * KALKULATOR SWITCH CASE * ++++\n");

        System.out.print("Angka pertama : ");
        a = inputUser.nextFloat();
        System.out.print("Operator : ");
        operator = inputUser.next().charAt(0);
        System.out.print("Angka kedua : ");
        b = inputUser.nextFloat();

        switch(operator)
        {
            case '+':
                hasil = a + b;
                System.out.println("Hasil : " + hasil);
            break;
            case '-':
                hasil = a - b;
                System.out.println("Hasil : " + hasil);
            break; 
            case '*':
                hasil = a * b;
                System.out.println("Hasil : " + hasil);
            break;    
            case '/':
                hasil = a /  b;
                System.out.println("Hasil : " + hasil);
            break;
            default:
            System.out.println("Operator yang digunakan salah");

        }
        
    inputUser.close();
    }

}