package com.company;

/*overloading*/
public class practiceW3 {
    static int max(int x, int y){
        return x>y?x:y;
    }
    static int max(int x, int y, int z){
        return x>y&&x>z?x:y>x&&y>z?y:z;
    }
    public static void main(String[]args){
        System.out.println(max(7,5));
        System.out.println(max(15,10,8));
    }
}
