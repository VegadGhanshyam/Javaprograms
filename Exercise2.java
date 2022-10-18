package com.company;
import java.util.*;
public class Exercise2 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a & b");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("sum is "+c);
        int s=a-b;
        System.out.println("subtract is "+s);
        int m=a*b;
        System.out.println("multiplication is "+m);
        float d=a/b;
        System.out.println("division is "+d);
    }
}
