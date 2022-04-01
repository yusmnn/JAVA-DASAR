// https://youtu.be/_OwCDThM3EI?t=48

package com.tutorial;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        
        int input;
        String input2;
        
        Scanner inputUser = new Scanner(System.in);
        Scanner inputRek = new Scanner(System.in);

        
        // untuk clear screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        
        System.out.println("\n++++ * SWITCH CASE * ++++\n\n");
        System.out.println("Masukkan pilihan :");
        System.out.println("1. Tarik tunai");
        System.out.println("2. Setor tunai");
        System.out.println("3. Transfer rekening");
        System.out.println("4. Cek Saldo");
        System.out.println("5. Batal");
        System.out.print("Pilih 1 - 5 : ");

        input = inputUser.nextInt();

        // untuk clear screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();



        switch(input){
            case 1:
                System.out.println("Masukkan Pilihan : ");
                System.out.println("1. Rp 100.000,00");
                System.out.println("2. Rp 300.000,00");
                System.out.println("3. Rp 500.000,00");
                System.out.println("4. Batalkan");
                System.out.print("Pilih 1 - 4 : ");
        
                input = inputUser.nextInt();

                if(input == 1){
                    System.out.println("Saldo ditarik Rp 100.000,00");
                }else if(input == 2){
                    System.out.println("Saldo ditarik Rp 300.000,00");
                }else if(input == 3){
                    System.out.println("Saldo ditarik Rp 500.000,00");
                }else if(input == 4){
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();          
                }

            break;  // jika tidak menggunakan break dan true maka case selanjutnya akan di eksekusi juga
            case 2:
                System.out.println("Masukkan Pilihan : ");
                System.out.println("1. Rp 100.000,00");
                System.out.println("2. Rp 300.000,00");
                System.out.println("3. Rp 500.000,00");
                System.out.println("4. Batalkan");
                System.out.print("Pilih 1 - 4 : ");
        
                input = inputUser.nextInt();

                if(input == 1){
                    System.out.println("Saldo disetor Rp 100.000,00");
                }else if(input == 2){
                    System.out.println("Saldo disetor Rp 300.000,00");
                }else if(input == 3){
                    System.out.println("Saldo disetor Rp 500.000,00");
                }else if(input == 4){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();          
                }
            break;
            case 3:
                System.out.println("Masukkan Pilihan : ");
                System.out.println("1. Rp 100.000,00");
                System.out.println("2. Rp 300.000,00");
                System.out.println("3. Rp 500.000,00");
                System.out.println("4. Batalkan");
                System.out.print("Pilih 1 - 4 : ");
        
                input = inputUser.nextInt();


                System.out.print("Masukkan Nomor Rekening : ");

                input2 = inputRek.nextLine();

                if(input == 1){
                    System.out.println("Saldo ditransfer Rp 100.000,00 ke " + input2);
                }else if(input == 2){
                    System.out.println("Saldo ditransfer Rp 300.000,00" + input2);
                }else if(input == 3){
                    System.out.println("Saldo ditransfer Rp 500.000,00" + input2);
                }else if(input == 4){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            break;
            case 4:
                System.out.println("### JUMLAH SALDO ###");
                System.out.println("Saldo Anda Rp0 , Dasar Miskin!!");
            break;
            case 5:
                System.out.print("KELUAR  ");

                new java.util.Scanner(System.in).nextLine(); // untuk pause terminall (enter)

                System.out.print("\033[H\033[2J");  
                System.out.flush();
            break;
            default:
                System.out.println("Pilihan tidak ditemukan");

        }
        

        // untuk menutup inputan dari user
        inputUser.close();
        inputRek.close();
    }

} 