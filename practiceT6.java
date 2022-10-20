package com.company;

/*abstract class*/
abstract class Super{
    void math1(){
        System.out.println("math 1 is printed");}
        abstract void math2();
}
class Sub extends Super{
    void math2(){
        System.out.println("math2 is printed");
    }
}
public class practiceT6 {
    public static void main(String[]args){
        Super s=new Sub();
        s.math1();
        Sub s1=new Sub();
        s.math1();
        s1.math2();
    }
}
