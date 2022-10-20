package com.company;

/*overriding*/
class Bank{
    public  int rateOfInterest(){
        return 8;
    }
}
class SBI extends Bank{
    public  int rateOfInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    public int rateOfInterest(){
        return 9;
    }
}
public class practiceT1 {

    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println(b.rateOfInterest());
        ICICI i=new ICICI();
        System.out.println(i.rateOfInterest());

    }
}
