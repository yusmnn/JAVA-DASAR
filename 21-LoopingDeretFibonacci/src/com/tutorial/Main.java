//  https://youtu.be/fJnFt9UbdE0?t=51

package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        int fn = 1, fn1 = 1,fn2 = 0, n;

        System.out.println("\n++++ DERET FIBONACCI ++++\n\n");

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Mengambil deret fibonacci ke- : ");

        n = inputUser.nextInt();

        for(int i = 1; i <= n; i++){
            if(i == 10){
                System.out.println("Nilai ke - " + i + " adalah " + fn);
            }
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }


        //  menggunakan while
        //int keN = 1;

        // while(keN <= n){
        //     System.out.println("Nilai ke - " + keN + " adalah : " + fn);
        //     fn = fn1 + fn2;
        //     fn2 = fn1;
        //     fn1 = fn;
        //     keN++;
        // }


        // menggunakan do while
        // do{
        //     System.out.println("nilai ke - " + keN +" adalah " + fn);
        //     fn = fn1 + fn2 ;
        //     fn2 = fn1;
        //     fn1 = fn;
        //     keN++;
        // } while (keN <= n);


    inputUser.close();
    }

}