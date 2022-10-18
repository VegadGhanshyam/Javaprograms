package com.company;
import java.util.*;

/*For loop*/

public class Exercise11 {
    public static void main(String[]args){
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        //Muliplication Table
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        int sum=0;
        for(int l=1;l<=n;l++){
            sum=sum+l;
        }
        System.out.println("sum of "+n+" number is "+sum);

    }
}
