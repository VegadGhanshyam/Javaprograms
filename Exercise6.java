package com.company;
import java.util.*;
public class Exercise6 {
    public static void main(String[] args){

        String str="ghanshyam@hotmail.com";
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1,str.length());
        System.out.println(uname);
        System.out.println(domain);
        System.out.println(domain.startsWith("gmail"));
    }
}
