package com.tutorial;


public class Main{

    public static void main(String[] args) {
        System.out.println("\n++++ LATIHAN ARRAY JAVA ++++\n\n");

        // ARRAY 1D
        Character[] nama = {
            'y','u','s','m','a','n'
        };

        // foreach 1D
        for (Character item : nama) {
            System.out.print(" - " + item);
        }

        System.out.println("\n");

        // ARRAY 2D
        Character[][] nama2 = {
            {'Y','u'},
            {'S','M'},
            {'A','N'}
        };

        // foreach 2D
        for(Character[] array1D : nama2){
            for( Character item : array1D){
                System.out.print(" - " + item);
            }
        }


        // for each 3D
        String[][][] nama3 = {
            {
                {"y","yu"},
                {"yus","yusm"}
            },
            {
                {"yusm","yusma"},
                {"yusman"}
            }
        };

        System.out.println("\n");

        for(String[][] array2D : nama3){
            for(String[] array1D : array2D){
                for(String item : array1D){
                    System.out.print(" - " + item);
                }
            }
        }

        System.out.println("\n");

        System.out.println("Panjang array nama : " + nama.length);
        System.out.println(nama2[1][0]);
        System.out.println(nama3[1][1][0]);
        System.out.println(nama3[1][0][1]);

    }

}