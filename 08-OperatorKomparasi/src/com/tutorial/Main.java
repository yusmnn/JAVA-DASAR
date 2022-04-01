//https://youtu.be/KiQDo3yZDnI?t=46

package com.tutorial;

public class Main
{

    public static void main(String[] args){

        System.out.println("\n++++ * OPERATOR KOMPARASI * ++++\n");

        // operator komparasi menghasilkan nilai boolean
         int a;
         int b;
        

        // operator equel
        System.out.println("\n### SAMA DENGAN");
        a = 1;
        b = 1;
        boolean hasilKomp = (a == b);
        System.out.printf("     %d == %d ? %s \n", a, b, hasilKomp); // true
        a = 2;
        b = 1;
        boolean hasilKomp1 = (a == b);
        System.out.printf("     %d == %d ? %s", a, b, hasilKomp1); // false


        // operator not equel
        System.out.println("\n\n### TIDAK SAMA DENGAN");
        a = 1;
        b = 1;
        boolean hasilKomp2 = (a != b);
        System.out.printf("     %d != %d ? %s \n", a, b, hasilKomp2); // false
        a = 2;
        b = 1;
        boolean hasilKomp3 = (a != b);
        System.out.printf("     %d != %d ? %s", a, b, hasilKomp3); // true


        // opereator less than
        System.out.println("\n\n### LEBIH KECIL DARI");
        a = 1;
        b = 1;
        boolean hasilKomp4 = (a < b);
        System.out.printf("     %d < %d ? %s \n", a, b, hasilKomp4); // false
        a = 1;
        b = 2;
        boolean hasilKomp5 = (a < b);
        System.out.printf("     %d < %d ? %s", a, b, hasilKomp5); // true


        // operator greater than
        System.out.println("\n\n### LEBIH BESAR DARI");
        a = 1;
        b = 1;
        boolean hasilKomp6 = (a > b);
        System.out.printf("     %d > %d ? %s \n", a, b, hasilKomp6); // false
        a = 2;
        b = 1;
        boolean hasilKomp7 = (a > b);
        System.out.printf("     %d > %d ? %s", a, b, hasilKomp7); // true


        // operator less than equel
        System.out.println("\n\n### LEBIH KECIL DARI atau SAMA DENGAN");
        a = 1;
        b = 2;
        boolean hasilKomp13 = (a <= b);
        System.out.printf("     %d <= %d ? %s\n", a, b, hasilKomp13); // true
        a = 1;
        b = 1;
        boolean hasilKomp8 = (a <= b);
        System.out.printf("     %d <= %d ? %s \n", a, b, hasilKomp8); // true
        a = 2;
        b = 1;
        boolean hasilKomp9 = (a <= b);
        System.out.printf("     %d <= %d ? %s", a, b, hasilKomp9); // false


        // operator greater than equel
        System.out.println("\n\n### LEBIH BESAR DARI atau SAMA DENGAN");
        a = 1;
        b = 2;
        boolean hasilKomp14 = (a >= b);
        System.out.printf("     %d <= %d ? %s\n", a, b, hasilKomp14); // false
        a = 1;
        b = 1;
        boolean hasilKomp11 = (a >= b);
        System.out.printf("     %d >= %d ? %s \n", a, b, hasilKomp11); //true
        a = 2;
        b = 1;
        boolean hasilKomp12 = (a >= b);
        System.out.printf("     %d >= %d ? %s\n", a, b, hasilKomp12); // true
    }

}