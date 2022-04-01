
// https://youtu.be/IRis_1jMi1w

package com.tutorial;


public class Main{

    public static void main(String[] args) {

        System.out.println("\n\n++++++ * TIPE DATA JAVA : PRIMITIVE * ++++++\n"); // tipe data primitive adalah tipe data yang nilainya tidak berubah-ubah

        //byte (satuan)
        System.out.println("====BYTE====");
        byte i = 8;
        System.out.println("Nilai byte i = " + i);
        //byte batas
        System.out.println("Nilai Max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min byte = " + Byte.MIN_VALUE);
        // 1 byte sama dengan 8 bit
        System.out.println("Besar byte = " + Byte.BYTES + " Bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " Bit \n");

        //Short (satuan)
        System.out.println("====Short====");
        Short n = 4;
        System.out.println("Nilai Short n = " + n);
        //Short batas
        System.out.println("Nilai Max Short = " + Short.MAX_VALUE);
        System.out.println("Nilai Min Short = " + Short.MIN_VALUE);
        // 2 byte sama dengan 16 bit
        System.out.println("Besar Short = " + Short.BYTES + " byte");
        System.out.println("Besar Short = " + Short.SIZE + " Bit \n");

        // integer (Satuan)
        System.out.println("====INTEGER====");
        int k = 3;
        System.out.println("Nilai int k = " + k);
        //integer batas
        System.out.println("Nilai Max int = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min int = " + Integer.MIN_VALUE);
        // 4 byte sama dengan 32 bit
        System.out.println("Besar int = " + Integer.BYTES + " Bytes");
        System.out.println("Besar int = " + Integer.SIZE + " Bit \n");

        // Long (satuan)
        System.out.println("====LONG====");
        long m = 11L; // untuk membedakan mana yang int dengan long
        System.out.println("Nilai long m = " + m);
        //Long batas
        System.out.println("Nilai Max long = " + Long.MAX_VALUE);
        System.out.println("Nilai Min long = " + Long.MIN_VALUE);
        // 8 byte sama dengan 64 bit
        System.out.println("Besar long = " + Long.BYTES + " Bytes");
        System.out.println("Besar long = " + Long.SIZE + " Bit \n");

        
        // Float (real atau komma)
        System.out.println("====FLOAT====");
        float q = 3.14f; // (f) untuk membedakan mana float dengan double
        System.out.println("Nilai float q = " + q);
        //Float batas
        System.out.println("Nilai Max float = " + Float.MAX_VALUE);
        System.out.println("Nilai Min float = " + Float.MIN_VALUE);
        // 4 byte sama dengan 32 bit
        System.out.println("Besar float = " + Float.BYTES + " Bytes");
        System.out.println("Besar float = " + Float.SIZE + " Bit \n");

        // Double (real atau komma)
        System.out.println("====DOUBLE====");
        double x = -2.3d; //  (d) untuk membedakan mana Double dengan float
        System.out.println("Nilai Double x = " + x);
        //Double batas
        System.out.println("Nilai Max Double = " + Double.MAX_VALUE);
        System.out.println("Nilai Min Double = " + Double.MIN_VALUE);
        // 8 byte sama dengan 64 bit
        System.out.println("Besar Double = " + Double.BYTES + " Bytes");
        System.out.println("Besar Double = " + Double.SIZE + " Bit \n");

        // Char (Karakter)
        System.out.println("====CHAR====");
        char b = 'Y';
        System.out.println("Nilai Char b = " + b);
        //Char batas (batas max dan min char dinamakan ASCII)
        System.out.println("Nilai Max Char = " + Character.MAX_VALUE);
        System.out.println("Nilai Min Char = " + Character.MIN_VALUE);
        // 2 byte sama dengan 16 bit
        System.out.println("Besar Char = " + Character.BYTES + " Bytes");
        System.out.println("Besar Char = " + Character.SIZE + " Bit \n");

        // Boolean (true atau false)
        System.out.println("====BOOLEAN====");
        boolean data = true;
        System.out.println("Nilai Boolean nilai = " + data);
        System.out.println("Nilai 1 = " + Boolean.TRUE);
        System.out.println("Nilai 2 = " + Boolean.FALSE + "\n");

    }

}