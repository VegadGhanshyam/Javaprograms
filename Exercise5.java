package com.company;
import java.util.*;
public class Exercise5 {
    public static void main(String[] args){
        System.out.println("Enter a,b,c");
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double r1,r2;
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("root is "+r1+" "+r2);
    }
}
