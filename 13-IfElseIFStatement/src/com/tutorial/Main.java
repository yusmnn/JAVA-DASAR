// https://youtu.be/492A2poEoow?t=63
// https://youtu.be/yGrD2uZnvQo?t=54

package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        System.out.println("++++ * IF STATEMENT * ++++");

        int inputpass;
        int pass = 11;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Password : ");

        inputpass  = inputUser.nextInt();

        if (pass == inputpass) {

            System.out.println("Password benar");
            
        } else if (inputpass == 12){

            System.out.println("Password setelah angka 10");
            
        }
        else {

            System.out.println("Password salah");

        }
            
            inputUser.close();

    }


}
