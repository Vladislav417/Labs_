package com.company;

public class Word {
    private Letter s[] = new Letter[0];

    Word(){
        this("");
    }
    Word(String s1){
        setValue(s1);
    }


    public void setValue(String s1){
        s  = new Letter[s1.length()];
        for(int i=0; i<s.length; i++)
            s[i] =  new Letter(s1.charAt(i));
    }


    public String getValue(){
        String s1="";
        for(int i=0; i<s.length; i++)
            s1 = s1 + s[i].getValue();
        return s1;
    }
}
