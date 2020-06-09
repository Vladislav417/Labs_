package com.company;

public class Symbol {

    private char c;

    Symbol(){
        this(' ');
    }
    Symbol(char d){
        setValue(d);
    }


    public void setValue(char c1){
        c = c1;
    }


    public char getValue(){
        return c;
    }
}
