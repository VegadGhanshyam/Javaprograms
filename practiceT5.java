package com.company;

/*overriding*/
class Tv{
    public void switchOn(){
        System.out.println("Tv is on");
    }
    public void channelChange(){
        System.out.println("channle is changed");
    }
}
class SmartTv extends Tv{
    @Override
    public void switchOn(){
        System.out.println("smart Tv is on");
    }
    @Override
    public void channelChange(){
        System.out.println("smart tv channle is changed");
    }
    public void playMusic(){
        System.out.println("music is on");
    }

}
public class practiceT5 {
    public static void main(String[]args){
        Tv t=new Tv();
        t.switchOn();
        t.channelChange();
        SmartTv s=new SmartTv();
        s.playMusic();
        s.channelChange();
        s.switchOn();
    }
}
