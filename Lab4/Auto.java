package com.company;

/*
C11 = 2 Визначити клас автомобіль, який складається як мінімум з 5-и полів.

 */
public class Auto implements Comparable {
    String Name, Color, Cl, Type;
    double Weight, Price;

    public Auto(String name, String color, String cl, String type, double weight, double price) {
        this.Name = name;
        this.Color = color;
        this.Cl = cl;
        this.Type = type;
        this.Weight = weight;
        this.Price = price;

    }


    @Override
    public int compareTo(Object obj) {


            Auto tmp = (Auto)obj;
            if(this.Weight < tmp.Weight)
            {
                /* текущее меньше полученного */
                return -1;
            }
            else if(this.Weight > tmp.Weight)
            {
                /* текущее больше полученного */
                return 1;
            }
            /* текущее равно полученному */
            return 0;
        }

    }
