package com.company;


public class Flower {
    
    private int freshness;
    
    private double length;
   
    private int price;
    
    private String nameOfFlower;
    
    private int MAX_FRESHNESS = 5;
    
    private double MAX_LENGTH = 100;
    
    private int MAX_PRICE = 120;
    
    public int getFreshness(){
        return freshness;
    }
    
    public double getLength(){
        return length;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getNameOfFlower(){
        return nameOfFlower;
    }
    
    public void setFreshness(int f){
        if (f <= MAX_FRESHNESS){
            freshness = f;
        }
    }
    
    public void setLength(double l){
        if (l <= MAX_LENGTH){
            length = l;
        }
    }
   
    public void setPrice(int p){
        if (p <= MAX_PRICE){
            price = p;
        }
    }
    
    public void setNameOfFlower(String fl){
        nameOfFlower = fl;
    }
    
    public Flower(){
        freshness = 5;
        length = 25.5;
        price = 100;
        nameOfFlower = "Hrizantema";
    }
    
    public Flower(int f, double l, int p){
        if (f <= MAX_FRESHNESS) freshness = f;
        if (l <= MAX_LENGTH) length = l;
        if (p <= MAX_PRICE) price = p;
        nameOfFlower = "Hrizantema";
    }
    
    public int bouquetTotalPrice(){
        return 3;
    }
}
