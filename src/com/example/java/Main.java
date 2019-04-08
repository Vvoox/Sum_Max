package com.example.java;

import java.util.Scanner;

public class Main {
        public static long somme_int;
        public static String somme_str;
        public static long somme;
        public static long max = 4194967296L;

        public Main() {
        }

        public static long somme(String a, String b) {
            Long a1 = Long.parseLong(a);
            Long b1 = Long.parseLong(b);

            if (a1 <= max && b1 <= max) {

                somme = a1 + b1;
            }
            else {
                a = a + "L";
                b = b + "L";
                a1 = Long.parseLong(a);
                b1 = Long.parseLong(b);
                somme = a1 + b1;
            }

            return somme;
        }

        public static void main(String[] args) {

            System.out.print("Enter a value : ");
            Scanner aa = new Scanner(System.in);
            String a = aa.nextLine();

            System.out.print("Enter b value : ");
            Scanner bb = new Scanner(System.in);
            String b = bb.nextLine();
            System.out.print("a + b value is : " + somme(a, b));
        }
}



