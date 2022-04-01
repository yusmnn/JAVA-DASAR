package com.tutorial;

public class Main{

    public static void main(String[] args){

        int i = 0;
        boolean kondisi = true;

        System.out.println("Awal Program");

        while(kondisi){
            System.out.println("While loop ke " + i);
            i++;
        
            if(i == 10){
                kondisi = false;
            }
        }
        System.out.println();
    }

}