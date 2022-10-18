package com.company;
import java.util.*;
public class Exercise12 {
    public static void main(String[]args){
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
          int  r=n%10;
            n=n/10;
            System.out.println(r);
        }

    }
}
