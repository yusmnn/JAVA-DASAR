package com.tutorial;

public class Main{

    public static void main(String[] args) {

        System.out.println("++++ ARRAY PADA JAVA ++++");

        /* 
            * array -> tipe data yang berisikan kumpulan data dengan tipe data yabng sama
            * Jumlah array tidak bisa berubah setelah pertama kali dibuat
            * index(dimulai 0) = panjang array -1 ( ex; array dengan panjang 5 miliki index 4)
            * index dugunakan untuk mengakses isi data dalam array
        */

        // MEMBUAT ARRAY -------------
        // # cara 1:
        Character[] abjad; // array dengan tipe data char dengan nama variable abjad;
        abjad  = new Character[6]; // initialisasi array dengan index 5
        abjad[0] = 'A'; // memasukkan data ke index 0
        abjad[1] = 'B'; // ---//---- index 1
        abjad[2] = 'C'; // ---//---- index 2
        abjad[3] = 'D'; // ---//---- index 3
        abjad[4] = 'E'; // ---//---- index 4
        abjad[5] = 'A'; // ---//---- index 5
        // # cara 2:
        String[] nama = new String[4];
        nama[2] = "Mark Suckerberg";
        nama[1] = "Vitalik Buterin";
        nama[0] = "Steve Jobs";
        nama[3] = "Elon Musk";
        System.out.println("Isi data array nama Sebelumnya = " + nama[3]);



        // ARRAY INITIALIZER -------------
        // bentuk 1
        Character[] abjad2 = new Character[]{'A','B','C','D','E','X'};
        // bentuk 2 -> bentuk yang sering digunakan
        String[] nama2 = {

            "Adi","Budi","Tono","Joko"

        };



        // OPERASI PADA ARRAY -------------
        nama[3] = "Yusmn"; // ubah isi data array 3
        System.out.println("Isi Data array sesudahnya = " + nama[3]);  // akses isi array nama
        System.out.println("Panjang array abjad2 = " + abjad2.length); // akses panjang array abjad2
        System.out.println("Panjang array nama2 = " + nama2.length);   //  akses panjang array nama2


        /*
            * Tidak bisa menghapus data pada array sehingga hanya bisa memasukkan data kosong saja
        */
        System.out.println("Isi data array abjad dikosongkan = " + (abjad[2] = null)); // ubah jadi null (untuk tipe data bukan primitive)

        int[] angka = {
            11,12,13,14
        };

        angka[2] = 0;
        System.out.println("Isi data array angka dikosongkan = " + angka[2]); // ubah jadi 0 (unutk tipe data primitive)


        // MULTIDIMENSIONAL ARRAY

        // 2d
        String[][] namaNim = {
            {"Yus", "13020"}, // array 0
            {"Yuss", "13021"}, // array 1
            {"Yusss", "13022"} // array 2
        };


        //System.out.println(namaNim[2]); // untuk akses semua isi array 2(akan muncul karakter aneh)
        System.out.println(namaNim[0][1]); // akses yang 13020
        System.out.println("Akses data di array 2 index 1 : " + namaNim[2][1]);

        // FOR EACH untuk array 2D
        for (String[] array1D: namaNim){

            System.out.println("\n");
            for (String item: array1D){
                System.out.println(item);
            }
        }

        // 3d
        int[][][] bilangan = {
            {
                {11,56,77}
            },
            {
                {16,45,65}
            },
            {
                {1},
                {2}
            }
        };

        System.out.println("Isi array 3D = " + bilangan[2][0][0]); // akses data dengan nilai 1

        // FOR EACH Untuk array 3D
        for (int[][] array2D: bilangan) { // masuk ke array ke tiga
            for (int[] array1D: array2D) { // masuk ke array ke dua
                for(int isiData: array1D) { // masuk ke array pertama
                    System.out.println(isiData); // tampilkan item
                }
            }
        }

    }

}