package com.company;

import java.util.Arrays;

public class Sentence {
    private Object[] a = new Object[0];

    Sentence()
    {
        this("");
    }
    Sentence(String s)
    {
        s = s.trim();
        String buf="";
        for(int i=0; i<s.length();i++)
            if (Letter.isLetter(s.charAt(i)))
                buf=buf+s.charAt(i); else
            {
                if (buf.length()>0)
                {
                    add(new Word(buf));
                    buf="";
                }
                add(new Symbol(s.charAt(i)));
            }
        if (buf.length()>0) add(new Word(buf));
    }

    public void setElement(String s, int i){
        if (a[i].getClass() == Word.class) ((Word)a[i]).setValue(s);
    }

    private void add(Symbol b) {
        a  = Arrays.copyOf(a, a.length+1);
        a[a.length-1] = b;

    }
    public void add(Word b)
    {
        a  = Arrays.copyOf(a, a.length+1);
        a[a.length-1] = b;
    }

    public int getSize()
    {
        return a.length;
    }
    public String getElement(int i)
    {
        if (a[i].getClass()==Word.class) return ((Word) a[i]).getValue(); else
            return ""+((Symbol) a[i]).getValue();
    }

    public boolean isWord (int i){
        if (a[i] instanceof Word)
            return true;
        else return false;
    }
    public String getSentence(){
        String s = "";
        for (int i = 0; i < a.length; i++)
            s = s + getElement(i);
        return s;
    }
}
