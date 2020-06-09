package com.company;
import java.util.*;


public class Main {


        public static void main(String[] args) {
            // write your code here
            Auto[] masauto = new Auto[3];

            masauto[0] = new Auto( "Audi", "red", "C" , "max", 1.5, 1000);
            masauto[1] = new Auto( "BMW", "black", "C" , "max", 2,3000);
            masauto[2] = new Auto( "Mercedes", "blue", "C" , "min", 1,5000);
            /* Сортировка массива */
            Arrays.sort(masauto);

            /* Печать отсортированных значений */

            for(int i = 0; i < masauto.length; i++)
            {
                System.out.println(masauto[i].Name + " " +
                        masauto[i].Color + " " + masauto[i].Cl + " " + masauto[i].Type + " " + masauto[i].Weight);
            }

        }
    }


