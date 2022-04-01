//https://youtu.be/m7_Lves967A?t=35

package com.tutorial;

public class Main{

    public static void main(String[] args){

        System.out.println("\n++++ * OPERATOR ASSIGNMENTS * ++++\n");

        // penjumlahan 
        int  a = 3;
        a += 5; // = a + a = 5

        System.out.println("Nilai a = " + a);

        // pengurangan
        int  b = 3;
        b -= 5;

        System.out.println("Nilai b = " + b);

        // perkalian
        int  c = 3;
        c *= 5;

        System.out.println("Nilai c = " + c);

        // pembagian
        float  d = 3f;
        d /= 5;

        System.out.println("Nilai d = " + d);

        // modulus (sisa bagi)
        float  e = 10f;
        e %= 4;

        System.out.println("Nilai e = " + e);
    }

}