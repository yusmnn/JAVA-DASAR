package com.tutorial;


public class Main{

    public static void main(String[] args) {

        System.out.println("\n++++ FOR LOOP ++++");
        String nama = "Yusman";
        int j = 0;
        

        // for loop 1 -> yang disarankan dipakai
        for(int i = 0; i < 5; i++){

            System.out.println(nama + "ke-" + i);

        }

        // for loop 2 -> looping yang stackoverflow
        for(; true ;){
            System.out.println("True ke-" + j);
        }

        // for loop 3 -> sama dengan for loop 1
        int k = 1;
        for( k < 5 ;){
            System.out.println("loop ke-" + k);
            k++;
        }


    }

}