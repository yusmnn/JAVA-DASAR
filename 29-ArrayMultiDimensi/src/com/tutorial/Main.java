// https://youtu.be/RN-ZVxdSWSM?t=122
// https://youtu.be/oyBykjrNO_U?t=54

package com.tutorial;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        System.out.println("\n++++ ARRAY MULTIDIMENSI ++++\n\n");

        int[][] array2D = {
            {11,22,33},
            {44,55,66},
            {1}
        };
        printArray2D(array2D);


        String[][][] array3D = {
            {
                {"Yus","man"},
                {"Steve","Jobs"}
            },
            {
                {"Vitalik","Buterin"},
                {"Elon","Musk"}
            }
        };
        printArray3D(array3D);

        System.out.println("\n");
    }

    // Tampilkan array menggunakan foreach
    private static void printArray2D(int[][] isiData){
        for (int[] array1D : isiData) {
            System.out.print("[");
            for(int item : array1D){
                System.out.print(item + ",");
            }
            System.out.print("]\n");
        }
    }

    // Tampilkan array menggunakan lib
    private static void printArray3D(String[][][] i){
        System.out.println(Arrays.deepToString(i));
    }

}