package com.company;

/*overriding*/
class Vehical{
    public int number;
    public static void sound(int number){
        System.out.println("vechical sound " +number);
    }
}
class Bike extends Vehical{
    public static void sound(int number){
        System.out.println("bike sound "+number);
    }
}

public class practiceT4 {
    public static void main(String[]args){
        Vehical v=new Vehical();
        Bike b=new Bike();
        b.sound(1234);
        v.sound(5471);
    }

}
