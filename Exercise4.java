package com.company;
import java.util.*;
public class Exercise4 {
    public static void main(String[] args){
        System.out.println("Enter Hight & Base");
        Scanner sc=new Scanner(System.in);
        int h,b;
        h=sc.nextInt();
        b=sc.nextInt();
        double area=0.5*h*b;
        System.out.println("Area is "+area);

    }
}
