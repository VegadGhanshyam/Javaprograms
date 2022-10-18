package com.company;
import java.util.*;

/*Find day using Switch case*/

public class Exercise9 {
    public static void main(String[] args){
        System.out.println("Enter a day");
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        switch (day){
            case 1:System.out.println("Monday");
                   break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
                default:System.out.println("Invalid Date");

        }

    }
}
