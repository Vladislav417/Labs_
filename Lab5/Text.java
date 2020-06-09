package com.company;

import java.util.Arrays;

public class Text {
    private Sentence[] a = new Sentence[0];

    Text(){
        this("");
    }
    Text(String s)
    {
        s = s.trim();
        s = s.replaceAll("\t+", " ");
        s = s.replaceAll(" +", " ");
        String buf="";
        for(int i=0; i<s.length();i++)
            if (s.charAt(i)=='.' || s.charAt(i)=='!' || s.charAt(i)=='?')
            {
                for(;i<s.length() && (s.charAt(i)=='.' || s.charAt(i)=='!' || s.charAt(i)=='?');i++)
                    buf = buf + s.charAt(i);

                if (buf.length()>0)
                {
                    add(new Sentence(buf));
                    buf="";
                }
                i--;
            } else
                buf=buf+s.charAt(i);

        if (buf.length()>0)  add(new Sentence(buf));
    }


    public void setElement(String s, int i){
        int j =0;
        while (i>=a[j].getSize()){
            i-=a[j].getSize();
            j++;
        }

        a[j].setElement(s, i);

    }

    public int getSentNum(){
        return a.length;
    }

    public void add(Sentence b)
    {
        a = Arrays.copyOf(a, a.length+1);
        a[a.length-1]=b;
    }


    public int getSize()
    {
        int rez  = 0;
        for (int i = 0; i < a.length; i++)
            rez+=a[i].getSize();
        return rez;

    }

    public int getSentSize(int i){
        return a[i].getSize();
    }

    public String getWord(int i){
        int j =0;
        while (i>=a[j].getSize()){
            i-=a[j].getSize();
            j++;
        }

        if (Letter.isLetter(a[j].getElement(i).charAt(0))) return a[j].getElement(i);
        else return new String("");

    }
    public String getElement(int i)
    {
        return a[i].getSentence();
    }
    public String getText(){
        String s = "";
        for(int i=0; i<a.length;i++)
            s = s + a[i].getSentence()+"\n";
        return s;
    }

    public String getSWord(int i, int j){
        return a[i].getElement(j);
    }

    public boolean isWord(int i,int j){
        if (a[i].isWord(j)) return true;
        else return false;

    }

    public void task(){
        boolean q=false;
        int k = 0;
        for (int i = 0; i < getSentNum(); i++) {

            for (int j = 0; j < getSentSize(i); j++) {
                q= false;
                for (int m = 0; m < getSentSize(i); m++){
                    if (getSWord(i,j).equals(getSWord(i,m))&&(j!=m)&&(isWord(i,j))&&isWord(i,m)){
                        q=true; break;
                    }
                }if (q==true)break;
            }
            if(q) k++;
        }
        System.out.println(k);
    }
}
