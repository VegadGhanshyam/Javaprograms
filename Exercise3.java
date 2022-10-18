package com.company;

/* 1) Make example of every kind of typecasting  */

public class Exercise3 {
    public static void main(String[] args){
        byte b=2;
        short s=10;
        int i=14;
        long d=25;
        float f=14.5f;
        double  l=25.3d;
        boolean bl=true;
        char c='a';


        //widening
        f=i;
        System.out.println(f);
        //narrowing
        i=(int)f;
        System.out.println(i);
        //widening
        i=s;
        System.out.println(i);
        //narrowing
        s=(short)i;
        System.out.println(s);

    }
}
