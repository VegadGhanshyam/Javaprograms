package temp1;
import temp.*;

public class world extends Hello {

    public static void main(String[] args) {
        //use method from temp package
        Hello h=new Hello();
        h.fun();

        //use variable from temp package
        h.x=9;
        h.y=7;
        int sum=h.x+h.y;
        System.out.println("sum is "+sum);
    }

}