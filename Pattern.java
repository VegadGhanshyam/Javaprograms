import java.util.*;

/*regular expression*/
public class Pattern {
    static void showList(String ...S){
        {
            for(int i=0;i<S.length;i++)
                System.out.println(i+1+"."+S[i]);
        }
    }
    public static void main(String[] args) {
        int alpha=65;
        System.out.println("Enter the number of raw");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the starting number of list");
        int l=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            System.out.print(l++ +".");
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+j)+"");
            }
            System.out.println("@gmail.com");
        }
    }
}
