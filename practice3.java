package com.company;

/*Adition Of two Matrix*/

public class practice3 {
    public static void main(String[]args){
        int A[][]={{1,4,5,2},{5,4,5,7},{7,8,4,5}};
        int B[][]={{2,5,4,7},{5,4,9,2},{4,7,5,1}};
        int C[][]= new int[3][4];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]= A[i][j] + B[i][j];
            }
        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
