package com.company;


public class Bouquet {
    
    public static String printFlowerParametrs(Flower f){
        return "Flower \"" + f.getNameOfFlower() + "\" cost " + f.getPrice() + " UAH" + ", her length is " + f.getLength() + " cm" + ", her freshness is " + f.getFreshness() + " days.";
    }
   
    public static void outputArray(Flower[] bouquet){
        for (int i = 0; i < bouquet.length; i++){
            System.out.println(printFlowerParametrs(bouquet[i]));
        }
    }
   
    public static Flower searchByFlowerLength(Flower [] bouquet, double length1,double length2){
        Flower result = bouquet[0];
        for (int i = 0; i < bouquet.length; i++){
            if (bouquet[i].getLength() >= length1 && bouquet[i].getLength() <= length2)
                result = bouquet[i];
        }
        return result;
    }
    /
    public static int totalBouquetPrice(Flower [] bouquet) {
        int totalPrice = 0;
        for (int i = 0; i < bouquet.length; i++) {
            totalPrice += bouquet[i].getPrice();
        }
        System.out.println("Total bouquet price: " + totalPrice + " UAH");
        return totalPrice;
    }
    
    public static void sortByFreshness(Flower[] bouquet, int k) {
        System.out.println("Bouquet is sorted by decrision of freshness:");
        Flower buf;
        for (int i = 0; i <= k - 1; i++) {
            for (int j = 0; j <= k - 1; j++) {
                if (bouquet[i].getFreshness() > bouquet[j].getFreshness()) {
                    buf = bouquet[i];
                    bouquet[i] = bouquet[j];
                    bouquet[j] = buf;
                }
            }
        }
    }
    /*
     Основной класс.
     */
    public static void main(String[] args) {
        final int count = 7;
        
        Flower bouquet[] = new Flower[count];
        bouquet[0] = new Rose(3,50.5,80);
        bouquet[1] = new Rose(4,49.6,80);
        bouquet[2] = new Rose(3,48.0,80);
        bouquet[3] = new Orchid(2,28.3,120);
        bouquet[4] = new Orchid(2,27.9,110);
        bouquet[5] = new Lily(1,15.4,50);
        bouquet[6] = new Rose();
        
        System.out.println("Bouqeot consist of:");
        outputArray(bouquet);
        
        System.out.println();
        sortByFreshness(bouquet, count);
        outputArray(bouquet);
       
        System.out.println();
        System.out.println("Serched Flower by length:");
        System.out.println(printFlowerParametrs(searchByFlowerLength(bouquet, 27.0, 28.0)));
        System.out.println();
        totalBouquetPrice(bouquet);
    }
}
