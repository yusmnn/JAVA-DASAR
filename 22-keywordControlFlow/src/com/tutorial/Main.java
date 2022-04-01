package com.tutorial;


public class Main{

    public static void main(String[] args) {
        
        int a = 0;

        System.out.println("\n++++ BREAK, CONTINUE, RETURN ++++\n\n");

        while(true){
            a++;

            if(a == 11){
                break; // untuk memaksa kelaur dari loop
            }
            else if(a == 5){
                continue; // untuk memaksa memulai dari awal
            }
            else if(a == 9){
                return; // mengembalikan nilai ke fungsi/method
            }

            System.out.println("looping ke - " + a);

        }
    }

}