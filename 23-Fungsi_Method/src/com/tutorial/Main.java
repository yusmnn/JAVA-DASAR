
package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("\n++++ METHOD PADA JAVA ++++\n\n");
        
        double jariJari;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("jariJari : ");
        jariJari = inputUser.nextDouble();

        System.out.println("luas lingkaran : " + luas(jariJari));
        System.out.println("keliling lingkaran : " + keliling(jariJari));

        inputUser.close();
    }

    private static double luas(double i){
        double hasil;

        hasil = (3.14 *( i * i)) ;
        return hasil;
    }

    private static double keliling(double i){
        double hasil;

        hasil = (2 * (3.14 * i));
        return hasil;
    }

}