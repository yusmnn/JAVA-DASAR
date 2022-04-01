//https://youtu.be/wOnpqaWVM3E?t=46

package com.tutorial;



public class Main{

    public static void main(String[] args){

        System.out.println("\n++++ * OPERATOR LOGIKA * ++++\n\n");
        // operasi yang bisa dilakukan pada tipe data boolean

        boolean a, b, c;

        System.out.println(" === OR (||) ===");

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);


        System.out.println("\n\n=== AND (&&) ===");
        
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);


        System.out.println("\n\n=== AND (&&) ===");
        
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);


        System.out.println("\n\n=== XOR (^) ===");
        
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);


        System.out.println("\n\n=== NEGASI (!) ===");
        
        a = true;
        c = !a;
        System.out.println(a + " !  = " + c);
        b = false;
        c = !b;
        System.out.println(b + " !  = " + c + "\n\n");
    }

}