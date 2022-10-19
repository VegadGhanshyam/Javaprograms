package com.company;

/*prime number and GCD*/

public class practiceW2 {
    static   boolean prime(int n){
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static int gcd(int x, int y){
        while(x!=y){
            if(x>y)  x=x-y;
            else y=y-x;
        }
        return x;
    }
    public static void main(String[]args){
        System.out.println(prime(11));
        System.out.println(gcd(15,18));
    }
}
