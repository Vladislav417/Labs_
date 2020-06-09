package com.company;

public class Letter {

    private char c;

    Letter(){
        this((char)0);
    }
    Letter(char d){
        if (isLetter(d))
            setValue(d); else
            setValue((char)0);
    }


    public void setValue(char c1){
        c = c1;
    }


    public char getValue(){
        return c;
    }


    public static boolean isLetter(char c)
    {
        if (c>='a' && c<='z') return true;
        if (c>='A' && c<='Z') return true;
        if (c==(char)39) return true;
        return false;
    }

}
