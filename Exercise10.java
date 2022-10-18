package com.company;
import java.util.*;

/*MENU driven using switch case*/

public class Exercise10 {
    public static void main(String[] args){
        System.out.println("MENU");
        System.out.println("=====");
        System.out.println("DIV");
        System.out.println("MUL");
        System.out.println("ADD");
        System.out.println("SUB");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter Two Number");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        System.out.println("enter Option");
        String option=sc.nextLine();
        switch (option){
            case "ADD":System.out.println("sum is "+(a+b));
                       break;
            case "MUL":System.out.println("sum is "+(a*b));
                break;
            case "SUB":System.out.println("sum is "+(a-b));
                break;
            case "DIV":System.out.println("sum is "+(a/b));
                break;
                default:System.out.println("Invalid option");
        }

    }
}
