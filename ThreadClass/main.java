package ThreadClass;

public class main {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        int i=1;
        while (true){
            System.out.println(i+"world");
            i++;
        }
    }
}