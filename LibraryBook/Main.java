package LibraryBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actualdate,actualmonth,actualyear;

        System.out.println("Enter the Actual date of book issue");
        actualdate=sc.nextInt();
        actualmonth=sc.nextInt();
        actualyear=sc.nextInt();
        System.out.println("Actual return date is:"+actualdate+"/"+actualmonth+"/"+actualyear);

        int rdate,rmonth,ryear;

        System.out.println("Enter the return date of book issue");
        rdate=sc.nextInt();
        rmonth=sc.nextInt();
        ryear=sc.nextInt();
        System.out.println("Due return date is:"+rdate+"/"+rmonth+"/"+ryear);

        int fine=0;
        if (ryear < actualyear) {
            fine = 0;
        } else if (ryear> actualyear) {
            fine = 10_000;
        } else if (rmonth < actualmonth) {
            fine = 0;
        } else if (rmonth > actualmonth) {
            fine = 500 * (rmonth - actualmonth);
        } else if (rdate > actualdate) {
            fine = 15 * (rdate - actualdate);
        } else {
            fine = 0;
        }
        System.out.println(fine);
    }

}


