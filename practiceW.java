package com.company;
import java.util.*;

/*print k pattern*/
public class practiceW {
    public static void main(String[]args){
        System.out.println("Enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0) {
            for (int i = 0; i <= n / 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < n / 2 + 1 - i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.print("*");
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i + 2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
            System.out.println("please enter odd number");
    }
}