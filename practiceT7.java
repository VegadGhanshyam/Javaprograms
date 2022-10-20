package com.company;
import java.util.Scanner;

/*aritimeticoperation*/

abstract class ArithmeticOperation{
    abstract void perform(int x, int y);
}

class Addition extends ArithmeticOperation{
    void perform(int x, int y){
        System.out.println("sum is "+(x+y));
    }
}
class Multiplication extends ArithmeticOperation{
    void perform(int x, int y){
        System.out.println("sum is "+(x*y));
    }
}
class Division extends ArithmeticOperation{
    void perform(int x, int y){
        System.out.println("sum is "+(x/y));
    }
}
class Substration extends ArithmeticOperation{
    void perform(int x, int y){
        System.out.println("sum is "+(x-y));
    }
}
public class practiceT7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("=====");
        System.out.println("DIV");
        System.out.println("MUL");
        System.out.println("ADD");
        System.out.println("SUB");

        System.out.println("enter Option");
        String option=sc.nextLine();
//        sc.nextLine();
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Addition add=new Addition();
        Multiplication mul=new Multiplication();
        Substration sub=new Substration();
        Division div=new Division();
        switch (option){
            case "ADD": add.perform(x,y);
                break;
            case "MUL": mul.perform(x,y);
                break;
            case "SUB": sub.perform(x,y);
                break;
            case "DIV": div.perform(x,y);
                break;
        }



    }
}