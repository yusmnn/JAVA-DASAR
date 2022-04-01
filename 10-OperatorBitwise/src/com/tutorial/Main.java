//https://youtu.be/Hgn6Tu1HTtI?t=49

package com.tutorial;

public class Main{

    public static void main( String[] args){

        System.out.println("\n++++ * OPERATOR LOGIKA * ++++\n\n");

        // Operator Bitwise  --> digunakan untuk melakukan operasi pada byte;
        byte a,b,c;
        String a_bits, b_bits, c_bits;

        
        // operator SHIFT LEFT
        System.out.println("\n## SHIFT LEFT");
        a = 3;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'); //menimpa 0 di belakang agar di tampilkan
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a << 1); // digeser ke kiri lalu casting ke byte
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // operator SHIFT RIGHT
        System.out.println("\n## SHIFT RIGHT");
        a = 24; // merubah nilai a jadi 24 lebih dulu
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operasi  BITWISE OR (|)
        System.out.println("\n\n## BITWISE OR |");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("------------ |");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operasi  BITWISE AND (|)
        System.out.println("\n\n## BITWISE AND &");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("------------ &");
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operasi  BITWISE XOR (^)
        System.out.println("\n\n## BITWISE XOR");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("------------ ^");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operasi  BITWISE NOT/NEGASI 
        System.out.println("\n\n## BITWISE NOT ~");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.println("------------ ~");
        b = (byte)(~a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24); // memotong 24 digit di belakang
        System.out.printf("%s = %d \n\n", b_bits, b);

    }

}