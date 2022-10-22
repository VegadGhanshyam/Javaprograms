
public class TryCatch {

    public static void main(String[] args) {
        int a,b,c;
        try{
            a=10;b=2;
            c=a/b;
            System.out.println(c);}
        catch(ArithmeticException e){
            System.out.println(e);
        }



        try{
            int A[]={4,4,8,1,2,4,5,7};
            int C=A[0]/A[1];
            System.out.println("Division is "+C);
            System.out.println(A[10]); }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("enter vaild index");
        }

    }

}


