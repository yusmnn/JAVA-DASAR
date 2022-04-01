// https://youtu.be/swDXko04U1E?t=13

package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        // ternary operator untuk kondisi if else versi satu line (singkat)

        Scanner inputUser = new Scanner(System.in);
        int i,k;



        System.out.println("\n++++ * TERNARY OPERATOR * ++++\n\n");

        System.out.print("Nilai i : ");
        i = inputUser.nextInt();

// variable = (statement) ? (true) : (false)
        k = (i < 10) ? (i * i) : (i * i * i);

        System.out.println(k);

        inputUser.close();
    }

}