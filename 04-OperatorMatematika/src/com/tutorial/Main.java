
//  https://youtu.be/FlbBdWUC0YU?t=61

package com.tutorial;

public class Main{
    public static void main(String[] args)
    {

        System.out.println("\n\n+++++ * OPERASI ARITMATIKA * +++++\n");

        int nilaiSatu = 5;
        int nilaiDua = 11;
        int hasil;

        // 1. penjumlahan
        System.out.println("====PENJUMLAHAN====");
        hasil = nilaiSatu + nilaiDua;
        System.out.println("hasil penjumlahan = " + hasil); // cara 1

        System.out.println(nilaiSatu + " + " + nilaiDua + " = " + hasil); // cara 2

        System.out.printf("%d + %d = %d \n\n",nilaiSatu,nilaiDua,hasil); // cara 3

        // 2. pengurangan
        System.out.println("====PENGURANGAN====");
        hasil = nilaiDua - nilaiSatu;
        System.out.printf("%d - %d = %d \n\n",nilaiDua,nilaiSatu,hasil);

        // 3. perkalian
        System.out.println("====PERKALIAN====");
        hasil = nilaiDua * nilaiSatu;
        System.out.printf("%d * %d = %d \n\n",nilaiDua,nilaiSatu,hasil);

        // 4. pembagian
        System.out.println("====PEMBAGIAN====");
        hasil = nilaiDua / nilaiSatu;
        System.out.printf("%d / %d = %d \n\n",nilaiDua,nilaiSatu,hasil); //hasil bilangan bulat, karena tipedata integer

        float nilaiTiga = 3f;
        float nilaiEmpat = 2f;
        float hasilFloat = nilaiTiga / nilaiEmpat;
        System.out.println(nilaiTiga + " / " + nilaiEmpat + " = " + hasilFloat); // hasil bilangan float(komma)

        // 5. Modulus (sisa bagi)
        System.out.println("\n====MODULUS====");
        hasil = nilaiDua % nilaiSatu;
        System.out.printf("%d %% %d = %d\n",nilaiDua,nilaiSatu,hasil);

    }

}