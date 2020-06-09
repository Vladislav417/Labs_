package com.company;


public class Rose extends Flower{
    
    public Rose(){
        super();
        setNameOfFlower("Rose");
    }

    public Rose(int f, double l, int p){
        super(f, l, p);
        setNameOfFlower("Rose");
    }
    
    @Override
    public int bouquetTotalPrice(){
        int totalPrice = getPrice();
        return totalPrice;
    }

}
