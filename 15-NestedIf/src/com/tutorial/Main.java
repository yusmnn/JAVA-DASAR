// https://youtu.be/yrGPuZB1SsA?t=32

package com.tutorial;

public class Main{

    public static void main(String[] args){

        System.out.println("\n++++ * NESTED IF * ++++\n\n");

        String a = "merah";
        String b = "kuning";
        String c = "hijau";

        if(a.equals("merah")){
            System.out.println("statement 1");
        }
        else{
            if(b.equals("kuning")){
                System.out.println("statement 2");
            }
            else{
                if(c.equals("hijau")){
                    System.out.println("statement 3");
                }
                else{
                    System.out.println("statement 4");
                }
            }
        }
    }

}