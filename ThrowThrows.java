package com.company;

/*ThrowThrows*/
class Negative extends Exception {
    public String toString() {
        return " negative length or Highth";
    }
}
public class ThrowThrows {
    static int area(int l,int h)throws Exception{
        if(l<0 || h<0)
            throw new Negative();
        return l*h;
    }
    static void math1()throws Exception{
        System.out.println(area(10,-20));
    }

    public static void main(String[] args)throws Exception {
        try{
            math1();
        } catch (Exception e){
            System.out.println(e);}
    }
}
