package Synchroniz;


class MyThread2 extends Thread{
    MyData d;


    public MyThread2(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Welcome");
    }

}