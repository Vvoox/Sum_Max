package com.example.java;

import java.util.*;

public class Main {
    public static int size1;
    public static int size2;
    public static int[] somme;

    public static void main (String[] args) {

        System.out.println("Sum of 2 tables , you should enter size of table 1 and it values , and also for table 2");
        System.out.print("The size of table 1 : ");
        Scanner sz1 = new Scanner(System.in);
         size1 = sz1.nextInt();
        System.out.print("The size of table 2 : ");
        Scanner sz2 = new Scanner(System.in);
         size2 = sz1.nextInt();
        int tab1[] = new int[size1];
        int tab2[] = new int[size2];
        int cn1 =1 , cn2=1;

        for (int i =0 ; i<size1 ; i++){

            System.out.print("Table 1 : value number "+cn1+" is : ");
            Scanner vl=new Scanner(System.in);
            tab1[i]=vl.nextInt();
            cn1++;
        }
        for (int j=0 ; j<size2 ; j++) {

            System.out.print("Table 2 : value number  " + cn2 + " is : ");
            Scanner vl = new Scanner(System.in);
            tab2[j] = vl.nextInt();
            cn2++;
        }
        System.out.println("The sum of max 2 number in tab1&tab2 : "+ ajouter(tab1,tab2));
        ajouter1(tab1,tab2);
        System.out.print("The sum of each single case with else in other table is : ");
        for (int i=0 ; i<somme.length ; i++){
            System.out.print(somme[i]+" ");
        }
    }

   public static int ajouter(int[] tab1 , int[] tab2){
       int max1=0 , max2=0;

        for(int i =0 ; i<size1; i++){

            for(int j =0 ; j<size2 ; j++){

                if(tab1[i] >= tab1[j] && i!=j){

                    if(max1<tab1[i]){ max1=tab1[i];}

                    else break;

                }
                else {

                    if(max1<tab1[j]){ max1=tab1[j]; }

                    else break;
            }
        }
       for( i=0 ; i<size2 ; i++) {

           for (int j = 0; j < size2; j++) {

               if (tab2[i] >= tab2[j] && i != j) {

                   if (max2 < tab2[i]) {
                       max2 = tab2[i];
                   } else break;

               } else {
                   if (max2 < tab2[j]) {
                       max2 = tab2[j];
                   } else break;
               }

           }
       }

       }
       int somme= max1+max2;

       return somme;
    }

    public static int[] ajouter1(int[] tab1 , int[] tab2){


        if(size1>=size2){
            somme = new int[size1];
            for(int i=0 ; i<size1 ; i++){
                somme[i]=tab1[i]+tab2[i];
               // System.out.print(somme[i]+"\t");

            }
        }
        
        else {
            somme = new int[size2];
            for(int i=0 ; i<size2 ; i++){
                somme[i]=tab1[i]+tab2[i];
                //System.out.print(somme[i]+"\t");

            }
        }
        return somme;




    }
}

