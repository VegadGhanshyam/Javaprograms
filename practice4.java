package com.company;

/*Multiplication of Two matrix*/

public class practice4 {
    public static void main(String[]args){
        int A[][]={{5,4,7},{4,5,1},{5,4,9}};
        int B[][]={{4,8,7},{5,1,4},{6,4,3}};
        int c[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]=c[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int x[]:c)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
