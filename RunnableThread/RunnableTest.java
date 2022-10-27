package RunnableThread;

public class RunnableTest implements Runnable {
    public void run(){
        int i = 1;
        while (true) {
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
    public static void main(String[] args) {

        RunnableTest r = new RunnableTest();
        Thread t = new Thread(r);
        t.start();
        int i = 1;
        while (true) {
            System.out.println("World");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}
