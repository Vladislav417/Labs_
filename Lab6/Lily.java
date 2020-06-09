package com.company;


public class Lily extends Flower{
    
    public Lily(){
        super();
        setNameOfFlower("Lily");
    }

    public Lily(int f, double l, int p){
        super(f, l, p);
        setNameOfFlower("Lily");
    }
    
    @Override
    public int bouquetTotalPrice(){
        int totalPrice = getPrice();
        return totalPrice;
    }

}
