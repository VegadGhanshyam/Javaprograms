package com.company;
import java.util.*;

/*Studemt Grade*/

public class Exercise8 {
    public static void main(String[]args){
        System.out.println("Enter 5 subject marks");
        Scanner sc=new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5;
        sub1=sc.nextFloat();
        sub2=sc.nextFloat();
        sub3=sc.nextFloat();
        sub4=sc.nextFloat();
        sub5=sc.nextFloat();
        float avg=(sub1+sub2+sub3+sub4+sub5)/5;
        if(avg>=90){
            System.out.println("grade is A");
        }
        else if(avg>=80 && avg<90){
            System.out.println("grade is B");
        }
        else if(avg>=70 && avg<80){
            System.out.println("grade is c");
        }
        else if(avg<70){
            System.out.println("grade is D");
        }
    }
}
