package com.company;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.FileInputStream;


public class TryResources{

    static void divide()throws Exception{
        File f0=new File("/home/pp-5/Ghanshyam/Text11.txt");
        f0.createNewFile();

        try( FileWriter f2=new FileWriter("/home/pp-5/Ghanshyam/Text11.txt");FileInputStream fi=new FileInputStream("/home/pp-5/Ghanshyam/Text11.txt");)
        {
            f2.write("40 20 10");
            f2.close();
            Scanner sc=new Scanner(fi);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/b);
        }
    }
    public static void main(String[] args){
        try{
            divide();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}


