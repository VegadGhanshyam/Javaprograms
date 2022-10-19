package com.company;

public class practice9 {
    public static void matrix(int a[][],int m,int n){

        //print first raw
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //print second column
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<2;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //horizontal diagonal bottom right to top left
        for(int i=m;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

//horizontal diagonal top right to bottom left
        for(int i=0;i<m;i++)
        {
            for(int j=n;j>=0;j--)
            {
                if((i+j)==(n-1))
                    System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        int a[][]={{2,4,5,7},{5,4,7,2},{5,4,8,1},{2,4,6,3}};
        matrix(a,4,4);

    }
}
