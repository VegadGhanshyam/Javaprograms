package com.company;

/*3rd smallest element*/

public class practice6 {
    public static void main(String[]args){
        int A[]={5,4,7,1,8,6,2};
        int s1,s2,s3;
        s1=Integer.MAX_VALUE;
        s2=Integer.MAX_VALUE;
        s3=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(s1>A[i])
            {
                s3=s2;
                s2=s1;
                s1=A[i];
            }
            else if(s2>A[i])
            {
                s3=s2;
                s2=A[i];
            }
            else if(s3>A[i])
            {
                s3=A[i];
            }
        }
        System.out.println(s3);
    }
}
